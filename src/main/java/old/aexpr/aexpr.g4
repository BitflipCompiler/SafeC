grammar aexpr;

aexpr:
    term ((PLUS | MINUS)  term)* #TermNode;
term:
    part ((TIMES | DIVISION | MOD) part)* #PartNode;
part:
    LPAR aexpr RPAR #PartAexprNode| ID #IdPartNode| numberval #NumberValNode;

numberval:
      NUMVAL #NumValNode
    | PI #PiNode;

//Fragments
fragment LOWERCASE:[a-z];
fragment UPPERCASE:[A-Z];
fragment NUMBER:('0'..'9');

//Tokens
PLUS: '+';
MINUS: '-';
TIMES: '*';
DIVISION: '/';
MOD: '%';
LPAR: '(';
RPAR: ')';
ID: LOWERCASE(LOWERCASE | UPPERCASE | NUMBER)*;
NUMVAL: NUMBER+(DOT NUMBER+)?;
DOT: '.';
PI: 'pi';

//Skip
WS : [ \t\r\n\f]+ -> skip;
COMMENT : '//' ~[\r\n]* -> skip;