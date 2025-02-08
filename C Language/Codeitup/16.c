#include <stdio.h>

int main()
{
    int n, i;
    printf("Enter N Integer value :");
    scanf("%d", &n);
    printf("1 To N Natural number is :\n\n");
    for (i = 1; i <= n; i++)
    {
        printf("%d\n", i);
    }
    return 0;
}