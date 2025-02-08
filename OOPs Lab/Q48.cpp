// Write a program to implement class templent with multiple parameter.

#include <iostream>
using namespace std;

template <class T1, class T2>
class multiTemplate
{
    T1 a;
    T2 b;

public:
    multiTemplate(T1 x, T2 y)
    {
        a = x;
        b = y;
    }

    void display()
    {
        cout << "The value of a is " << a << endl;
        cout << "The value of b is " << b << endl;
    }
};

int main()
{
    multiTemplate<int, char> obj1(4, 'A');
    obj1.display();

    multiTemplate<float, int> obj2(4.5, 5);
    obj2.display();

    return 0;
}