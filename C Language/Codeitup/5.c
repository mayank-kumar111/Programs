# include <stdio.h>

int main()
{
    int a=5,b=10;
    printf("Value of a=%d and value of b=%d\n",a,b);
    printf("value of a=%d\n",a++);
    printf("value of a=%d\n",++a);
    printf("value of b=%d\n",++b);
    printf("value of b=%d\n",b++);
    printf(" last value of =%d",(a++)+(++b));
    return 0;
}