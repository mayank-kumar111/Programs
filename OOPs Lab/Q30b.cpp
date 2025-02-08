// // Write a program to overload binary plus operator using friend function.

#include <iostream>
using namespace std;

class complex
{
    int real, img;

public:
    complex();
    complex(int, int);
    void display();
    friend complex operator+(complex &, complex &); // Friend function
};

complex::complex()
{
    real = 1;
    img = 2;
}

complex::complex(int r, int i)
{
    real = r;
    img = i;
}

void complex ::display()
{
    cout << "The complex number is: " << real << " + " << img << "i" << endl;
}

complex operator+(complex &c1, complex &c2)
{
    complex temp;
    temp.real = c1.real + c2.real;
    temp.img = c1.img + c2.img;
    return temp;
}

int main()
{
    complex c1;
    complex c2(50, 20);
    complex c3;
    c1.display();
    c2.display();
    c3 = c1 + c2; // operator+(c1, c2)
    c3.display();
    return 0;
}
