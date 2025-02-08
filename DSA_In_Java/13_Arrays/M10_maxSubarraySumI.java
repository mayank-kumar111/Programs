import java.util.*;

public class M10_maxSubarraySumI {
    public static void maxSubarraySum(int arr[]) {
        int currSum = 0;
        int count = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) { // i is the starting index
            for (int j = i; j < arr.length; j++) { // j is the ending index
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    currSum += arr[k];
                }
                // System.out.println("The subarray is from index " + i + " to " + j);
                System.out.print(": ");
                System.out.println("The sum of the subarray is " + currSum);
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
                count++;
                // System.out.println();
            }
            System.out.println();
        }
        System.out.println("The number of subarrays is " + count);
        System.out.println("The maximum sum of the subarrays is " + maxSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("\nThe array is ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        maxSubarraySum(arr);
        sc.close();
    }
}
// Time Complexity: O(n^3)
// Space Complexity: O(1)
