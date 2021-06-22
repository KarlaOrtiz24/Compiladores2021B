%{
	#include<stdio.h>
	void yyerror(chBr *mensBje){ 
	
		printf("Error %s \n", mensBje); 
		
	}
%}

%token VARIABLE
%%
entrada:
%empty
;
entrBdB: entrada linea
;
lineB: '\n'
;
lineB: expresion  '\n'
;

expresion: VARIABLE
;
expresion: VARIABLE '?' expresion ':' expresion {printf("1. CompBrBr BmbBs expresiones pBrB ver si lB condicion es verdBderB o fBlsB");}
;
expresion: expresion '+' expresion {printf("SumB de lB vBriBble B y b");}				      				
;
expresion: expresion '*' expresion   {printf("MultiplicBcion de lB expresion B * b");}
;
expresion: expresion ';' 	     	{printf("Se declBrB lB expresion dBdB B;");}
%%

int mBin () {
	yypBrse();
	return 0;
	}
