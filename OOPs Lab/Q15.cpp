// write a program to emplement function calling mechanisms using class.
#include <iostream>
#include <string>
using namespace std;

class function
{
public:
    void swapV(int, int);
    void swapP(int *, int *);
    void swapR(int &, int &);
};
void function ::swapV(int a, int b)
{
    int temp;
    temp = a;
    a = b;
    b = temp;
}
void function ::swapP(int *p1, int *p2)
{
    int temp;
    temp = *p1;
    *p1 = *p2;
    *p2 = temp;
}
void function ::swapR(int &r1, int &r2)
{
    int temp;
    temp = r1;
    r1 = r2;
    r2 = temp;
}

int main()
{
    function s1;
    int x, y;
    cout << "Enter x,y :" << endl;
    cin >> x >> y;
    cout << "Value of x,y before swpping";
    cout << "\nx=" << x;
    cout << "\ny=" << y;
    s1.swapV(x, y);
    cout << "\nValue of x,y after call by value";
    cout << "\nx=" << x;
    cout << "\ny=" << y;
    s1.swapP(&x, &y);
    cout << "\nValue of x,y after call by pointer";
    cout << "\nx=" << x;
    cout << "\ny=" << y;
    s1.swapR(x, y);
    cout << "\nValue of x,y after call by reference";
    cout << "\nx=" << x;
    cout << "\ny=" << y;

    return 0;
}