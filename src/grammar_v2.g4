grammar grammar_v2;







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
CHARVAL: [a-zA-Z0-9] | ' ';
STRVAL: CHARVAL+;
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