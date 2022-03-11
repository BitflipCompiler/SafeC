grammar grammar_v2;

prog: declarations commands;

declarations:
       declaration declarations
      | ;

commands:
      command commands
    | ;

declaration:
     safedeclaration
    | reassign
    | funcdcl;

safedeclaration:
      SAFETY (BLANK)* (vdcl | vdclassign) SEMI;
reassign: (BLANK)* vassign SEMI;
params:
      vdcl (BLANK)*(COMMA (BLANK)* vdcl)*;
block:
      LBRACE (safedeclaration | reassign | command )* RBRACE;
caseblock:
      (safedeclaration | command)*(BREAK)?;
vdcl:
      numdecl
    | chardecl
    | stringdecl
    | booldecl;
vassign:
      numassignment
    | charassignment
    | stringassignment
    | boolassignment;
vdclassign:
      numdclassign
    | chardclassign
    | stringdclassign
    | booldclassign;
command:
      ctrlstruct
    | funccalls ;
funccalls:
      ID LPAR (callparams)? RPAR SEMI;
funcdcl:
      ID LPAR (params)? RPAR block;
callparams:
      vals (BLANK)*(COMMA (BLANK)* vals)*;
ctrlstruct:
        selective
      | iterative;
iterative:
        FORSTMT LPAR forparams RPAR block
      | WHILESTMT LPAR bexpr RPAR block  ;

selective:
        IFSTMT iflogic block
      | SWITCHSTMT LPAR ID RPAR LBRACE (case)* defcase RBRACE;
iflogic:
        LPAR bexpr RPAR;
case:
        CASE (BLANK) vals (BLANK)* COLON caseblock;
defcase:
        DEFAULT COLON caseblock;
forparams:
      numdclassign (BLANK)* SEMI (BLANK)* bexpr (BLANK)* SEMI (BLANK)* numassignment;
boolassignment:
      ID(BLANK)* ASSIGN (BLANK)* bexpr;
booldclassign:
      BOOLDCL BLANK ID (BLANK)* ASSIGN (BLANK)* bexpr;
booldecl:
      BOOLDCL BLANK ID (BLANK)*;
numassignment:
     ID(BLANK)* ASSIGN (BLANK)* aexpr;
numdclassign:
      NUMDCL BLANK ID (BLANK)* ASSIGN (BLANK)* aexpr;
numdecl:
      NUMDCL BLANK ID(BLANK)*;
charassignment:
     ID(BLANK)* ASSIGN (BLANK)* CHARVAL;
chardclassign:
      CHARDCL BLANK ID (BLANK)* ASSIGN (BLANK)* CHARVAL;
chardecl:
      CHARDCL BLANK ID (BLANK)*;
stringassignment:
      ID(BLANK)* ASSIGN (BLANK)* STRVAL;
stringdclassign:
      STRDCL BLANK ID (BLANK)* ASSIGN (BLANK)* STRVAL;
stringdecl:
      STRDCL BLANK ID (BLANK)*;

bexpr:
      bexpr (BLANK)* bop (BLANK)* bexpr
    | BOOLVAL
    | NOT (BLANK)* bexpr
    | (aexpr | BOOLVAL) (BLANK)* relop (BLANK)*  (aexpr | BOOLVAL);

aexpr:
      aexpr (BLANK)* aop (BLANK)* aexpr
    | numberval
    | ID;
bop:
      AND
    | OR;
aop:
      PLUS
    | MINUS
    | TIMES
    | DIVISION
    | MOD;
vals:
      numberval
    | CHARVAL
    | STRVAL
    | BOOLVAL
    | ID;

numberval:
      NUMVAL
    | PI;
relop :
      EQ
    | NEQ
    | GEQ
    | LEQ
    | LESS
    | GREATER ;

//Fragments
fragment LOWERCASE: [a-z];
fragment UPPERCASE: [A-Z];


// Token specification
WHILESTMT: 'while';
FORSTMT: 'for';
IFSTMT: 'if';
SWITCHSTMT: 'switch';
CASE: 'case';
DEFAULT: 'default';
NUMDCL: 'number';
STRDCL: 'string';
CHARDCL: 'char';
BOOLDCL: 'boolean';
BREAK: 'break'SEMI;
BLANK: (' ')+;
BOOLVAL: 'true' | 'false';
ID: (LOWERCASE(LOWERCASE | UPPERCASE | ('0'..'9'))*)*;
SAFETY: HASHTAG('1'..'9')('0'..'9')*;
NUMVAL: ('0'..'9')+(DOT('0'..'9')+)?;
CHARVAL: SINGLEQOUTE[a-zA-Z0-9]SINGLEQOUTE;
STRVAL: DOUBLEQOUTE[a-zA-Z0-9]+DOUBLEQOUTE;
PLUS: '+';
MINUS: '-';
TIMES: '*';
DIVISION: '/';
POW: 'pow';
SQUARE: 'sqrt';
MOD: '%';
PI: 'pi';
LPAR: '(';
RPAR: ')';
LBRACE: '{';
RBRACE: '}';
DOT: '.';
COMMA: ',';
COLON: ':';
SEMI: ';';
SINGLEQOUTE: '\'';
DOUBLEQOUTE: '"';
ASSIGN: '=';
LEQ: '<=';
GEQ: '>=';
EQ: '==';
NEQ: '!=';
LESS: '<';
GREATER: '>';
NOT: '!';
AND: '&&';
OR: '||';
HASHTAG: '#';
WS : [ \t\r\n\f]+ -> channel(HIDDEN);