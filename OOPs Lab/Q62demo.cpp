// Write a program to handel an exception for division by zero (using try, catch, throw blocks).

#include <iostream>
using namespace std;

void division(int a, int b)
{
    if(b!=0)
    {
        cout << "Division is: " << a/b << endl;
    }
    else
    {
        throw b;
    }
}

int main()
{
    int a, b;
    cout << "Enter two numbers: " << endl;
    cin >> a >> b;
    try
    {
        division(a, b);
    }
    catch(int e)
    {
        cout << "Division by zero is not possible." << endl;
    }
    return 0;
}