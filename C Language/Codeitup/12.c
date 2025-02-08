#include <stdio.h>

int main()
{
    int n;
    printf("Enter Number 1 for Monday\n");
    printf("Enter Number 2 for Tuesday\n");
    printf("Enter Number 3 for Wednesday\n");
    printf("Enter Number 4 for Thursday\n");
    printf("Enter Number 5 for Friday\n");
    printf("Enter Number 6 for Saturday\n");
    printf("Enter Number 7 for Sunday\n");
    scanf("%d",&n);
    switch (n)
    {
    case 1:
        printf("Monday");
        break;
    case 2:
        printf("Tuesday");
        break;
    case 3:
        printf("Wednesday");
        break;
    case 4:
        printf("Thursday");
        break;
    case 5:
        printf("Friday");
        break;
    case 6:
        printf("Saturday");
        break;
    case 7:
        printf("Sunday");
        break;
    default:
        printf("You Enter Wrong Number");
        break;
    }
    return 0;
}