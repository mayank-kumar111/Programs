import java.util.*;

public class M7_reverseAnArray {
    // public static void main(String[] args) {
    // int[] arr = {1, 2, 3, 4, 5};
    // reverseArray(arr);
    // // for (int i : arr) {
    // // System.out.print(i + " ");
    // // }
    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i] + " ");
    // }
    // }

    // private static void reverseArray(int[] arr) {
    // int start = 0;
    // int end = arr.length - 1;
    // while (start < end) {
    // int temp = arr[start];
    // arr[start] = arr[end];
    // arr[end] = temp;
    // start++;
    // end--;
    // }
    // }

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The original array is: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        reverseArray(arr);
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
        System.out.println("\nThe reversed array is: ");

        for (int i : arr) {
            System.out.print(i + " ");
        }
        sc.close();

    }
}
