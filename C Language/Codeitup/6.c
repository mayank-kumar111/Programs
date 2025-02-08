#include <stdio.h>

int main()
{
    int a = 5;
    float b = 6.5;
    printf("Size of integer =%d bytes\n", sizeof(int));
    printf("Size of float =%d bytes\n", sizeof(float));
    printf("Size of variable a =%d bytes\n", sizeof(a));
    printf("Size of variable b =%d bytes", sizeof(b));
    return 0;
}