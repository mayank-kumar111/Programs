// Write a program to overload stream operators.

#include <iostream>
using namespace std;

class complex
{
    int real, img;

public:
    void input();
    void display();
    friend ostream &operator<<(ostream &, complex &); // Friend function
    friend istream &operator>>(istream &, complex &); // Friend function
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

ostream &operator<<(ostream &dout, complex &c)
{
    dout << "The complex number is: " << c.real << " + " << c.img << "i" << endl;
    return dout;
}

istream &operator>>(istream &din, complex &c)
{
    din >> c.real >> c.img;
    return din;
}

int main()
{
    complex c1, c2;
    cout << "Enter the real part and imaginary part of the first complex number: ";
    cin >> c1;
    cout << "Enter the real part and imaginary part of the second complex number: ";
    cin >> c2; 
    cout << c1;
    cout << c2;
    return 0;
}