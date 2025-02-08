# include <stdio.h>

int main()
{
    float radius;
    printf("Enter radius of circle in Meter : ");
    scanf("%f",&radius);
    printf("Area of circle in Meter : %f \n",3.14*radius*radius);
    float rad,height;
    printf("Enter radius of cylinder in Meter : ");
    scanf("%f",&rad);
    printf("Enter height of cylinder in Meter : ");
    scanf("%f",&height);
    printf("Volume of cylinder is : %f",3.14*rad*rad*height);
    return 0;
}