%{
	#include<stdio.h>
	void yyerror(char *mensaje){ 
	
		printf("Error %s \n", mensaje); 
		
	}
%}
%token CHAR INT LONG FLOAT DOUBLE SHORT DIGITO SUMA RESTA MUL DIV LETRA PUNTO_COMA 
%token IF ELSE DO WHILE FOR SWITCH VOID THEN PAR_IZQ PAR_DER LLAVE_IZQ LLAVE_DER
%token BREAK CONST CONTINUE DEFAULT RETURN
%token TYPEDEF STRUCT CASE REFER
%token LEFT_OP RIGHT_OP EXPRESION DEC AND_OP OR_OP EQ_OP
%token IDENTIFIER CONSTANT STRING_LITERAL DEC_OP INC_OP PTR_OP LE_OP GE_OP NE_OP ADD_OR_DEC


%%
programa: %empty;
programa: programa dec; 
dec: TYPE LETRA PUNTO_COMA;
TYPE: INT | CHAR | FLOAT | DOUBLE | VOID; 
dec: CONTINUE | BREAK | RETURN ; 
dec: DIGITO SUMA DIGITO |
     DIGITO RESTA DIGITO |
     DIGITO MUL DIGITO |
     DIGITO DIV DIGITO;
dec: IF PAR_IZQ LETRA PAR_DER LLAVE_IZQ;


%%

int main () {
	yyparse();
	return 0;
	}



