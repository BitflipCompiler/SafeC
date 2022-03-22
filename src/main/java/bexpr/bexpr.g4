grammar bexpr;

bexpr: BOOLVAL #BoolValNode| bterm #BexprNode;

bterm: partbool relop partbool #BTermNode| bpart #BPartNode;

bpart: bpiece bop bpiece #BpartNode| bpiece #BPieceNode;

bpiece: NOT bexpr #NotNode| blast #BlastNode;

blast: LPAR bexpr RPAR #ParexprNode| ID #IdBlastNode;

aexpr:
    term ((PLUS | MINUS)  term)* #TermNode;
term:
    part ((TIMES | DIVISION | MOD) part)* #PartNode;
part:
    LPAR aexpr RPAR #PartAexprNode| ID #IdPartNode| numberval #NumberValNode;

partbool: (part | BOOLVAL) #PartBoolNode;

numberval:
      NUMVAL #NumValNode
    | PI #PiNode;

bop:
      AND #AndNode
    | OR #OrNode;

relop :
      EQ #EqualNode
    | NEQ #NotEqualNode
    | GEQ #GreaterEqualNode
    | LEQ #LesserEqualNode
    | LESS #LesserNode
    | GREATER #GreaterNode;

fragment LOWERCASE:[a-z];
fragment UPPERCASE:[A-Z];
fragment NUMBER:('0'..'9');

BOOLVAL: 'true' | 'false';
NUMVAL: NUMBER+(DOT NUMBER+)?;
DOT: '.';
NOT: '!';
AND: '&&';
OR: '||';
ID: LOWERCASE(LOWERCASE | UPPERCASE | NUMBER)*;
LPAR: '(';
RPAR: ')';
PLUS: '+';
MINUS: '-';
TIMES: '*';
DIVISION: '/';
MOD: '%';
PI: 'pi';
LEQ: '<=';
GEQ: '>=';
EQ: '==';
NEQ: '!=';
LESS: '<';
GREATER: '>';

//SKIPS
WS : [ \t\r\n\f]+ -> skip;
COMMENT : '//' ~[\r\n]* -> skip;