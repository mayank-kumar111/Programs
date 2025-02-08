import java.util.*;
public class M6_arrayIsSorted {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.print("Array is: ");
        System.out.println(Arrays.toString(arr));
        scn.close();
        if (isSorted(arr, 0)) {
            System.out.println("Array is sorted.");
        } else {
            System.out.println("Array is not sorted.");
        }
    }

    public static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        return isSorted(arr, index + 1);
    }
}
