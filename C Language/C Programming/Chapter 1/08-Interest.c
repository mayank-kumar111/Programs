# include <stdio.h>

int main()
{
    float rate,pri,time;
    printf("Enter the value of Rate : ");
    scanf("%f",&rate);
    printf("Enter the value of principal : ");
    scanf("%f",&pri);
    printf("Enter the value of time in year : ");
    scanf("%f",&time);
    printf("Your simple interest is : %f",(rate*pri*time)/100);
    return 0;
}