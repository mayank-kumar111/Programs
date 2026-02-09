%{
#include <stdio.h>
#include <stdlib.h>
int blank_count = 0;
int word_count = 0;
int line_count = 0;
%}

%%
[ \t]   { blank_count++; }
[^\n \t]+   { word_count++; }
\n  { line_count++; }
%%

int main(int argc, char **argv) {

    FILE *file = fopen(argv[1], "r");

    yyin = file;
    yylex();

    // Handle the case where the file doesn't end with a newline
    // The last line should still be counted
    if (word_count > 0 || blank_count > 0) {
        line_count++;
    }

    printf("Blank spaces: %d\n", blank_count);
    printf("Words: %d\n", word_count);
    printf("Lines: %d\n", line_count);

    fclose(file);
    return 0;
}

int yywrap() {
    return 1;
}