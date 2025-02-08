#include <stdio.h>

int main()
{
    int n, a = 0, b = 1, sum = 0;
    printf("Enter N integer value : ");
    scanf("%d", &n);
    printf("Fibonacci Series are :\n");
    while (sum <= n)
    {
        a = b;
        b = sum;
        sum = a + b;
        printf("%d\n", sum);
    }
    return 0;
}