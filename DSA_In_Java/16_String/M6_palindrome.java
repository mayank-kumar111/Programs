import java.util.*;

public class M6_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        if (isPalindrome(str)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        sc.close();
    }

    // public static boolean isPalindrome(String str) {
    // int i = 0;
    // int j = str.length() - 1;
    // while (i < j) {
    // if (str.charAt(i) != str.charAt(j)) {
    // return false;
    // }
    // i++;
    // j--;
    // }
    // return true;
    // }

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
