import java.util.*;
public class M9_subArrays {
    // public static void main(String[] args) {
    //     int[] arr = { 1, 2, 3, 4, 5 };
    //     subArrays(arr);
    // }

    // public static void subArrays(int[] arr) {
    //     for (int i = 0; i < arr.length; i++) { // i is the starting index
    //         for (int j = i; j < arr.length; j++) { // j is the ending index
    //             for (int k = i; k <= j; k++) {
    //                 System.out.print(arr[k] + " ");
    //             }
    //             System.out.println();
    //         }
    //         System.out.println();
    //     }
    // }

    public static void subArrays(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) { // i is the starting index
            for (int j = i; j < arr.length; j++) { // j is the ending index
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                count++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The number of subarrays is " + count);
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
        System.out.println("The original array is:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        subArrays(arr);
        sc.close();
    }

}
