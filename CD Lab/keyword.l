%{
#include <stdio.h>
int count_key = 0;
%}

%%
int([^a-zA-Z0-9_])      { count_key++; }
float([^a-zA-Z0-9_])    { count_key++; }
if([^a-zA-Z0-9_])       { count_key++; }
else([^a-zA-Z0-9_])     { count_key++; }
return([^a-zA-Z0-9_])   { count_key++; }
[ \t\n]+                { /* skip whitespace */ }
.                       { /* skip everything else */ }
%%

int yywrap(void) {
    return 1;
}

int main(int argc, char *argv[])
{
    FILE *file = fopen(argv[1], "r");
    if (!file) {
        printf("Error: Could not open file %s\n", argv[1]);
        return 1;
    }
    yyin = file;
    yylex();
    fclose(file);
    printf("Number of keywords = %d\n", count_key);
    return 0;
}
