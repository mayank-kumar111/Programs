// Write a program to handle an exception using multiple catch blocks.

#include <iostream>
using namespace std;

void test(int x)
{
    try
    {
        if (x == 0)
        {
            throw x;
        }
        if (x == 1)
        {
            throw 'x';
        }
        if (x == 2)
        {
            throw 1.0;
        }
        else
        {
            cout << "x = " << x << endl;
        }
    }
    catch (int x)
    {
        cout << "Caught an integer exception." << endl;
    }
    catch (char x)
    {
        cout << "Caught a character exception." << endl;
    }
    catch (double x)
    {
        cout << "Caught a double exception." << endl;
    }
    catch (...)
    {
        cout << "Default exception." << endl;
    }
}

int main()
{
    test(0);
    test(1);
    test(2);
    test(3);
    return 0;
}