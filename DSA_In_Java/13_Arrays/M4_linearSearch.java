import java.util.*;

public class M4_linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int key = sc.nextInt();
        int index = linearSearch(arr, key);
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + index);
        }
        sc.close();

        // String linearSearch
        String[] arr1 = { "Java", "Python", "C++", "Ruby", "JavaScript" };
        String key1 = "C++";
        int index1 = linearSearch(arr1, key1);
        System.out.println("String linear search: ");
        if (index1 == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + index1);
        }
    }

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    // Time complexity: O(n)
    // Space complexity: O(1)

    // String linearSearch.

    public static int linearSearch(String[] arr, String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) { // if (arr[i].equals(key)) use equals() method to compare strings
                return i;
            }
        }
        return -1;
    }
    // Time complexity: O(n)
    // Space complexity: O(1)

}
