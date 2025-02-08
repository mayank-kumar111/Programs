#include <stdio.h>

int main()
{
    int age;
    printf("Enter your age : ");
    scanf("%d", &age);

    // if (age!=90)
    if (age >= 90)
    {
        printf("You age is %d above 90 you can not drive", age);
    }
    else
    {
        printf("You can drive");
    }

    return 0;
}