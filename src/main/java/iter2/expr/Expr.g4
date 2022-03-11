grammar Expr;

@header {
package antlr;
}

prog: (decl | expr)+ EOF
    ;

decl : ID ':' INT_TYPE '=' NUM
    ;
    /* ANTLR resolves ambiguities in favor of the alternative given first*/
expr:expr '*' expr
    |expr '+' expr
    |ID
    |NUM
    ;

/*Tokens*/
ID : [a-z][a-zA-Z0-9_]*;
NUM: '0' | '-'?[1-9][0-9]*;
INT_TYPE : 'INT';
/*Anything not \r and \n will be skipped*/
COMMENT : '--' ~[\r\n]* -> skip;
WS : [ \t\n]+ -> skip;



