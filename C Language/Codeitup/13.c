#include <stdio.h>

int main()
{
    float a, b;
    int n;
    printf("Enter two integer :");
    scanf("%f%f", &a, &b);
    printf("1 : For Add.\n");
    printf("2 : For Sub.\n");
    printf("3 : For Mult.\n");
    printf("4 : For Div.\n\n");
    printf("Enter 1-4 for Different operation :");
    scanf("%d",&n);
    switch (n)
    {
    case 1:
        printf("Add of %.2f and %.2f is = %.2f", a, b, a + b);
        break;
    case 2:
        printf("Sub of %.2f and %.2f is = %.2f", a, b, a - b);
        break;
    case 3:
        printf("Mult of %.2f and %.2f is =%.2f", a, b, a * b);
        break;
    case 4:
        printf("Div of %.2f and %.2f is =%.2f", a, b, a / b);
        break;

    default:
        printf("You Enter a Wrong Input");
        break;
    }

    return 0;
}