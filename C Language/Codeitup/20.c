# include <stdio.h>

int main()
{
    int n,sum=0;
    printf("Enter the integer : ");
    scanf("%d",&n);
    printf("Sum of digit of given number is : ");
    while(n>0){
        sum=sum+(n%10);
        n=n/10;
    }
    printf("%d",sum);

    return 0;
}