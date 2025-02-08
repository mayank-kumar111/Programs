#include <stdio.h>

// C program to check whether a number is even or odd

int main()
{
    int num;
    printf("Enter your number : ");
    scanf("%d", &num);

    if (num % 2 == 0)
    {
        printf("Your number %d is EVEN", num);
    }
    else
    {
        printf("Your number %d is ODD", num);
    }

    return 0;
}