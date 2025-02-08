# include <stdio.h>

int main()
{
    int a,b;
    printf("Enter Any two integer :");
    scanf("%d %d",&a,&b);
    printf("c=a+b is %d\n",a+b);
    printf("a+=b is %d\n",a+=b);
    printf("a-=b is %d\n",a-=b);
    printf("a*=b is %d\n",a*=b);
    printf("a/=b is %d\n",a/=b);
    //printf("a%=b is %d\n",a%=b);
    return 0;
}