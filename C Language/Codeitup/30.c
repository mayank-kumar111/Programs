# include <stdio.h>

int main()
{
    int n,i,j;
    printf("Enter number :");
    scanf("%d",&n);
    for(i=1;i<=n;i++){
        printf("\n");
        for(j=1;j<=i;j++){
            printf("%d\t",i+j);
        }
    }
    return 0;
}