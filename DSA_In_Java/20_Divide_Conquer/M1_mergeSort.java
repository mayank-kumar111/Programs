import java.util.*;

public class M1_mergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Given Array");
        printArray(arr);
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("\nSorted array");
        printArray(arr);
        sc.close();
    }

    // public static void mergeSort(int[] arr, int l, int r) {
    // if (l < r) {
    // int m = l + (r - l) / 2;
    // mergeSort(arr, l, m);
    // mergeSort(arr, m + 1, r);
    // merge(arr, l, m, r);
    // }
    // }

    // public static void merge(int[] arr, int l, int m, int r) {
    // int n1 = m - l + 1;
    // int n2 = r - m;
    // int[] L = new int[n1];
    // int[] R = new int[n2];
    // for (int i = 0; i < n1; i++)
    // L[i] = arr[l + i];
    // for (int j = 0; j < n2; j++)
    // R[j] = arr[m + 1 + j];
    // int i = 0, j = 0;
    // int k = l;
    // while (i < n1 && j < n2) {
    // if (L[i] <= R[j])
    // arr[k++] = L[i++];
    // else
    // arr[k++] = R[j++];
    // }
    // while (i < n1)
    // arr[k++] = L[i++];
    // while (j < n2)
    // arr[k++] = R[j++];
    // }

    public static void printArray(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
    }

    public static void mergeSort(int[] arr, int si, int ei) {
        if (si < ei) {
            int m = si + (ei - si) / 2;
            mergeSort(arr, si, m); // sort the first half
            mergeSort(arr, m + 1, ei); // sort the second half
            merge(arr, si, m, ei); // merge the two halves
        }
    }

    public static void merge(int[] arr, int si, int m, int ei) {
        int temp[] = new int[ei - si + 1]; // temp array to store the sorted array
        // ei-si+1 is the size of the temp array and not ei-si because the array is 0
        // based index and the size of the array is ei-si+1.
        int i = si, j = m + 1, k = 0; // i is the start of the first half, j is the start of the second half, k is the
                                      // index of the temp array
        while (i <= m && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        // if the first half is not completely traversed
        while (i <= m) {
            temp[k++] = arr[i++];
        }
        // if the second half is not completely traversed
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        // copy the elements from temp array to the original array
        // for (int l = si; l <= ei; l++) {
        // arr[l] = temp[l - si];
        // }
        // OR
        // for (int l = 0; l < temp.length; l++) {
        // arr[si + l] = temp[l];
        // }
        // OR
        // for (k = 0; k < temp.length; k++) {
        // arr[si + k] = temp[k];
        // }
        // OR
        // System.arraycopy(temp, 0, arr, si, temp.length);
        // OR
        for (k = 0, i = si; i <= ei; i++, k++) {
            arr[i] = temp[k];
        }
    }
}
