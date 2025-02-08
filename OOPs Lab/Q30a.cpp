// Write a program to overload binary plus operator using member function.

#include <iostream>
using namespace std;

class complex
{
    int real, img;

public:
    complex();
    complex(int, int);
    void display();
    complex operator+(complex &c); // Member function
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

complex complex ::operator+(complex &c)
{
    complex temp;
    temp.real = real + c.real;
    temp.img = img + c.img;
    return temp;
}

int main()
{
    complex c1;
    complex c2(50, 20);
    complex c3;
    c1.display();
    c2.display();
    c3 = c1 + c2; // c1.operator+(c2)
    c3.display();
    return 0;
}

