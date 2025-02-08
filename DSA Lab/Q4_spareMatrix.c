// #include <stdio.h>

// int main()
// {
//     int matrix1[4][4], i, j, x = -1, matrix2[x][3];
//     printf("Enter the value of 4*4 matrix :");
//     for (i = 0; i < 4; i++)
//     {
//         printf("\n");
//         for (j = 0; j < 4; j++)
//         {

//             scanf("%d", &matrix1[i][j]);
//             if (matrix1[i][j] != 0)
//             {
//                 x++;
//                 matrix2[x][0] = i;
//                 matrix2[x][1] = j;
//                 matrix2[x][2] = matrix1[i][j];
//             }
//         }
//     }
//     printf("The 3-colum representation of the matrix :\n");
//     printf("row \tcol \tvalue \n");
//     for (i = 0; i <= x; i++)
//     {
//         for (j = 0; j < 3; j++)
//         {
//             printf("%d\t", matrix2[i][j]);
//         }
//         printf("\n");
//     }
//     return 0;
// }

// spare Matrix

#include <stdio.h>

int main()
{
    int matrix1[4][4], i, j, x = -1, matrix2[100][3];
    printf("Enter the value of 4*4 matrix :");
    for (i = 0; i < 4; i++)
    {
        printf("\n");
        for (j = 0; j < 4; j++)
        {
            scanf("%d", &matrix1[i][j]);
            if (matrix1[i][j] != 0)
            {
                x++;
                matrix2[x][0] = i;
                matrix2[x][1] = j;
                matrix2[x][2] = matrix1[i][j];
            }
        }
    }
    printf("The 3-colum representation of the matrix :\n");
    printf("row \tcol \tvalue \n");
    for (i = 0; i <= x; i++)
    {
        for (j = 0; j < 3; j++)
        {
            printf("%d\t", matrix2[i][j]);
        }
        printf("\n");
    }
    return 0;
}