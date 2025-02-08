#include <stdio.h>

int main()
{
    int a, b, c;
    printf("Enter three integer : ");
    scanf("%d%d%d", &a, &b, &c);
    if (a > b && a > c)
    {
        printf("%d is Max.", a);
    }
    else if (b > a && b > c)
    {
        printf("%d is Max.", b);
    }
    else
    {
        printf("%d is Max.", c);
    }
    return 0;
}