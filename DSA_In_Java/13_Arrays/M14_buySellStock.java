import java.util.*;
// you are given an array prices where prices[i] is the price of a given stock on the ith day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0. Eg prices = [7,1,5,3,6,4] Output: 5
public class M14_buySellStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] prices = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            prices[i] = sc.nextInt();
        }
        System.out.println("The array is: "+Arrays.toString(prices));
        System.out.println("The maximum profit is: "+maxProfit(prices));
        sc.close();
    }
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        if(n==0) return 0;
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            // if(buyPrice>prices[i]){
            //     buyPrice = prices[i];
            // }
            // else if(prices[i]-buyPrice>maxProfit){
            //     maxProfit = prices[i]-buyPrice;
            // }
            // OR
            // buyPrice = Math.min(buyPrice, prices[i]);
            // maxProfit = Math.max(maxProfit, prices[i]-buyPrice);
            // OR
            if(buyPrice<prices[i]){ // profit is possible
                maxProfit = Math.max(maxProfit, prices[i]-buyPrice);
            }
            else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    
}
