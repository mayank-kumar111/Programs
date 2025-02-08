#include <stdio.h>

int main()
{
    int a = 5;
    // int b = 6.5;   Not recommendent because 6.5 is not an integer
    float b = 6.5;
    char c = 'm';
    int d = 48;
    int e = 48 + 4;
    printf("The value of a is %d \n", a);
    printf("The value of b is %f \n", b);
    printf("The value of c is %c \n", c);
    printf("The value of d is %d \n", d);
    printf("The sum of a and d is %d \n", a + d);
    printf("The value of e is %d \n", e);
    return 0;
}