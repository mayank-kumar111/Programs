// Member function of class, friend to another class.

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
};

class complex2
{
    int real, img;

public:
    void input();
    void display();
    friend void complex1::add(complex1 &, complex2 &);
};

void complex1::input()
{
    cout << "Enter complex no. : ";
    cin >> real >> img;
}
void complex1::display()
{
    cout << "The complex number is: " << real << " + " << img << "i" << endl;
}

void complex2::input()
{
    cout << "Enter complex no. : ";
    cin >> real >> img;
}
void complex2::display()
{
    cout << "The complex number is: " << real << " + " << img << "i" << endl;
}

void complex1::add(complex1 &c1, complex2 &c2)
{
    cout << "The sum of the complex numbers is: " << c1.real + c2.real << " + " << c1.img + c2.img << "i" << endl;
}

int main()
{
    complex1 c1;
    complex2 c2;
    c1.input();
    c2.input();
    c1.display();
    c2.display();
    c1.add(c1, c2);
    return 0;
}