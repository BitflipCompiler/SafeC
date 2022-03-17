grammar Expr;

/*
 * source: Jackie Wang, Youtube: https://www.youtube.com/watch?v=zo_oiHzKLqw&list=PL5dxAmCmjv_4FGYtGzcvBeoS-BobRTJLq&index=4
 */

@header {
package antlr;
}

prog: (decl | expr)+ EOF        #Program //Label
    ;

decl : ID ':' INT_TYPE '=' NUM  #Declaration
    ;
    /* ANTLR resolves ambiguities in favor of the alternative given first*/
expr:expr '*' expr              #Multiplication //Label
    |expr '+' expr              #Addition //Label
    |ID                         #Variable //Label
    |NUM                        #Number //Label
    ;

/*Tokens*/
ID : [a-z][a-zA-Z0-9_]*;
NUM: '0' | '-'?[1-9][0-9]*;
INT_TYPE : 'INT';
/*Anything not \r and \n will be skipped*/
COMMENT : '--' ~[\r\n]* -> skip;
WS : [ \t\n\r]+ -> skip;



