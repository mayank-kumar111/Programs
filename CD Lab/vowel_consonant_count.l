%{
#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
int vowel_count = 0;
int consonant_count = 0;
%}

%%
[a-zA-Z] {
    char ch = yytext[0];
    ch = tolower(ch);
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        vowel_count++;
        printf("Vowel found: %c\n", yytext[0]);
    } else {
        consonant_count++;
        printf("Consonant found: %c\n", yytext[0]);
    }
}
[ \t\n]        ; // Ignore whitespace
.              ; // Ignore everything else
%%

int main(int argc, char **argv) {
    if (argc != 2) {
        printf("Usage: %s <filename>\n", argv[0]);
        return 1;
    }

    FILE *file = fopen(argv[1], "r");
    if (!file) {
        printf("Error: Cannot open file %s\n", argv[1]);
        return 1;
    }

    yyin = file;
    yylex();

    printf("\nTotal vowels: %d\n", vowel_count);
    printf("Total consonants: %d\n", consonant_count);

    fclose(file);
    return 0;
}

int yywrap() {
    return 1;
}