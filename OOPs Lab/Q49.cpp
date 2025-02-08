// Write a progran to implement function template.

#include <iostream>
using namespace std;

template <class T>
T maximum(T a, T b)
{
    if (a > b)
    {
        return a;
    }
    else
    {
        return b;
    }
}

int main()
{
    cout << "The maximum of 4 and 5 is: " << maximum(4, 5) << endl;
    cout << "The maximum of 4.5 and 5.5 is: " << maximum(4.5, 5.5) << endl;
    return 0;
}