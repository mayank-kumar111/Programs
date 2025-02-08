// write a program to implement single inheritance in public mode.

#include <iostream>
using namespace std;

class mammal
{
    public:
    void eat();
    void sleep();
};

class dog : public mammal
{
    public:
    void bark();
};

void mammal::eat()
{
    cout << "Mammal is eating." << endl;
}

void mammal::sleep()
{
    cout << "Mammal is sleeping." << endl;
}

void dog::bark()
{
    cout << "Dog is barking." << endl;
}

int main()
{
    dog d1;
    d1.eat();
    d1.sleep();
    d1.bark();
    return 0;
}