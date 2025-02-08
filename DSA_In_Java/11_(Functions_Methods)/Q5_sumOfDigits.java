// Question 5 :
// Write a Java method to compute the sum of the digits in an integer.
// (Hint: Approach this question in the following way:
// a. Take a variable sum = 0
// b. Find the last digit of the number
// c. Add it to the sum
// d. Repeat a & b until the number becomes 0 )

import java.util.*;

public class Q5_sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number: ");
        int x = sc.nextInt();
        System.out.println("The sum of the digits is: " + sumOfDigits(x));
        sc.close();
    }

    public static int sumOfDigits(int x) {
        int sum = 0;
        while (x != 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }
}
