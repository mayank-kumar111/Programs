import java.util.*;

public class M1_bubbleSort {

   public static void swap(int[] arr, int i, int j) {
        // To swap the actual values in the array, we need to pass the array and the indices to be swapped
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;  
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    // int temp = arr[j];
                    // arr[j] = arr[j + 1];
                    // arr[j + 1] = temp;
                    // swap(arr[j], arr[j + 1]); // This will not work as it will not swap the actual values in the array

                    // To swap the actual values in the array, we need to pass the array and the indices to be swapped
                    swap(arr, j, j + 1);

                }
            }
        }
    }

    public static void bubbleSortOptimized(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr,j,j+1); 
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, then the array is already
            // sorted
            if (swapped == false)
                break;
        }
    }

    public static void printArray(int[] arr) {
        // int n = arr.length;
        // for (int i = 0; i < n; ++i)
        // System.out.print(arr[i] + " ");
        // System.out.println();
        System.out.print(Arrays.toString(arr));
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before sorting: ");
        printArray(arr);
        bubbleSort(arr);
        System.out.println("Array after sorting: ");
        printArray(arr);
        System.out.println("Array after using optimized bubble sort: ");
        bubbleSortOptimized(arr);
        printArray(arr);
        sc.close();

    }
}
// Time Complexity: O(n^2)