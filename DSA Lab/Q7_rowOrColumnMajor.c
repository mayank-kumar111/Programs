// Write a program to store and display a 3*4 2D array and print it in row major order and column major order using switch case.

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
