public class KnapsackDP {

    static int knapsackDP(int W, int[] val, int[] wt) {
        int n = val.length;
        // Create a 2D table to store the maximum value for each subproblem
        int[][] dp = new int[n + 1][W + 1];

        // Fill the DP table
        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                // Base case: If no items or no capacity, the value is 0
                if (i == 0 || w == 0) {
                    dp[i][w] = 0;
                } else if (wt[i - 1] <= w) {
                    // If the current item's weight is less than or equal to the current capacity,
                    // we choose the max of including it or excluding it.
                    dp[i][w] = Math.max(val[i - 1] + dp[i - 1][w - wt[i - 1]], dp[i - 1][w]);
                } else {
                    // If the current item's weight is greater, we can't include it.
                    // The value is the same as the value without this item.
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }
        return dp[n][W];
    }

    public static void main(String[] args) {
        int[] val = { 60, 100, 120 };
        int[] wt = { 10, 20, 30 };
        int W = 50;

        System.out.println("Maximum value (DP): " + knapsackDP(W, val, wt));
    }
}