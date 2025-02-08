// write a program to implement function template with multiple parameter.

#include <iostream>
using namespace std;

template <class T1, class T2>
void display(T1 a, T2 b)
{
    cout << "The value of a is " << a << endl;
    cout << "The value of b is " << b << endl;
}

int main()
{
    display(4, 'A');
    display(4.5, 5);
    return 0;
}