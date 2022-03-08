grammar Grammar_v1;


prog: declarations commnands ;

declarations: declaration SEMI declarations
            | ;
declaration: SAFETY vardcl
            | funcdcl;
vardcl: vdcl
            | vdclAsign;







