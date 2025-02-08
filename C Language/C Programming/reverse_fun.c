# include <stdio.h>
int reverse(int n);
int main()
{
    int n,m;
 m=reverse (n);
 printf ("%d",m);   
}
int reverse(int n)
{
 int reverse = 0, remainder;
    printf("Enter an integer: ");
    scanf("%d", &n);

    while (n != 0) {
        remainder = n % 10;
        reverse = reverse * 10 + remainder;
        n=n/ 10;
    }
return(reverse);
}
