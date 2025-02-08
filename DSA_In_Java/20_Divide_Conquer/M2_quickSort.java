public class M2_quickSort {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }

    public static void quickSort(int[] arr, int si, int ei) {
        if (si < ei) {
            int pi = partition(arr, si, ei);
            quickSort(arr, si, pi - 1); // Before pi
            quickSort(arr, pi + 1, ei); // After pi
        }
    }

    public static int partition(int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // Index of smaller element
        for (int j = si; j < ei; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j] 
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // int temp = arr[i + 1];
        // arr[i + 1] = arr[ei];
        // arr[ei] = temp;
        // return i + 1;
        // or
        i++;
        int temp = pivot;
        arr[ei] = arr[i]; // not pivot=arr[i]
        arr[i] = temp;
        return i;
    }

    public static void printArray(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
    }
}
