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
    ;

ioStatement
    : READ '(' ID ')'
    | PRINT '(' expression ')'
    ;

expressionStatement
    : expression
    ;

expression
    : arithmeticExpression
    | STRING
    | ID
    ;

arithmeticExpression
    : '(' arithmeticExpression ')'
    | arithmeticExpression op=(MUL | DIV) arithmeticExpression
    | arithmeticExpression op=(ADD | SUB) arithmeticExpression
    | INT
    | FLOAT
    | ID
    ;

type
    : 'int'
    | 'float'        // alias for Float64
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

INT    : [0-9]+ ;
FLOAT  : [0-9]+ '.' [0-9]+ ;
STRING : '"' (~["\\] | '\\' .)* '"' ;

ID : [a-zA-Z_][a-zA-Z0-9_]* ;

WS : [ \t\r\n]+ -> skip ;
