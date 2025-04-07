grammar LangX;

prog: ( stat? NEWLINE )* ;

stat:   PRINT ID   		    #print
	  | READ ID               #read
	  | ID '=' expr0		#assign
;

expr0:  expr1			#single0
      | expr1 ADD expr1	#add
      | expr1 SUB expr1 #sub
;

expr1:  expr2			    #single1
      | expr2 MULT expr2	#mult
      | expr2 DIV expr2     #div
;

expr2: ID               #idd
       | INT			#int
       | REAL			#real
       | TOINT expr2		#toint
       | TOREAL expr2		#toreal
       | '(' expr0 ')'		#par
;

PRINT: 'print';

READ: 'read';

TOINT: '(int)';

TOREAL: '(real)';

ID: ('a'..'z'|'A'..'Z')+;

REAL: '0'..'9'+'.''0'..'9'+;

INT: '0'..'9'+;

ADD: '+';

SUB: '-';

MULT: '*';

DIV: '/' ;

NEWLINE: '\r'? '\n';

WS: (' '|'\t')+ { skip(); };
