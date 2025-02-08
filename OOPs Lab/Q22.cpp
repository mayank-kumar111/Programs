// To create a 1-D array dynamically using constructor and destructor.
#include <iostream>
using namespace std;

class Array
{
    int *arr;
    int size;

public:
    Array(int s);
    ~Array();
    void display();
    void input();
};

Array::Array(int s)
{
    size = s;
    arr = new int[size];
}

Array::~Array()
{
    delete[] arr;
    arr = NULL;
    cout << "Memory deallocated" << endl;
}

void Array::display()
{
    cout << "Array elements are: ";
    for (int i = 0; i < size; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;
}

void Array::input()
{
    cout << "Enter the elements of the array: ";
    for (int i = 0; i < size; i++)
    {
        cin >> arr[i];
    }
}
int main()
{
    Array a1(5);
    Array a2(3);
    a1.input();
    a1.display();
    a2.input();
    a2.display();
    return 0;
}