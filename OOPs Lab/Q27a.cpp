// overload pre increment and post increment operators for complex numbers : using member function

#include <iostream>
using namespace std;
class complex
{
    int real, img;

public:
    void input();
    void display();
    void operator++();
    void operator++(int);
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

void complex ::operator++()
{
    real = ++real;
    img = ++img;
}
void complex ::operator++(int)
{
    real = real++;
    img = img++;
}

int main()
{
    complex c1;
    c1.input();
    c1.display();
    ++c1;
    c1.display();
    c1++;
    c1.display();
    return 0;
}