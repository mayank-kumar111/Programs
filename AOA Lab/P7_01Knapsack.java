// Write a program to implement 0/1 Knapsack Problem using Dynamic Programming.
import java.util.Scanner;

public class P7_01Knapsack {

    // Function to solve 0/1 Knapsack using DP
    public static int knapsack(int W, int[] wt, int[] val, int n) {
        int[][] dp = new int[n + 1][W + 1];

        // Build table dp[][] in bottom-up manner
        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                if (i == 0 || w == 0)
                    dp[i][w] = 0;
                else if (wt[i - 1] <= w)
                    dp[i][w] = Math.max(val[i - 1] + dp[i - 1][w - wt[i - 1]], dp[i - 1][w]);
                else
                    dp[i][w] = dp[i - 1][w];
            }
        }

        // Print selected items (backtracking)
        int res = dp[n][W];
        int w = W;
        System.out.print("Items chosen (value, weight): ");
        for (int i = n; i > 0 && res > 0; i--) {
            if (res == dp[i - 1][w])
                continue; // item not included
            else {
                System.out.print("(" + val[i - 1] + "," + wt[i - 1] + ") ");
                res -= val[i - 1];
                w -= wt[i - 1];
            }
        }
        System.out.println();

        return dp[n][W];
    }

    // Driver Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        int[] val = new int[n];
        int[] wt = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value and weight of item " + (i + 1) + ": ");
            val[i] = sc.nextInt();
            wt[i] = sc.nextInt();
        }

        System.out.print("Enter Knapsack Capacity: ");
        int W = sc.nextInt();

        int maxProfit = knapsack(W, wt, val, n);
        System.out.println("Maximum profit in 0/1 Knapsack = " + maxProfit);

        sc.close();
    }
}
