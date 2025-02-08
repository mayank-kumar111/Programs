#include <stdio.h>
#include <math.h>

int main()
{
    int a = 4;
    int b = 2;
    printf("The value of a+b is %d\n", a + b);
    printf("The value of a-b is %d\n", a - b);
    printf("The value of a*b is %d\n", a * b);
    printf("The value of a/b is %d\n", a / b);

    int c;
    c = b * a; // Legal
    // b*a=c; //Inlegal
    printf("The value of c is %d\n", c);

    printf("5 When divided by 2 leaves remainder %d\n", 5 % 2);
    printf("-5 When divided by 2 leaves remainder %d\n", -5 % 2);
    printf("5 When divided by -2 leaves remainder %d\n", 5 % -2);

    // No operator is assumed to be present
    // printf("The value of 6*3 is %d",(6)(3)); --> Will not return 18 Wrong!!
    printf("The value of 6*3 is %d\n", (6) * (3));

    // There is no operator to preform exponentiatio ic C
    printf("The value of 4^5 is (ERROR) %d\n", 4 ^ 5); //--> Will not produce 4 to the power 5.
    printf("The value of 2 to the power 5 is %f\n", pow(2, 5)); // Use %f alwaya to find power. 

    printf("The value of 2+5 is %d\n", 2 + 5);
    printf("The value of 2.6+5 is (ERROR) %d\n", 2.6 + 5);

    printf("The value of 2.6+5 is %f\n", 2.6 + 5);
    printf("The value of 2.6+5.3 is %f\n", 2.6 + 5.3);
    printf("The value of 5/2 is (ERROR) %d\n", 5 / 2);
    printf("The value of 5/2 is (ERROR) %f\n", 5 / 2);
    printf("The value of 5.0/2 is %f\n", 5.0 / 2);   
    printf("The value of 5.0/2.0 is %f\n", 5.0 / 2.0);

    //int r=3.0/9;
    printf("The value of 3.0/9 is %f",3.0/9);

    return 0;
}