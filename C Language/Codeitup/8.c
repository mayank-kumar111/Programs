#include <stdio.h>

int main()
{
    int a, b, c, max;
    printf("Enter any three integer : ");
    scanf("%d%d%d", &a, &b, &c);
    max = (a > b && a > c) ? a : (b > a && b > c) ? b : c;
    printf("Max number is = %d", max);
    return 0;
}