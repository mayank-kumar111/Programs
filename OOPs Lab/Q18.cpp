// To multiply two martix(dyanmic creation) using matrix class.
#include <iostream>
using namespace std;

class matrix
{
    int r, c;
    int **mat;

public:
    void allocate();
    void input();
    void output();
    void deallocation();
    void mul(matrix m1, matrix m2);
};

void matrix::allocate()
{
    mat = new int *[r];
    for (int i = 0; i < r; i++)
    {
        mat[i] = new int[c];
    }
}

void matrix ::input()
{
    cout << "Enter the row and column of matrix:" << endl;
    cin >> r >> c;
    allocate();
    cout << "Enter matrix element:" << endl;
    for (int i = 0; i < r; i++)
    {
        // cout<<"\n";
        for (int j = 0; j < c; j++)
        {
            cin >> mat[i][j];
        }
    }
}

void matrix ::output()
{
    cout << "Your matrix is:" << endl;
    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c; j++)
        {
            cout << mat[i][j];
            cout << "\t";
        }
        cout << endl;
    }
    cout << endl;
}

void matrix ::mul(matrix m1, matrix m2)
{
    if (m1.c == m2.r)
    {
        this->r = m1.r;
        this->c = m2.c;
        allocate();
        cout << "The multiplication of two matrix is :";
        for (int i = 0; i < m1.r; i++)
        {
            for (int j = 0; j < m2.c; j++)
            {
                this->mat[i][j] = 0;
                for (int k = 0; k < m1.c; k++)
                {
                    this->mat[i][j] += m1.mat[i][k] * m2.mat[k][j];
                }
            }
        }
    }
    else
    {
        cout << "Multiplication is not possible" << endl;
    }
}

void matrix ::deallocation()
{
    for (int i = 0; i < r; i++)
    {
        delete[] mat[i];
    }
    delete[] mat;
    mat = NULL;
    cout << "Deallocation is complete.\n";
}

int main()
{
    matrix m1, m2, m3;
    m1.input();
    m2.input();
    m1.output();
    m2.output();
    m3.mul(m1, m2);
    m3.output();
    m1.deallocation();
    m2.deallocation();
    m3.deallocation();
    return 0;
}