// To compute transpose of a martix using matrix class.
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
    void trans(matrix m1);
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

void matrix ::trans(matrix m1)
{
    this->r = m1.c;
    this->c = m1.r;
    allocate();
    cout << "The transpose of matrix is :";
    for (int i = 0; i < m1.r; i++)
    {
        for (int j = 0; j < m1.c; j++)
        {
            this->mat[j][i] = m1.mat[i][j];
        }
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
    matrix m1, m2;
    m1.input();
    m1.output();
    m2.trans(m1);
    m2.output();
    m1.deallocation();
    m2.deallocation();
    return 0;
}