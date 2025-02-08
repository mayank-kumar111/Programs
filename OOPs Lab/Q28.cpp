// Define a class complex to represent a complex number, create an array of object of size 2 using new operator define a member function to multiply these 2 objects by passing them as argument in the function.

#include <iostream>
using namespace std;

class complex
{
    int real, img;

public:
    void input();
    void mul(complex c1, complex c2);
    void display();
};

void complex::input()
{
    cout << "Enter the real part and imaginary part of the complex number: ";
    cin >> real >> img;
}

void complex::display()
{
    cout << "The multiplication is:" << real << "+i" << img << endl;
}

void complex::mul(complex x, complex y)
{
    real = x.real * y.real - x.img * y.img;
    img = x.real * y.img + x.img * y.real;
}

int main()
{
    complex *c = new complex[2];
    for (int i = 0; i < 2; i++)
    {
        c[i].input();
    }
    c[0].display();
    c[1].display();
    c[0].mul(c[0], c[1]);
    c[0].display();
    return 0;
}