grammar Wolacz;

program: block;

block: ( (operation|function)? NEWLINE )*;

operation:  REPEAT repetitions ':' block ENDREPEAT	#repeat
            | IF cond ':' ifblock ENDIF             #if
            | WRITE '(' ID ')' 		                #write
	        | ID '=' expr0		                    #assign
	        | READ '(' ID ')'   		            #read
            ;

repetitions: repvalue
;

repvalue: ID    #id3
	    | INT   #int2
	    ;

ifblock: block
;

cond: ID '==' INT
;

expr0:  expr1			#single0
      | expr1 ADD expr1	#add
      | boolExpr0       #boolexpr
;

expr1:  expr2			    #single1
      | STRING              #string
      | expr2 MULT expr2	#mult
;

expr2:  expr3			#single2
      | expr3 SUB expr3	#sub
;

expr3:  expr4			#single3
      | expr4 DIV expr4	#div
;

expr4:   INT			    #int
       | FLOAT			    #float
       | ID                 #id1
       | arrayExpr          #array
       | TOINT expr4		#toint
       | TOFLOAT expr4		#tofloat
       | funccall   		#functioncall
       | '(' expr0 ')'		#par
;

funccall: ID '(' (expr4 (',' expr4)*)? ')'
;

boolExpr0: boolExpr1                #singlebool0
         | boolExpr1 AND boolExpr1  #and
;

boolExpr1: boolExpr2                #singlebool1
         | boolExpr2 OR boolExpr2   #or
;

boolExpr2: boolExpr3                #singlebool2
         | boolExpr3 XOR boolExpr3  #xor
;

boolExpr3: boolExpr4                #singlebool3
         | NEG boolExpr4            #neg
;

boolExpr4: BOOL                 #bool
         | ID                   #id2
         | '(' boolExpr0 ')'    #boolpar
;

arrayExpr:  '[' INT (',' INT)* ']'      #intarray
          | '[' FLOAT (',' FLOAT)* ']'  #floatarray
    ;

function: FUNCTION fname  '(' fparam '):' fblock NEWLINE ENDFUNCTION
;

fname: FTYPE ID
;

fparam: (FTYPE ID (',' FTYPE ID)* )?
;

fblock: ( operation? NEWLINE )* 'return' ID
;



TOINT: '(int)';
TOFLOAT: '(float)';
FTYPE: 'int' | 'float' | 'bool';
WRITE: 'write';
READ: 'read';
FUNCTION: 'function';
ENDFUNCTION:	'endfunction';
REPEAT: 'repeat';
ENDREPEAT: 'endrepeat';
IF:	'if';
ENDIF:	'endif';
STRING :  '"' ( ~('\\'|'"') )* '"';
BOOL: 'true' | 'false';
ID: ('a'..'z'|'A'..'Z')+;
INT: '0'..'9'+;
FLOAT:  '0'..'9'+ '.' '0'..'9'+;
ADD: '+';
MULT: '*';
DIV: '/';
SUB: '-';

AND : '&&';
OR : '||';
XOR : '^';
NEG : '!';

NEWLINE: '\r'? '\n';
WS: (' '|'\t')+ { skip(); };