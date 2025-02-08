#include <stdio.h>

int main()
{
    int num, sum = 0, x;
    printf("Enter the integer : ");
    scanf("%d", &num);
    x = num;
    while (num > 0)
    {
        sum = sum + (num % 10) * (num % 10) * (num % 10);
        num = num / 10;
    }
    if (sum == x)
    {
        printf("Given integer is armstrong.");
    }
    else
    {
        printf("Given integer is not armstrong.");
    }
    return 0;
}