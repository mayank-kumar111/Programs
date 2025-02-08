// Question 1:  Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.  
// Example 1: Input: nums = [1, 2, 3, 1] Output: true  
// Example 2: Input: nums = [1, 2, 3, 4] Output: false

import java.util.*;

public class Q1_atLeastTwice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Your array is: " + Arrays.toString(nums));
        System.out.println(repartedTwice(nums));
    }

    public static boolean repartedTwice(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    //Approach 2 - using Sets (O(n)) 
/* You should have a basic knowledge about Java HashSets before following Approach 2. It will be 
taught to you in later chapters. */
    // public static boolean repartedTwice(int[] nums) {
    //     Set<Integer> set = new HashSet<>();
    //     for (int num : nums) {
    //         if (set.contains(num)) {
    //             return true;
    //         }
    //         set.add(num);
    //     }
    //     return false;
    // }
}
