// Write a program to implement virtual destructor.

#include <iostream>
using namespace std;

class Base
{
public:
    Base()
    {
        cout << "Constructor of Base class" << endl;
    }

    virtual ~Base()
    {
        cout << "Destructor of Base class" << endl;
    }
};

class Derived : public Base
{
public:
    Derived()
    {
        cout << "Constructor of Derived class" << endl;
    }

    ~Derived()
    {
        cout << "Destructor of Derived class" << endl;
    }
};

int main()
{
    Base *bp;
    bp = new Base();
    delete bp;
    bp = new Derived();
    delete bp;
    return 0;
}
