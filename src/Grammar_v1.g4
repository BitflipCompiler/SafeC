grammar Grammar_v1;


prog: declarations+ commands+ ;

declarations: declaration SEMI declarations
    | ;
declaration: SAFETY vardcl
    | funcdcl;
vardcl: vdcl
    | vdclAssign;
funcdcl: ID LPAR params RPAR LBRACE block RBRACE;
params: (vardcl COMMA)* vardcl
    | ;
block: LBRACE commands* RBRACE
    | ;
vdcl: NUMDCL
    | CHARDCL
    | STRDCL
    | BOOLDCL;
vdclAssign: numDclAssign
    | charDclAssign
    | stringDclAssign
    | boolDclAssign;
numDcl: NUMDCL ID;
charDcl: CHARDCL ID;
stringDcl: STRDCL ID;
boolDcl: BOOLDCL ID;
numDclAssign: NUMDCL ASSIGN aExpr;
charDclAssign: CHARDCL ASSIGN SINGLEQOUTE CHARVAL SINGLEQOUTE;
stringDclAssign: STRDCL ASSIGN DOUBLEQOUTE STRVAL DOUBLEQOUTE;
boolDclAssign: BOOLDCL ASSIGN bExpr;
aExpr: aExpr aOp aExpr
    | NUMVAL;
bExpr: bExpr bOp bExpr
    | BOOLVAL
    | NOT bExpr
    | aExpr relOp aExpr;
boolVal: TRUE
    | FALSE;
aOp: PLUS
    | MINUS
    | TIMES
    | DIVISION
    | MOD ;
bOp: AND
    | OR;
relOp: EQ
    | NEQ
    | GEQ
    | LEQ
    | LESS
    | GREATER;
commands: command commands
    | ;
command: ctrlStruct
    | funcCalls SEMI;
ctrlStruct: selective
    | iterative;
funcCalls: ID LPAR callparams RPAR SEMI;
callparams: (vals COMMA)* vals
    | ID
    | ;
vals: NUMVAL
    | CHARVAL
    | STRVAL
    | BOOLVAL;
selective: IFSTMT LPAR ifLogic RPAR LBRACE block RBRACE
    | SWITCHSTMT LPAR ID RPAR LBRACE cases RBRACE;
ifLogic: bExpr
    | ID;
cases: case cases
    | defCase;
case: case vals COLON block
    | ;
defCase: DEFAULT COLON block
    | ;
iterative: FORSTMT LPAR forParams RPAR LBRACE block RBRACE
    | WHILESTMT LPAR bExpr RPAR LBRACE block RBRACE;
forParams: numDclAssign SEMI bExpr SEMI numAsgmnt;
asgmnt: numAsgmnt
    | charAsgmnt
    | stringAsgmnt
    | boolAsgmnt;
numAsgmnt: ID ASSIGN aExpr;
charAsgmnt: ID ASSIGN SINGLEQOUTE CHARVAL SINGLEQOUTE;
stringAsgmnt: ID ASSIGN DOUBLEQOUTE STRVAL DOUBLEQOUTE;
boolAsgmnt: ID ASSIGN bExpr;





// Token specification
TRUE: 'true';
FALSE: 'false';
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
NUMVAL: [0 −9]('.'[0 −9]+)?;
CHARVAL: ('a'..'z' | '\n' | '\r' | ' ' | '0'..'9')*;
STRVAL: CHARVAL*;
BOOLVAL: TRUE | FALSE;
SAFETY: [1 −9][0 −9]*;
PLUS: '+';
MINUS: '−';
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
SINGLEQOUTE: ' ’ ';
DOUBLEQOUTE: '" ';
ASSIGN: '= ';
LEQ: '<=';
GEQ: '>=';
EQ: '==';
NEQ: '!=';
LESS: '<';
GREATER: '>';
NOT: '!';
AND: '&&';
OR: '||';
ID: STRVAL;
BLANK: (' ')+;







