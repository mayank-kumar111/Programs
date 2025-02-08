#include <stdio.h>

int main()
{
    int n, rev = 0, nuw;
    printf("Enter the Value of integer is : ");
    scanf("%d", &n);
    nuw = n;
    while (n > 0)
    {
        rev = (rev * 10) + n % 10;
        n = n / 10;
    }
    printf("Reverse value is : %d\n", rev);
    if (nuw == rev)
    {
        printf("Given number %d is Palindrome number", nuw);
    }
    else
    {
        printf("Given number %d is not Palindrome number", nuw);
    }
    return 0;
}