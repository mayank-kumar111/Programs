# include <stdio.h>

int main()
{
    float celsius;
    printf("Enter the value of temperature in celcius is : ");
    scanf("%f",&celsius);
    printf("The value of temperature in Fahrenheit is %f",(celsius*9/5)+32);
    return 0;
}