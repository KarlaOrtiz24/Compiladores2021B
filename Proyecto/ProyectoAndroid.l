A	[a-zA-Z]
D	[0-9]
AN	[a-fA-F0-9]


%{ 
#include <stdlib.h>
#include <stdio.h>
#include "ProyectoG.tab.h"


%}

%% 
[0-9]		{return DIGITO;}
[a-zA-Z]	{return LETRA;}
"int"		{return INT;}
"char"		{return CHAR;} 
"double"	{return  (DOUBLE);} 
"float"	{return (FLOAT);}
long		{return  (LONG);} 
short		{return  (SHORT);} 
if		{return (IF);}
else		{return (ELSE);} 
do		{return (DO);} 
while		{return (WHILE);} 
for		{return (FOR);}
switch		{return (SWITCH);} 
void		{return (VOID);} 
break		{return (BREAK);} 
const		{return (CONST);} 
continue	{return (CONTINUE);} 
default	{return (DEFAULT);} 
return		{return (RETURN);} 
case		{return (CASE);} 
then		{return (THEN);} 
">>"		{ return(RIGHT_OP); }
"<<"		{ return(LEFT_OP); }
"++"		{ return(INC_OP); }
"--"		{ return(DEC_OP); }
"->"		{ return(PTR_OP); }
"&&"		{ return(AND_OP); }
"||"		{ return(OR_OP); }
"<="		{ return(LE_OP); }
">="		{ return(GE_OP); }
"=="		{ return(EQ_OP); }
"!="		{ return(NE_OP); }
";"		{ return(PUNTO_COMA); }
","		{ return(','); }
":"		{ return(':'); }
"="		{ return('='); }
"("		{ return('PAR_IZQ'); }
")"		{ return('PAR_DER'); }
"."		{ return('.'); }
"&"		{ return(REFER); }
"!"		{ return('!'); }
"*"		{ return(MUL); }
"/"		{ return(DIV); }
"%"		{ return('%'); }
"<"		{ return('<'); }
">"		{ return('>'); }
"^"		{ return('^'); }
"|"		{ return('|'); }
"?"		{ return('?'); }
"{"		{ return('LLAVE_IZQ'); }
"}"		{ return('LLAVE_DER'); }
"+"		{ return(SUMA); }
"-"		{ return(RESTA); }
.
{A}({A}|{D})* 	{return(tipo());}

%%
yywrap() {return(1);}
int tipo() { 
	return (IDENTIFIER);
}
