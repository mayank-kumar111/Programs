// Enter the value of m and n and then the matrix1 and matrix2 elements. Find the sum of the matrix elements. program in C
#include <stdio.h>
#include <string.h>

int main()
{
    int m, n;
    printf("Enter the value of m and n: ");
    scanf("%d %d", &m, &n);
    int matrix1[m][n], matrix2[m][n];
    printf("Enter the matrix1 elements: ");
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            scanf("%d", &matrix1[i][j]);
        }
    }
    printf("Enter the matrix2 elements: ");
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            scanf("%d", &matrix2[i][j]);
        }
    }
    printf("The sum of the matrix elements is: \n");
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            printf("%d \t", matrix1[i][j] + matrix2[i][j]);
        }
        printf("\n");
    }
    return 0;
}
