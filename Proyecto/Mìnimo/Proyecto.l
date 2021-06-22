%{ 
#include <stdlib.h>
#include "Prototipo.tab.h"


%}
%% 
[a-zA-Z]+ 		{return VARIABLE;}
[?]			{return '?';}
[:]			{return ':';}
[+]			{return '+';}
[*]			{return '*';}
[;]			{return ';';}
\n			{return '\n';}
.

%%


