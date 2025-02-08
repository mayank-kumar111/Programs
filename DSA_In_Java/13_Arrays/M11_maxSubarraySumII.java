import java.util.*;

public class M11_maxSubarraySumII {

    public static void maxSubarraySum(int arr[]) {
        int n = arr.length;
        int currSum = 0;
        int count = 0;
        int maxSum = Integer.MIN_VALUE;
        int prifixSum[] = new int[n];
        prifixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prifixSum[i] = prifixSum[i - 1] + arr[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                currSum = i == 0 ? prifixSum[j] : prifixSum[j] - prifixSum[i - 1];
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
                count++;
            }
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
// Time Complexity: O(n^2)
// Space Complexity: O(n)
