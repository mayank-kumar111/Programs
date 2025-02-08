
// Purpose: Write a program that prints all pairs of elements in an array.
import java.util.*;

public class M8_pairs {
    // public static void main(String[] args) {
    // int[] a = { 1, 2, 3, 4, 5 };
    // pairs(a);
    // }

    // public static void pairs(int[] a) {
    // int count = 0;
    // for (int i = 0; i < a.length; i++) {
    // int current = a[i];
    // for (int j = i + 1; j < a.length; j++) {
    // System.out.print("(" + current + "," + a[j] + ")");
    // count++;
    // }
    // System.out.println();

    // }
    // System.out.println("The number of pairs is " + count);

    // }

    public static void pairs(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            int current = a[i];
            for (int j = i + 1; j < a.length; j++) {
                System.out.print("(" + current + "," + a[j] + ")");
                count++;
            }
            System.out.println();

        }
        System.out.println("The number of pairs is " + count);

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

        pairs(arr);
        sc.close();
    }
}
