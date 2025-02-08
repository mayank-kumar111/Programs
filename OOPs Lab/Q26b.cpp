// Overload unary minus operator for complex numbers: using friend function
#include <iostream>
using namespace std;
class complex
{
    int real, img;

public:
    complex();
    complex(int, int);
    void display();
    friend void operator-(complex &);
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
void operator-(complex &c)
{
    c.real = -c.real;
    c.img = -c.img;
}
main()
{
    complex c1;
    complex c2(50, 20);
    c1.display();
    c2.display();
    -c1; //  c1.operator -()
    -c2; // c2.oprerator -()
    c1.display();
    c2.display();
}