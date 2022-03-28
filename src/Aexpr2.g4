grammar Aexpr2;



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