// Write a program to implement runtime polymorphism/ dynamic binding.

#include <iostream>
using namespace std;

class base
{
public:
    virtual void show()
    {
        cout << "Show of base class" << endl;
    }
    virtual void display()
    {
        cout << "Display of base class" << endl;
    }
};

class derived : public base
{
public:
    void show()
    {
        cout << "Show of derived class" << endl;
    }
    void display()
    {
        cout << "Display of derived class" << endl;
    }
};

int main()
{
    base *b, B1;
    derived D1;
    b = &D1;
    b->show();
    b->display();
    b = &B1;
    b->show();
    b->display();
    return 0;
}