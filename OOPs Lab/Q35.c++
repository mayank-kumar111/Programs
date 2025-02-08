// Write a program to implement multiple inheritance.

# include <iostream>
using namespace std;

class mammal
{
    public:
    void eat();
    void sleep();
};

class bird
{
    public:
    void fly();
};

class bat : public mammal, public bird
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

void bird::fly()
{
    cout << "Bird is flying." << endl;
}

void bat::bark()
{
    eat();
    sleep();
    fly();
    cout << "Bat is barking." << endl;
}

int main()
{
    bat b1;
    b1.bark();
    return 0;
}
