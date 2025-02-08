// Write a program to calculate and print the address of the given location in row-major and column-major order in 2D array using switch case. use formula to find the address of the given location in row-major and column-major order.

// #include <stdio.h>

// int main()
// {
//     int arr[3][4], i, j, choice;

//     printf("Enter the elements of the 3*4 2D array:");
//     for (i = 0; i < 3; i++)
//     {
//         printf("\n");
//         for (j = 0; j < 4; j++)
//         {
//             scanf("%d", &arr[i][j]);
//         }
//     }
//     int base, w, i1, j1, lr, lc, n, m;
//     // Input values
//     printf("Enter base address: ");
//     scanf("%d", &base);
//     printf("Enter storage size of one element (in bytes): ");
//     scanf("%d", &w);
//     printf("Enter row index (i): ");
//     scanf("%d", &i1);
//     printf("Enter column index (j): ");
//     scanf("%d", &j1);
//     printf("Enter lower limit of row (lr): ");
//     scanf("%d", &lr);
//     printf("Enter lower limit of column (lc): ");
//     scanf("%d", &lc);
//     printf("Enter number of columns (n): ");
//     scanf("%d", &n);
//     printf("Enter number of rows (m): ");
//     scanf("%d", &m);

//     while (1)
//     {
//         printf("Enter Your choice : \nEnter 1 to print in row major order \nEnter 2 to print in column major order\nEnter 3 to Exit\n");
//         scanf("%d", &choice);
//         switch (choice)
//         {
//         case 1:
//             printf("The 2D array in row major order is: \n");
//             for (i = 0; i < 3; i++)
//             {
//                 for (j = 0; j < 4; j++)
//                 {
//                     printf("%d ", arr[i][j]);
//                 }
//                 printf("\n");
//             }
//             printf("Address in Row-Major Order: %d\n",base + w * ((i1 - lr) * n + (j1 - lc)));
//             break;
//         case 2:
//             printf("The 2D array in column major order is: \n");
//             for (j = 0; j < 4; j++)
//             {
//                 for (i = 0; i < 3; i++)
//                 {
//                     printf("%d ", arr[i][j]);
//                 }
//                 printf("\n");
//             }
//             printf("Address in Column-Major Order: %d\n",base + w * ((j1 - lc) * m + (i1 - lr)));
//             break;
//         case 3:
//             printf("Exit");
//             return 0;
//         default:
//             printf("Invalid choice");
//         }
//     }
//     return 0;
// }
#include <stdio.h>

int main()
{
    int arr[3][4], i, j, choice;

    printf("Enter the elements of the 3*4 2D array:");
    for (i = 0; i < 3; i++)
    {
        printf("\n");
        for (j = 0; j < 4; j++)
        {
            scanf("%d", &arr[i][j]);
        }
    }
    int base = 100, w = 4, i1, j1, lr = 0, lc = 0, n = 4, m = 3;
    // Input values
    printf("Enter row index (i): ");
    scanf("%d", &i1);
    printf("Enter column index (j): ");
    scanf("%d", &j1);
    while (1)
    {
        printf("Enter Your choice : \nEnter 1 to print in row major order \nEnter 2 to print in column major order\nEnter 3 to Exit\n");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            printf("The 2D array in row major order is: \n");
            for (i = 0; i < 3; i++)
            {
                for (j = 0; j < 4; j++)
                {
                    printf("%d ", arr[i][j]);
                }
                printf("\n");
            }
            printf("Address in Row-Major Order: %d\n", base + w * ((i1 - lr) * n + (j1 - lc)));
            break;
        case 2:
            printf("The 2D array in column major order is: \n");
            for (j = 0; j < 4; j++)
            {
                for (i = 0; i < 3; i++)
                {
                    printf("%d ", arr[i][j]);
                }
                printf("\n");
            }
            printf("Address in Column-Major Order: %d\n", base + w * ((j1 - lc) * m + (i1 - lr)));
            break;
        case 3:
            printf("Exit");
            return 0;
        default:
            printf("Invalid choice");
        }
    }
    return 0;
}
