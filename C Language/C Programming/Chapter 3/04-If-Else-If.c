#include <stdio.h>

int main()
{
    int num;

    printf("Enter your number : ");
    scanf("%d", &num);

    if (num == 1)
    {
        printf("Your number is 1");
    }
    else if (num == 2)
    {
        printf("Your number is 2");
    }
    else if (num == 3)
    {
        printf("Your number is 3");
    }
    else
    {
        printf("Your number is not 1,2 or 3");
    }

    return 0;
}