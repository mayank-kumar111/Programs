# include <stdio.h>

int main()
{
    int n,i,sum=0;
    printf("Enter the value of N integer : ");
    scanf("%d",&n);
    printf("Value of Sum of First N integer is : ");
    for(i=0;i<=n;i++){
        sum=sum+i;
    }
    printf("%d",sum);
    return 0;
}