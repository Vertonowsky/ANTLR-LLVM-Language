grammar Wolacz;

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
    | ID
    ;

type
    : 'int'
    | 'float'        // może jako alias Float64
    | 'Float32'
    | 'Float64'
    | 'string'
    ;


// Lexer rules

ADD : '+' ;
SUB : '-' ;
MUL : '*' ;
DIV : '/' ;

READ  : 'read' ;
PRINT : 'print' ;

INT    : '-'? [0-9]+ ;
FLOAT  : '-'? [0-9]+ '.' [0-9]+ ;
STRING : '"' (~["\\] | '\\' .)* '"' ;

ID : [a-zA-Z_][a-zA-Z0-9_]* ;

WS : [ \t\r\n]+ -> skip ;