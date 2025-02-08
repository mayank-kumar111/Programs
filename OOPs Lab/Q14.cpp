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
    void countPrime();
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
void array::countPrime()
{
    int count = 0;
    for (int i = 0; i < size; i++)
    {
        int flag = 0;
        for (int j = 2; j < p[i]; j++)
        {
            if (p[i] % j == 0)
            {
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            count++;
    }
    cout << "Total prime number in array is: " << count << "\n";
}

int main()
{
    array a1;
    a1.getdata();
    a1.display();
    a1.countPrime();
    a1.deallocate();
    return 0;
}
