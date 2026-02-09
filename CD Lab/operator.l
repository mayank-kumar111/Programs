%{
#include <stdio.h>
int operator_count = 0;
%}

%%
"="        { operator_count++; }
">"        { operator_count++; }
[ \t\n]+   { /* skip whitespace */ }
.          { /* skip everything else */ }
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
    printf("Total number of operators = %d\n", operator_count);
    return 0;
}
