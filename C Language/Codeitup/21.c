# include <stdio.h>

int main()
{   int n,fac=1,i;
    printf("Enter the value of N integer : ");
    scanf("%d",&n);
    printf("The value of factorial of N is : ");
    for(i=1;i<=n;i++){
        fac=fac*i;
    }
    printf("%d",fac);
    return 0;
}