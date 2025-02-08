// write a program to implement concept of friend function for complex number. an external function friend to a class,an external function friend to a more than one class, a member function of a class friend to another class.

#include <iostream>
using namespace std;

// Friend function to a class
class complex
{
    int real, img;

public:
    void input();
    void display();
    friend complex add(complex &, complex &);
};
void complex::input()
{
    cout << "Enter complex no. : ";
    cin >> real >> img;
}
void complex::display()
{
    cout << "The complex number is: " << real << " + " << img << "i" << endl;
    
}
complex add(complex &c1, complex &c2)
{
    complex temp;
    temp.real = c1.real + c2.real;
    temp.img = c1.img + c2.img;
    return temp;
}

int main()
{
    complex c1, c2, c3;
    c1.input();
    c2.input();
    c3 = add(c1, c2);
    c1.display();
    c2.display();
    c3.display();
    return 0;
}



