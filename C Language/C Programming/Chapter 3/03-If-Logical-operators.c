#include <stdio.h>

int main()
{
    int age;
    // int Vippass=0;
    // Vippass = 1;
    printf("Enter your age : ");
    scanf("%d", &age);

    if (age <= 70 && age >= 18)
    // if ((age <= 70 && age >= 18) || (Vippass==0))
    {
        printf("You age is less then 70 and greater than 18 you can drive");
    }
    else
    {
        printf("You cannot drive");
    }

    return 0;
}