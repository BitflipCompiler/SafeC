grammar SafeCTwo;

prog: (declaration)* #DeclarationNode ;

declaration:
      dclassignsemi #DclAssignSemiNode
    | structdcl #StructDclNode
    | funcdcl #FuncDclNode;

structdcl: DOLLAR ID structblock #StructDclBlockNode;

structblock: LBRACE (safedeclaration SEMI)+ RBRACE #StructBlockNode;

dclassignsemi:
     (safedeclaration | vassign) SEMI #SafeDeclVAssignNode;
dclassignsemicommand:
     (dclassignsemi | command)* #DclAssignSemiCommandNode;
safedeclaration:
      SAFETY (vdcl | vdclassign) #SafeDeclNode;
params:
      vdcl (COMMA vdcl)* #ParamsNode;
block:
      LBRACE dclassignsemicommand RBRACE #BlockNode;
caseblock:
      dclassignsemicommand (BREAK)? #CaseBlockNode;
vdcl:
      numdecl #NumVDclNode
    | chardecl #CharVDclNode
    | stringdecl #StringVDclNode
    | booldecl #BoolVDclNode
    | arraydecl #ArrayDclNode;

arraydecl: LBRACK arrdcltype RBRACK ID #ArrayDeclNode;

arrdcltype:
      NUMDCL #ArrayDclTypeNumDclNode
    | CHARDCL #ArrayDclTypeCharDclNode
    | STRDCL #ArrayDclTypeStringDclNode
    | BOOLDCL #ArrayDclTypeBoolDclNode;

vassign: ID ASSIGN atypes #VAssignNode;

vdclassign:
      numdclassign #NumVDclAssignNode
    | chardclassign #CharVDclAssignNode
    | stringdclassign #StringVDclAssignNode
    | booldclassign #BoolVDclAssignNode
    | arraydclassign #ArrayDclAssignNode;

arraydclassign:
      numarraydclassign #NumArrayDclAssignNode
    | chararraydclassign #CharArrayDclAssignNode
    | stringarraydclassign #StringArrayDclAssignNode
    | boolarraydclassign #BoolArrayDclAssignNode;

numarraydclassign: LBRACK NUMDCL RBRACK ID ASSIGN LBRACK numarray RBRACK #NumArrayDclAssignNumArrayNode;

chararraydclassign: LBRACK CHARDCL RBRACK ID ASSIGN LBRACK chararray RBRACK #CharArrayDclAssignCharArrayNode;

stringarraydclassign: LBRACK STRDCL RBRACK ID ASSIGN LBRACK strarray RBRACK #StringArrayDclAssignStringArrayNode;

boolarraydclassign: LBRACK BOOLDCL RBRACK ID ASSIGN LBRACK boolarray RBRACK #BoolArrayDclAssignBoolArrayNode;

datatype:
      NUMDCL #NumDclDatatypeNode
    | CHARDCL #CharDclDatatypeNode
    | STRDCL #StringDclDatatypeNode
    | BOOLDCL #BoolDclDatatypeNode
    | VOIDDCL #VoidDclDatatypeNode;

atypes:
    aexpr #ATypeAexprNode
   | bexpr #ATypeBexprNode
   | CHARVAL #ATypeCharValNode
   | STRVAL #ATypeStrValNode
   | funccalls #ATypeFuncCallsNode
   | arrayassign #ATypeArrayAssignNode;

arrayassign: LBRACK arraydata RBRACK #ArrayAssignNode;

arraydata:
      numarray #NumArrayDataNode
    | chararray #CharArrayDataNode
    | strarray #StringArrayDataNode
    | boolarray #BoolArrayDataNode;

numarray: numberval (COMMA numberval)* #NumArrayNode;

chararray: CHARVAL (COMMA CHARVAL)* #CharArrayNode;

strarray: STRVAL (COMMA STRVAL)* #StringArrayNode;

boolarray: BOOLVAL (COMMA BOOLVAL)* #BoolArrayNode;

command:
      ctrlstruct #ControlstructNode
    | funccalls SEMI #FunctioncallsNode;
funccalls:
      ID LPAR (callparams)? RPAR #CallParametersNode;

funcdcl:
     datatype ID LPAR (params)? RPAR funcblock #FuncDclBlockNode;

funcblock:
     LBRACE dclassignsemicommand RETURN vals SEMI RBRACE #FuncBlockNode;

callparams:
     vals (COMMA vals)* #CallParamsValsNode;

ctrlstruct:
        selective #SelectiveNode
      | iterative #IterativeNode;

iterative:
        FORSTMT LPAR forparams RPAR block #ForStmtNode
      | WHILESTMT LPAR bexpr RPAR block  #WhileStmtNode;

selective:
        IFSTMT iflogic block ( ELSE  block)? #IfStmtNode
      | SWITCHSTMT LPAR ID RPAR LBRACE (scase)* defcase RBRACE #SwitchStmtNode;
iflogic:
      LPAR bterm RPAR #BtermNode;

forparams:
      numdclassign SEMI bexpr SEMI ID ASSIGN aexpr #ForParamsNode;

scase:
      CASE vals COLON caseblock #SCaseNode;

defcase:
      DEFAULT COLON caseblock #DefCaseNode;

//DECLARATIONS
numdecl:
      NUMDCL ID #NumDeclNode;
booldecl:
      BOOLDCL ID #BoolDeclNode;
chardecl:
      CHARDCL ID #CharDeclNode;
stringdecl:
      STRDCL ID #StringDeclNode;

//DCL + ASSIGN
numdclassign:
      numdecl ASSIGN aexpr #NumDclAssignNode;
chardclassign:
      chardecl ASSIGN CHARVAL #CharDclAssignNode;
stringdclassign:
      stringdecl ASSIGN STRVAL #StringDclAssignNode;
booldclassign:
      booldecl ASSIGN bexpr #BoolDclAssignNode;

//BOOLEAN EXPRESSION
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

//BOOLEAN OPERATIONS
bop:
      AND #AndNode
    | OR #OrNode;

//VALUES
vals:
      numberval #ValsNumberValsNode
    | CHARVAL #ValsCharValsNode
    | STRVAL #ValsStrValsNode
    | BOOLVAL #ValsBoolValsNode
    | ID #ValsIdValsNode;


//NUMBER VALUE
numberval:
      NUMVAL #NumValNode
    | PI #PiNode;

//RELATIVE OPERATIONS
relop :
      EQ #EqualNode
    | NEQ #NotEqualNode
    | GEQ #GreaterEqualNode
    | LEQ #LesserEqualNode
    | LESS #LesserNode
    | GREATER #GreaterNode;

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
DOLLAR: '$';

//SKIPS
WS : [ \t\r\n\f]+ -> skip;
COMMENT : '//' ~[\r\n]* -> skip;