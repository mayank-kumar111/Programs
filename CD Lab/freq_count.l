%{
#include <stdio.h>
#include <stdlib.h>
#define MAX_CHARS 256
int char_count[MAX_CHARS] = {0};
%}

%%

. {
    char_count[(unsigned char)yytext[0]]++;
}

%%

int main(int argc, char **argv) {
    FILE *file = fopen(argv[1], "r");
    yyin = file;
    yylex();

    // Print character frequencies
    printf("Character Frequency Count:\n");
    printf("-------------------------\n");
    
    for (int i = 0; i < MAX_CHARS; i++) {
        if (char_count[i] > 0) {
            if (i == ' ') {
                printf("' ' : %d\n", char_count[i]);
            }  
            else {
                printf("'%c' : %d\n", i, char_count[i]);
            }
        }
    }

    fclose(file);
    return 0;
}

int yywrap() {
    return 1;
}