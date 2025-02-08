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
    void maxMin();
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
void array::maxMin()
{
    int max = p[0], min = p[0];
    for (int i = 1; i < size; i++)
    {
        if (p[i] < min)
        {
            min = p[i];
        }
        if (p[i] > max)
        {
            max = p[i];
        }
    }
    cout << "Minimum element: " << min << endl;
    cout << "Maximum element: " << max << endl;
}

int main()
{
    array a1;
    a1.getdata();
    a1.display();
    a1.maxMin();
    a1.deallocate();

    return 0;
}
