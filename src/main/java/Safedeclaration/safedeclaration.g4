grammar safedeclaration;

safedeclaration:
      SAFETY (vdcl | vdclassign);
vdcl:
      numdecl #NumVDcl
    | chardecl #CharVDcl
    | stringdecl #StringVDcl
    | booldecl #BoolVDcl;

vdclassign:
      numdclassign #NumVDclAssign
    | chardclassign #CharVDclAssign
    | stringdclassign #StringVDclAssign
    | booldclassign #BoolVDclAssign;

//DECLARATIONS
numdecl:
      NUMDCL ID #NumDecl;
booldecl:
      BOOLDCL ID #BoolDecl;
chardecl:
      CHARDCL ID #CharDecl;
stringdecl:
      STRDCL ID #StringDecl;

//DCL + ASSIGN
numdclassign:
      numdecl ASSIGN aexpr #NumDclAssign;
chardclassign:
      chardecl ASSIGN CHARVAL #CharDclAssign;
stringdclassign:
      stringdecl ASSIGN STRVAL #StringDclAssign;
booldclassign:
      booldecl ASSIGN bexpr #BoolDclAssign;

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

SAFETY: HASHTAG('1'..'9')NUMBER*;
BOOLVAL: 'true' | 'false';
NUMVAL: NUMBER+(DOT NUMBER+)?;
DOT: '.';
NOT: '!';
AND: '&&';
OR: '||';
NUMDCL: 'number';
CHARDCL: 'char';
STRDCL: 'string';
BOOLDCL: 'boolean';
CHARVAL: SINGLEQOUTE[a-zA-Z0-9]SINGLEQOUTE;
STRVAL: DOUBLEQOUTE[a-zA-Z0-9]+DOUBLEQOUTE;
ID: LOWERCASE(LOWERCASE | UPPERCASE | NUMBER)*;
SINGLEQOUTE: '\'';
DOUBLEQOUTE: '"';
ASSIGN: '=';
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
HASHTAG: '#';


//SKIPS
WS : [ \t\r\n\f]+ -> skip;
COMMENT : '//' ~[\r\n]* -> skip;