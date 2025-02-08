#include <stdio.h>

int main()
{
    int n;

    printf("Enter a integer :");
    scanf("%d", &n);
    if (n % 2 == 0)
        goto even;
    else
        goto odd;
even:
    printf("Integer is Even ");
    return 0;
odd:
    printf("Integer is odd ");
    return 0;
}