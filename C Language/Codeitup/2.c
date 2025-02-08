#include <stdio.h>

int main()
{
    int a, b;
    printf("Enter any two integer : ");
    scanf("%d %d", &a, &b);
    printf("Value of First>Second is %d \n ", a > b);
    printf("Value of First<Second is %d \n", a < b);
    printf("Value of First>=Second is %d \n", a >= b);
    printf("Value of First<=Second is %d \n", a <= b);
    printf("Value of First==Second is %d \n", a == b);
    printf("Value of First!=Second is %d \n", a != b);
    return 0;
}