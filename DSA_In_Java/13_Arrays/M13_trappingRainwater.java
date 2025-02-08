import java.util.*;
// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining. Eg height = [4,2,0,6,3,2,5] Output: 11
public class M13_trappingRainwater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The array is: "+Arrays.toString(arr));
        System.out.println("The amount of water trapped is: "+trap(arr));
        sc.close();
    }
    public static int trap(int[] height) {
        int n = height.length;
        if(n==0) return 0;
        // Calculate the left max and right max for each element
        int[] leftMax = new int[n]; // leftMax[i] will store the maximum height to the left of i
        int[] rightMax = new int[n]; // rightMax[i] will store the maximum height to the right of i
        leftMax[0] = height[0]; // leftMax[0] will be the first element itself
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }
        rightMax[n-1] = height[n-1]; // rightMax[n-1] will be the last element itself
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }
        int trapped = 0;
        for(int i=0; i<n; i++){
            // The amount of water trapped at i will be the minimum of leftMax[i] and rightMax[i] minus height[i]
            trapped += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return trapped;
    }
    
}
