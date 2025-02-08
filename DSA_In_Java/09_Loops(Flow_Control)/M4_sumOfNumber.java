// Purpose: To calculate the sum of first n natural numbers.
import java.util.*;
public class M4_sumOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int range = sc.nextInt();
        int counter = 1;
        int sum = 0;
        while (counter <= range) {
            sum = sum + counter;
            counter++;
        }
        System.out.println("Sum of first " + range + " natural numbers is : " + sum);
        sc.close();
    }
    
}
