// Question 3 : Write a Java program to check if anumber is a palindrome in Java ?(121 is a
// palindrome, 321 is not)
// An umber is called a palindrome if the number is equal to the reverse of anumber e.g.,121 is a
// palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
// palindrome because the reverse of 321 is 123, which is not equal to 321.

import java.util.*;

public class Q3_palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(321));

        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number: ");
        int x = sc.nextInt();
        if (isPalindrome(x)) {
            System.out.println("The number is " + x + " a palindrome.");
        } else {
            System.out.println("The number is " + x + " not a palindrome.");
        }
        sc.close();
    }

    public static boolean isPalindrome(int x) {
        int reverse = 0;
        int temp = x;
        while (temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        return x == reverse;
    }
}
