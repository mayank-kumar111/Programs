import java.util.*;

public class M12_maxSubarraySumIII {
    public static void kadanesAlgo(int[] arr) {
        // int n = arr.length;
        int maxSum = Integer.MIN_VALUE; // Max sum of subarray
        int sum = 0; // Current sum of subarray
        for (int i : arr) {
            sum += i;
            maxSum = Math.max(maxSum, sum);
            if (sum < 0)
                sum = 0;
        }
        System.out.println("Max sum of subarray using Kadane's Algorithm: " + maxSum);

    }

    public static void main(String[] args) {
        // int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array: " + Arrays.toString(arr)); // Using Arrays.toString() to print array
        // System.out.println("Your array is: ");
        kadanesAlgo(arr);
        sc.close();
    }
}
//  Time Complexity: O(n)
//  Space Complexity: O(1)