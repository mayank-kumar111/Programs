// binary search in an array
#include <stdio.h>
#include <string.h>
int binarySearch(int arr[], int n, int key)
{
    int low = 0, high = n - 1, mid;
    while (low <= high)
    {
        mid = (low + high) / 2;
        if (arr[mid] == key)
        {
            return mid;
        }
        else if (arr[mid] < key)
        {
            low = mid + 1;
        }
        else
        {
            high = mid - 1;
        }
    }
    return -1;
}
int main()
{
    int n, key;
    printf("Enter the number of element in the array: ");
    scanf("%d", &n);
    int arr[n];

    printf("Enter the element in the array: ");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }
    printf("Enter the element to search: ");
    scanf("%d", &key);
    int result = binarySearch(arr, n, key);
    if (result == -1)
    {
        printf("Element not found\n");
    }
    else
    {
        printf("Element found at index %d\n", result + 1);
    }
    return 0;
}
