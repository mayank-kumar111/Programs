// Extend the program in Q16 to include function to perform matrix addition and subtraction.
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
    void add(matrix m1, matrix m2);
    void sub(matrix m1, matrix m2);
};
void matrix::allocate()
{
    mat = new int *[r];
    for (int i = 0; i < r; i++)
    {
        for (int i = 0; i < r; i++)
        {
            mat[i] = new int[c];
        }
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
void matrix ::add(matrix m1, matrix m2)
{
    if (m1.r == m2.r && m1.c == m2.c)
    {
        // r=m1.r;
        // c=m1.c;
        this->r = m1.r;
        this->c = m1.c;
        allocate();
        cout << "The sum of two matrix is :";

        for (int i = 0; i < m1.r; i++)
        {
            for (int j = 0; j < m1.c; j++)
            {
                this->mat[i][j] = m1.mat[i][j] + m2.mat[i][j];
            }
            cout << endl;
        }
    }
    else
    {
        cout << "Addition is not possible";
    }
}
void matrix ::sub(matrix m1, matrix m2)
{
    if (m1.r == m2.r && m1.c == m2.c)
    {
        // r=m1.r;
        // c=m1.c;
        this->r = m1.r;
        this->c = m1.c;
        allocate();
        cout << "The sub of two matrix is :";
        for (int i = 0; i < m1.r; i++)
        {
            for (int j = 0; j < m1.c; j++)
            {
                this->mat[i][j] = m1.mat[i][j] - m2.mat[i][j];
            }
            cout << endl;
        }
    }
    else
    {
        cout << "Subtraction is not possible" << endl;
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
    matrix m1, m2, m3, m4;
    m1.input();
    m2.input();
    m1.output();
    m2.output();
    m3.add(m1, m2);
    m3.output();
    m4.sub(m1, m2);
    m4.output();
    m1.deallocation();
    m2.deallocation();
    m3.deallocation();
    m4.deallocation();
    return 0;
}
