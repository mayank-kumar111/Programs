import java.util.Arrays;

public class Knapsack {

    static int[][] memo;

    static int knapsackRec(int W, int[] val, int[] wt, int n) {
        // Base case: no items or no capacity left
        if (n == 0 || W == 0) {
            return 0;
        }

        // Return the value from the memoization table if it's already calculated
        if (memo[n][W] != -1) {
            return memo[n][W];
        }

        // If the weight of the nth item is more than the knapsack's capacity, this item
        // can't be included.
        // The problem is reduced to finding the maximum value for the remaining items.
        if (wt[n - 1] > W) {
            return memo[n][W] = knapsackRec(W, val, wt, n - 1);
        }

        // Otherwise, we have two choices:
        // 1. Include the nth item: value of the item + max value from remaining items
        // and reduced weight
        int include = val[n - 1] + knapsackRec(W - wt[n - 1], val, wt, n - 1);
        // 2. Exclude the nth item: max value from remaining items with the same
        // capacity
        int exclude = knapsackRec(W, val, wt, n - 1);

        // Store and return the maximum of the two choices
        return memo[n][W] = Math.max(include, exclude);
    }

    public static void main(String[] args) {
        int[] val = { 60, 100, 120 };
        int[] wt = { 10, 20, 30 };
        int W = 50;
        int n = val.length;

        memo = new int[n + 1][W + 1];
        // Initialize the memoization table with -1 to indicate uncalculated states
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        System.out.println("Maximum value (Memoization): " + knapsackRec(W, val, wt, n));
    }
}