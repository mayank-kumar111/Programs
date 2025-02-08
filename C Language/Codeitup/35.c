# include <stdio.h>

int main()
{
    int n,i,j,x;
    printf("Enter number :");
    scanf("%d",&n);
    x=1;
    for(i=n;i>=1;i--){
        for(j=1;j<=i;j++){
            printf("%d",x);
            x++;
        }
        printf("\n");
    }
    return 0;
}