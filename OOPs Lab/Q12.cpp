#include <iostream>
// #include <string>
using namespace std;

class array
{
    int size, *p;

public:
    void allocate();
    void getdata();
    void display();
    void search();
    void deallocate();
};
void array::allocate()
{
    p = new int[size];
}
void array::getdata()
{
    cout << "Enter size of array:\n";
    cin >> size;
    allocate();
    cout << "Enter the array element:\n";
    for (int i = 0; i < size; i++)
        cin >> p[i];
}
void array::display()
{
    cout << "Your array element are:\n";
    for (int i = 0; i < size; i++)
        cout << p[i] << "\n";
}
void array::deallocate()
{
    // int *p = new int[size];
    delete p;
    p = NULL;
    cout << "Deallocation is complete.\n";
}
void array::search()
{
    int key, flag = 0;
    cout << "Enter search element:\n";
    cin >> key;
    for (int i = 0; i < size; i++)
    {
        if (p[i] == key)
        {
            flag = 1;
        }
    }
    if (flag == 1)
        cout << "Element is found\n";
    else
        cout << "Element is not found\n";
}

int main()
{
    array a1;
    a1.getdata();
    a1.display();
    a1.search();
    a1.deallocate();

    return 0;
}
