// To count number of objects created and destroyed (static, constructor, destructor).
# include <iostream>
using namespace std;

class Array
{
    int *arr;
    int size;
    static int count;

public:
    Array(int s);
    ~Array();
    void display();
    void input();
    static void getCount();
};

int Array::count = 0;

Array::Array(int s)
{
    size = s;
    arr = new int[size];
    count++;
}

Array::~Array()
{
    delete[] arr;
    arr = NULL;
    cout << "Memory deallocated" << endl;
    count--;
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

void Array::getCount()
{
    cout << "Number of objects created: " << count << endl;
}

int main()
{
    Array a1(5);
    Array a2(3);
    a1.input();
    a1.display();
    a2.input();
    a2.display();
    Array::getCount();
    return 0;
}