#include <stdio.h>
#include <string.h>

int main()
{
    int array[20], temp, n;
    printf("Enter the number of element (max.20):");
    scanf("%d", &n);
    printf("Enter the value of %d element :\n", n);
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &array[i]);
    }
    printf("The given number are :");
    for (int i = 0; i < n; i++)
    {
        printf("\t%d", array[i]);
    }
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = 0; j < n - i - 1; j++)
        {
            if (array[j] > array[j + 1])
            {
                temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;   
            }
        }
    }
    printf("\nThe sorted number are :");
    for (int i = 0; i < n; i++)
    {
        printf("%d\t", array[i]);
    }
    return 0;
}