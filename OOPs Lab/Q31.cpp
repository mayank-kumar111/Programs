// write a program to overload * and / operators in the following form. c3=10 *c1 and c4=c1/c2;

#include <iostream>
using namespace std;

class complex
{
    int real, img;

public:
    void input();
    void display();
    friend complex operator*(int, complex &); // Friend function
    friend complex operator/(complex &, complex &); // Friend function
};

void complex::input()
{
    cout << "Enter the real part and imaginary part of the complex number: ";
    cin >> real >> img;
}

void complex::display()
{
    cout << "The complex number is: " << real << " + " << img << "i" << endl;
}

complex operator*(int x, complex &y)
{
    complex temp;
    temp.real = x * y.real;
    temp.img = y.img;
    return temp;
}

complex operator/(complex &x, complex &y)
{
    complex temp;
    temp.real = (x.real * y.real + x.img * y.img) / (y.real * y.real + y.img * y.img);
    temp.img = (x.img * y.real - x.real * y.img) / (y.real * y.real + y.img * y.img);
    return temp;
}

int main()
{
    complex c1, c2, c3, c4;
    c1.input();
    c2.input();
    c1.display();
    c2.display();
    c3 = 10 * c1; // operator*(10, c1)
    c4 = c1 / c2; // operator/(c1, c2)
    c3.display();
    c4.display();
    return 0;
}

