// Question 2 : Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever.

// public class Solution {
// public static void main(String[] args) {
// double temp = 103.5;
// }
// }
import java.util.*;
public class Q2_fever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your temperature: ");
        double temp = sc.nextDouble();
        if (temp > 100)
            System.out.println("You have a fever");
        else
            System.out.println("You don't have a fever");
        sc.close();
    }
}
