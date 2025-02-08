# include <stdio.h>

int main()
{
    int n,rev=0;
    printf("Enter the Value of integer is : ");
    scanf("%d",&n);
    while(n>0){
        rev=(rev*10)+n%10;
        n=n/10;
    }
    printf("Reverse value is : %d",rev);
    return 0;
}