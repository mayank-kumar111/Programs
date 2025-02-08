// overload pre increment and post increment operators for complex numbers : using friend function.

#include <iostream>
using namespace std;
class complex
{
    int real, img;

public:
    void input();
    void display();
    friend void operator++(complex &);
    // friend void operator++(complex &, int);
    friend complex operator++(complex &, int);
};

void complex ::input()
{
    cout << "Enter the real part and imaginary part of the complex number: ";
    cin >> real >> img;
}

void complex ::display()
{
    cout << "The complex number is: " << real << " + " << img << "i" << endl;
}

void operator++(complex &c)
{
    c.real = ++c.real;
    c.img = ++c.img;
}

// void operator++(complex &c, int)
// {
//     c.real++;
//     c.img++;
// }

complex operator++(complex &c, int)
{
    complex temp;
    temp.real = c.real++;
    temp.img = c.img++;
    return temp;
}

int main()
{
    complex c1, c2;
    c1.input();
    c1.display();
    ++c1;
    c1.display();
    c2 = c1++;
    c1.display();
    c2.display();
    return 0;
}
