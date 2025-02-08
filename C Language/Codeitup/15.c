#include <stdio.h>

int main()
{
    int n, i = 0;
    printf("Enter N number for find integer :");
    scanf("%d", &n);
printnum:
    printf("%d\n", i);
    i++;
    if (i <= n)
        goto printnum;

    return 0;
}