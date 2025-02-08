# include <stdio.h>

int main()
{
    int n,i;
    printf("Enter the N integer value :");
    scanf("%d",&n);
    printf("1 to N odd number is :\n\n");
    for (i=1;i<=n;i++){
        if(i%2!=0){
            printf("%d\n",i);
        }
    }
    return 0;
}