# include <stdio.h>

int main()
{
    // Write a program to determine whether a number a divisible by 97 or not.
    int num;
    printf("Enter your number : ");
    scanf("%d",&num);
    printf("Divisibility test return : %d\n97", num%97);

    // Q2. Explain step by step evaluation of 3*x/y-z+k
    int x=2,y=3,z=3,k=1;
    int result=3*x/y-z+k;
    // 3*x/y-z+k
    // 3*2/3-3+1
    // 6/3-3+1
    // 2-3+1
    // -1+1 or 2-2
    // 0
    printf("The value of result is %d :",result);

    return 0;
}