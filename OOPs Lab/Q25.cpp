// Write a program to implement friendly class for performing following operations on complax numbers ,addition, multiplication amd division.
#include <iostream>
using namespace std;
class complex2;
class complex1
{
    int real, img;

public:
    void input();
    void display();
    void add(complex1 &, complex2 &);
    void multiply(complex1 &, complex2 &);
    void divide(complex1 &, complex2 &);
};

class complex2
{
    int real, img;

public:
    void input();
    void display();
    friend class complex1;
};

void complex1 ::input()
{
    cout << "Enter the real part and imaginary part of the complex number: ";
    cin >> real >> img;
}

void complex1 ::display()
{
    cout << "The complex number is: " << real << " + " << img << "i" << endl;
}

void complex1 ::add(complex1 &c1, complex2 &c2)
{
    real = c1.real + c2.real;
    img = c1.img + c2.img;
}

void complex1 ::multiply(complex1 &c1, complex2 &c2)
{
    real = c1.real * c2.real - c1.img * c2.img;
    img = c1.real * c2.img + c1.img * c2.real;
}

void complex1 ::divide(complex1 &c1, complex2 &c2)
{
    real = (c1.real * c2.real + c1.img * c2.img) / (c2.real * c2.real + c2.img * c2.img);
    img = (c1.img * c2.real - c1.real * c2.img) / (c2.real * c2.real + c2.img * c2.img);
}

void complex2 ::input()
{
    cout << "Enter the real part and imaginary part of the complex number: ";
    cin >> real >> img;
}

void complex2 ::display()
{
    cout << "The complex number is: " << real << " + " << img << "i" << endl;
}

int main()
{
    complex1 c1, c3;
    complex2 c2;
    c1.input();
    c2.input();
    c3.add(c1, c2);
    c1.display();
    c2.display();
    c3.display();
    c3.multiply(c1, c2);
    c3.display();
    c3.divide(c1, c2);
    c3.display();
    return 0;
}
