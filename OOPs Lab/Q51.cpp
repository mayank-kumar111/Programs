// write a program to implement function overloading with function template.

#include <iostream>
using namespace std;

template <class T>
T maximum(T a, T b)
{
    if (a > b)
    {
        return a;
    }
    else
    {
        return b;
    }
}

int maximum(int a, int b, int c)
{
    if (a > b && a > c)
    {
        return a;
    }
    else if (b > a && b > c)
    {
        return b;
    }
    else
    {
        return c;
    }
}

int main()
{
    cout << "The maximum of 4 and 5 is: " << maximum(4, 5) << endl;
    cout << "The maximum of 4.5 and 5.5 is: " << maximum(4.5, 5.5) << endl;
    cout << "The maximum of 4, 5 and 6 is: " << maximum(4, 5, 6) << endl;
    return 0;
}