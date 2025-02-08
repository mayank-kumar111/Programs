// public class M6_binarySearch {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         int target = 5;
//         System.out.println(binarySearch(arr, target));
//     }

//     public static int binarySearch(int[] arr, int target) {
//         int start = 0;
//         int end = arr.length - 1;

//         while(start <= end) {
//             int mid = start + (end - start) / 2;

//             if(target < arr[mid]) {
//                 end = mid - 1;
//             } else if(target > arr[mid]) {
//                 start = mid + 1;
//             } else {
//                 return mid;
//             }
//         }

//         return -1;
//     }

//     // Time complexity: O(log n)
//     // Space complexity: O(1)
// }

import java.util.*;

public class M6_binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element: ");
        int target = sc.nextInt();
        int search = binarySearch(arr, target);
        if (search == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + search);
        }
        sc.close();
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    // Time complexity: O(log n)
    // Space complexity: O(1)
}
