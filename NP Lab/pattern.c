// print a pattern
/*A 
BB
CCC
DDDD
EEEEE*/

#include <stdio.h>
int main() {
    int i, j;
    for (i = 1; i <= 5; i++) {
        for (j = 1; j <= i; j++) {
            printf("%c", i + 64);
        }
        printf("\n");
    }
    return 0;
}