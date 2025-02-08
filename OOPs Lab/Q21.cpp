// define a class complex to represent complex numbers, initialize them using default constructor, parameterized constructor and construction overloading. Also, include a function to add two comlex numbers.
#include <iostream>
using namespace std;

class complex
{
    int real, img;

public:
    complex();
    complex(int);
    complex(int, int);
    void add(complex , complex);
    void display();
};

void complex ::display()
{
    cout << "The complex number is: " << real << " + " << img << "i" << endl;
}

complex ::complex()
{
    real = 10;
    img = 5;
}

complex ::complex(int x){
    real=img=x;
}

complex ::complex(int r, int i)
{
    real = r;
    img = i;
}

void complex ::add(complex c1, complex c2)
{
    real = c1.real + c2.real;
    img = c1.img + c2.img;
}

int main()
{
    complex c1,c3(30), c4(5, 6), c5(c4),c6;
    complex c2=10;
    c1.display();
    c2.display();
    c6.add(c1, c2);
    c6.display();
    c3.display();
    c4.display();
    c5.display();
    return 0;
}