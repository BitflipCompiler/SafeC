grammar Safec;
prog: declarations commands ;

declarations:
      declaration declarations
      | ;
commands:
      command commands
      | ;
declaration:
      dclassignsemi
    | funcdcl;
dclassignsemi:
     (safedeclaration | vassign) SEMI;
dclassignsemicommand:
     (dclassignsemi | command)*;
safedeclaration:
      SAFETY (vdcl | vdclassign);
params:
      vdcl (COMMA vdcl)*;
block:
      LBRACE dclassignsemicommand RBRACE;
caseblock:
      dclassignsemicommand (BREAK)?;
vdcl:
      numdecl
    | chardecl
    | stringdecl
    | booldecl
    | arraydecl;

arraydecl: LBRACK arrdcltype RBRACK ID;

arrdcltype:
      NUMDCL
    | CHARDCL
    | STRDCL
    | BOOLDCL;

vassign: ID ASSIGN atypes;

vdclassign:
      numdclassign
    | chardclassign
    | stringdclassign
    | booldclassign
    | arraydclassign;

arraydclassign:
      numarraydclassign
    | chararraydclassign
    | stringarraydclassign
    | boolarraydclassign;

numarraydclassign: LBRACK NUMDCL RBRACK ID ASSIGN LBRACK numarray RBRACK;

chararraydclassign: LBRACK CHARDCL RBRACK ID ASSIGN LBRACK chararray RBRACK;

stringarraydclassign: LBRACK STRDCL RBRACK ID ASSIGN LBRACK strarray RBRACK;

boolarraydclassign: LBRACK BOOLDCL RBRACK ID ASSIGN LBRACK boolarray RBRACK;

datatype:
      NUMDCL
    | CHARDCL
    | STRDCL
    | BOOLDCL
    | VOIDDCL;

atypes: aexpr | bexpr | CHARVAL | STRVAL | funccalls | arrayassign;

arrayassign: LBRACK arraydata RBRACK;

arraydata:
      numarray
    | chararray
    | strarray
    | boolarray;

numarray: numberval (COMMA numberval)*;

chararray: CHARVAL (COMMA CHARVAL)*;

strarray: STRVAL (COMMA STRVAL)*;

boolarray: BOOLVAL (COMMA BOOLVAL)*;

command:
      ctrlstruct
    | funccalls SEMI;
funccalls:
      ID LPAR (callparams)? RPAR;

funcdcl:
     datatype ID LPAR (params)? RPAR funcblock;

funcblock:
     LBRACE dclassignsemicommand RETURN vals SEMI RBRACE;

callparams:
     vals (COMMA vals)*;

ctrlstruct:
        selective
      | iterative;

iterative:
        FORSTMT LPAR forparams RPAR block
      | WHILESTMT LPAR bexpr RPAR block  ;

selective:
        IFSTMT iflogic block ( ELSE  block)?
      | SWITCHSTMT LPAR ID RPAR LBRACE (scase)* defcase RBRACE;
iflogic:
      LPAR bterm RPAR;

forparams:
      numdclassign SEMI bexpr SEMI ID ASSIGN aexpr;

scase:
      CASE vals COLON caseblock;

defcase:
      DEFAULT COLON caseblock;

//DECLARATIONS
numdecl:
      NUMDCL ID;
booldecl:
      BOOLDCL ID ;
chardecl:
      CHARDCL ID ;
stringdecl:
      STRDCL ID ;

//DCL + ASSIGN
numdclassign:
      numdecl ASSIGN aexpr;
chardclassign:
      chardecl ASSIGN CHARVAL;
stringdclassign:
      stringdecl ASSIGN STRVAL;
booldclassign:
      booldecl ASSIGN bexpr;

//BOOLEAN EXPRESSION
bexpr: BOOLVAL | bterm;

bterm: partbool relop partbool | bpart;

bpart: bpiece bop bpiece | bpiece;

bpiece: NOT bexpr | blast;

blast: LPAR bexpr RPAR | ID;


aexpr:
    term ((PLUS | MINUS)  term)*;
term:
    part ((TIMES | DIVISION | MOD) part)*;
part:
    LPAR aexpr RPAR | ID | numberval;

partbool: (part | BOOLVAL);

//BOOLEAN OPERATIONS
bop:
      AND
    | OR;

//VALUES
vals:
      numberval
    | CHARVAL
    | STRVAL
    | BOOLVAL
    | ID;


//NUMBER VALUE
numberval:
      NUMVAL
    | PI;

//RELATIVE OPERATIONS
relop :
      EQ
    | NEQ
    | GEQ
    | LEQ
    | LESS
    | GREATER ;

//Fragments
fragment LOWERCASE:[a-z];
fragment UPPERCASE:[A-Z];
fragment NUMBER:('0'..'9');

//Token specification
WHILESTMT: 'while';
FORSTMT: 'for';
IFSTMT: 'if';
ELSE: 'else';
SWITCHSTMT: 'switch';
CASE: 'case';
DEFAULT: 'default';
NUMDCL: 'number';
CHARDCL: 'char';
STRDCL: 'string';
BOOLDCL: 'boolean';
VOIDDCL: 'void';
RETURN: 'return';
BREAK: 'break'SEMI;
BOOLVAL: 'true' | 'false';
NUMVAL: NUMBER+(DOT NUMBER+)?;
CHARVAL: SINGLEQOUTE[a-zA-Z0-9]SINGLEQOUTE;
STRVAL: DOUBLEQOUTE[a-zA-Z0-9]+DOUBLEQOUTE;
ID: LOWERCASE(LOWERCASE | UPPERCASE | NUMBER)*;
SAFETY: HASHTAG('1'..'9')NUMBER*;
PLUS: '+';
MINUS: '-';
TIMES: '*';
DIVISION: '/';
POW: 'pow';
SQUARE: 'sqrt';
MOD: '%';
PI: 'PI';
LBRACK: '[';
RBRACK: ']';
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

//SKIPS
WS : [ \t\r\n\f]+ -> skip;
COMMENT : '//' ~[\r\n]* -> skip;