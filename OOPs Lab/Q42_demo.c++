// Write a program to overload + operator for adding two matrices. (M3=M1+M2)

#include <iostream>
using namespace std;

class Matrix
{
    int a[2][2];

public:
    void input()
    {
        cout << "Enter the elements of the matrix: " << endl;
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                cin >> a[i][j];
            }
        }
    }

    void display()
    {
        cout << "The matrix is: " << endl;
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                cout << a[i][j] << " ";
            }
            cout << endl;
        }
    }

    Matrix operator+(Matrix m)
    {
        Matrix temp;
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                temp.a[i][j] = a[i][j] + m.a[i][j];
            }
        }
        return temp;
    }
};

int main()
{
    Matrix m1, m2, m3;
    m1.input();
    m2.input();
    m3 = m1 + m2;
    m3.display();
    return 0;
}