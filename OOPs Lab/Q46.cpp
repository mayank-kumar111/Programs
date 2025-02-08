// Write a program to design a class templante to represent an array inclide following operation.
// 1. search an element and return its index, return -1 if not found.
// 2. find out the second largest element of the array.
// 3. find out the second smallest element of the array.
// 4. sort the array in dessending order.
// create object for int, char and  double data type.

#include <iostream>
using namespace std;

template <class T>
class Array
{
    T *arr;
    int size;

public:
    Array(int s)
    {
        size = s;
        arr = new T[size];
    }

    void input()
    {
        cout << "Enter the elements of the array: " << endl;
        for (int i = 0; i < size; i++)
        {
            cin >> arr[i];
        }
    }

    int search(T key)
    {
        for (int i = 0; i < size; i++)
        {
            if (arr[i] == key)
            {
                return i;
            }
        }
        return -1;
    }

    T secLarg()
    {
        T max = arr[0];
        T secondMax = arr[size - 1];
        for (int i = 0; i < size; i++)
        {
            if (arr[i] > max)
            {
                secondMax = max;
                max = arr[i];
            }
            else if (arr[i] > secondMax && arr[i] != max)
            {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    T secSmall()
    {
        T min = arr[0];
        T secondMin = arr[size - 1];
        for (int i = 0; i < size; i++)
        {
            if (arr[i] < min)
            {
                secondMin = min;
                min = arr[i];
            }
            else if (arr[i] < secondMin && arr[i] != min)
            {
                secondMin = arr[i];
            }
        }
        return secondMin;
    }

    void sort()
    {
        for (int i = 0; i < size; i++)
        {
            for (int j = i + 1; j < size; j++)
            {
                if (arr[i] < arr[j])
                {
                    T temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    void display()
    {
        cout << "The array is: " << endl;
        for (int i = 0; i < size; i++)
        {
            cout << arr[i] << " ";
        }
        cout << endl;
    }
};

int main()
{
    Array<int> a1(5);
    cout << "For integer data type: " << endl;
    a1.input();
    cout << "Enter the element to search: ";
    int key;
    cin >> key;
    cout << "The index of the element is: " << a1.search(key) << endl;
    cout << "The second largest element is: " << a1.secLarg() << endl;
    cout << "The second smallest element is: " << a1.secSmall() << endl;
    a1.sort();
    a1.display();

    Array<char> a2(5);
    cout << "For character data type: " << endl;
    a2.input();
    cout << "Enter the element to search: ";
    char key2;
    cin >> key2;
    cout << "The index of the element is: " << a2.search(key2) << endl;
    cout << "The second largest element is: " << a2.secLarg() << endl;
    cout << "The second smallest element is: " << a2.secSmall() << endl;
    a2.sort();
    a2.display();

    Array<double> a3(5);
    cout << "For double data type: " << endl;
    a3.input();
    cout << "Enter the element to search: ";
    double key3;
    cin >> key3;
    cout << "The index of the element is: " << a3.search(key3) << endl;
    cout << "The second largest element is: " << a3.secLarg() << endl;
    cout << "The second smallest element is: " << a3.secSmall() << endl;
    a3.sort();
    a3.display();
    return 0;
}