// write a program to overload ! to compute complement of a matrix. (M2=!M1) M1 = 1 2 3 0 and M2 = 0 0 0 1 .

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

    Matrix operator!()
    {
        Matrix temp;
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                temp.a[i][j] = !a[i][j];
            }
        }
        return temp;
    }
};

int main()
{
    Matrix m1, m2;
    m1.input();
    m2 = !m1;
    m2.display();
    return 0;
}