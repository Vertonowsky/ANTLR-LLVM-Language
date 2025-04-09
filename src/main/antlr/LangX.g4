grammar LangX;

// Parser rules

program : statement* EOF;

statement
    : variableDeclaration ';'
    | assignment ';'
    | ioStatement ';'
    | expressionStatement ';'
    ;

variableDeclaration
    : type ID ('=' expression)?
    ;

assignment
    : ID '=' expression
    | ID '[' expression ']' '=' expression
    | ID '[' expression ']' '[' expression ']' '=' expression
    ;

ioStatement
    : READ '(' ID ')'
    | PRINT '(' expression ')'
    ;

expressionStatement
    : expression
    ;

expression
    : '(' expression ')'
    | expression op=(MUL | DIV) expression
    | expression op=(ADD | SUB) expression
    | value
    ;

value
    : INT
    | FLOAT
    | STRING
    | BOOL
    | ID
    ;

type
    : 'int'
    | 'float'        // może jako alias Float64
    | 'Float32'
    | 'Float64'
    | 'bool'
    | 'string'
    ;


// Lexer rules

ADD : '+' ;
SUB : '-' ;
MUL : '*' ;
DIV : '/' ;

AND : 'AND' ;
OR  : 'OR' ;
XOR : 'XOR' ;
NEG : 'NEG' ;

READ  : 'read' ;
PRINT : 'print' ;

INT    : '-'? [0-9]+ ;
FLOAT  : '-'? [0-9]+ '.' [0-9]+ ;
STRING : '"' (~["\\] | '\\' .)* '"' ;

BOOL : 'true' | 'false' ;

ID : [a-zA-Z_][a-zA-Z0-9_]* ;

WS : [ \t\r\n]+ -> skip ;