// Write a program to compare 2 Matrix using == operator overloading.

#include <iostream>
using namespace std;

class Matrix
{
    int arr[2][2];

public:
    void input();
    void display();
    bool operator==(Matrix &m);
};

void Matrix::input()
{
    cout << "Enter the elements of the matrix: " << endl;
    for (int i = 0; i < 2; i++)
    {
        for (int j = 0; j < 2; j++)
        {
            cin >> arr[i][j];
        }
    }
}

void Matrix::display()
{
    cout << "The matrix is: " << endl;
    for (int i = 0; i < 2; i++)
    {
        for (int j = 0; j < 2; j++)
        {
            cout << arr[i][j] << " ";
        }
        cout << endl;
    }
}

bool Matrix::operator==(Matrix &m)
{
    for (int i = 0; i < 2; i++)
    {
        for (int j = 0; j < 2; j++)
        {
            if (arr[i][j] != m.arr[i][j])
            {
                return false;
            }
        }
    }
    return true;
}

int main()
{
    Matrix m1, m2;
    m1.input();
    m2.input();
    m1.display();
    m2.display();
    if (m1 == m2)
    {
        cout << "The matrices are equal." << endl;
    }
    else
    {
        cout << "The matrices are not equal." << endl;
    }
    return 0;
}