// Design a class matrix and perform input and output operation use dynamic memory allocation and deallocation.
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
    cout << "Enter the row and column of matrix:\n";
    cin >> r >> c;
    allocate();
    cout << "Enter array element :\n";
    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c; j++)
        {
            cin >> mat[i][j];
        }
        cout << endl;
    }
}
void matrix ::output()
{
    cout << "Your matrix is:\n";
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
    matrix m1;
    m1.input();
    m1.output();
    m1.deallocation();
    return 0;
}