#include <stdio.h>

int main()
{
    int a;

    printf("Enter the value of 'a' : ");
    scanf("%d", &a);

    // One liner 
    (a > 5) ? printf("Value of 'a' is grater than 5") : printf("Value of 'a' is less than 5");
    return 0;
}