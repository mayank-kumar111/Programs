// Write a program to implement abstract class and pure virtual function.

#include <iostream>
using namespace std;

class Shape
{
protected:
    float length, breadth;

public:
    virtual void area() = 0;
};

class Rectangle : public Shape
{
public:
    void area()
    {
        cout << "Enter length and breadth of rectangle: ";
        cin >> length >> breadth;
        cout << "Area of rectangle: " << length * breadth << endl;
    }
};

class Circle : public Shape
{
public:
    void area()
    {
        cout << "Enter radius of circle: ";
        cin >> length;
        cout << "Area of circle: " << 3.14 * length * length << endl;
    }
};

int main()
{
    Shape *s;
    Rectangle r;
    Circle c;
    s = &r;
    s->area();
    s = &c;
    s->area();
    return 0;
}
