#include <stdio.h>

int main()
{
    int a, b;
    printf("Enter any two integer : ");
    scanf("%d %d", &a, &b);
    printf("Addition of Given two number is %d\n", a + b);
    printf("Substraction of Given two number is %d\n", a - b);
    printf("Multiply of Given two number is %d\n", a * b);
    printf("Division of Given two number is %d\n", a / b);
    printf("Modulus of Given two number is %d\n", a % b);

    return 0;
}