//search the number in a given array using linear search and also find the location of the number in the array.
# include <stdio.h>
# include <string.h>

int main(){
    int n;
    printf("Enter the number of elements in the array: ");
    scanf("%d", &n);
    int arr[n];
    printf("Enter the elements of the array: ");
    for(int i=0; i<n; i++){
        scanf("%d", &arr[i]);
    }
    int num;
    printf("Enter the number to search: ");
    scanf("%d", &num);
    int flag = 0;
    for(int i=0; i<n; i++){
        if(arr[i] == num){
            printf("The number is found at location : %d\n", i+1);
            flag = 1;
            break;
        }
    }
    if(flag == 0){
        printf("The number is not found in the array\n");
    }
    return 0;
}