
// WAP to implement fractional kanpsack problem using greedy approach
import java.util.Arrays;
import java.util.*;

class Item {
    int value, weight;

    Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}

public class P6_Fractional_knapsack {

    // Case 1: Min Weight First
    public static double knapsackMinWeight(Item[] items, int capacity) {
        Arrays.sort(items, (a, b) -> a.weight - b.weight);
        return fillKnapsack(items, capacity);
    }

    // Case 2: Max Profit First
    public static double knapsackMaxProfit(Item[] items, int capacity) {
        Arrays.sort(items, (a, b) -> b.value - a.value);
        return fillKnapsack(items, capacity);
    }

    // Case 3: Max Profit/Weight Ratio
    public static double knapsackRatio(Item[] items, int capacity) {
        Arrays.sort(items, (a, b) -> Double.compare((double) b.value / b.weight, (double) a.value / a.weight));
        return fillKnapsack(items, capacity);
    }

    // Common filling logic
    private static double fillKnapsack(Item[] items, int capacity) {
        double totalValue = 0.0;
        for (Item item : items) {
            if (capacity == 0)
                break; // Knapsack full
            if (item.weight <= capacity) {
                totalValue += item.value;
                capacity -= item.weight;
            } else {
                totalValue += (double) item.value * capacity / item.weight;
                break;
            }
        }
        return totalValue;
    }

    // Driver
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value and weight of item " + (i + 1) + ": ");
            int value = sc.nextInt();
            int weight = sc.nextInt();
            items[i] = new Item(value, weight);
        }

        System.out.print("Enter knapsack capacity: ");
        int capacity = sc.nextInt();

        System.out.println("\n--- Fractional Knapsack Results ---");
        System.out.println("Case 1 (Min Weight) = " + knapsackMinWeight(items.clone(), capacity));
        System.out.println("Case 2 (Max Profit) = " + knapsackMaxProfit(items.clone(), capacity));
        System.out.println("Case 3 (Profit/Weight) = " + knapsackRatio(items.clone(), capacity));

        sc.close();
    }
}