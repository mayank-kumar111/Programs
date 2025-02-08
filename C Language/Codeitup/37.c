# include <stdio.h>

int main()
{
    int n,i,j,x;
    printf("Enter number :");
    scanf("%d",&n);
    for(i=1;i<=n;i++){
        for(j=1;j<=i;j++){
            printf(" ");
        }
        printf("\n");
    for(x=1;x<=n+1-i;x++){
        printf("*");
    }
    }
    return 0;
}