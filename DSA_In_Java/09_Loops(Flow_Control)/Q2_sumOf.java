
// Question 2 : Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
import java.util.*;

public class Q2_sumOf {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number of elements: ");
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // int sumEven = 0;
        // int sumOdd = 0;
        // System.out.println("Enter the elements: ");
        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();
        // if (arr[i] % 2 == 0) {
        // sumEven += arr[i];
        // } else {
        // sumOdd += arr[i];
        // }
        // }
        // System.out.println("Sum of even numbers: " + sumEven);
        // System.out.println("Sum of odd numbers: " + sumOdd);
        // sc.close();

        Scanner sc = new Scanner(System.in);
        int number;
        int sumEven = 0;
        int sumOdd = 0;
        int choice;
        do {
            System.out.println("Enter the number: ");
            number = sc.nextInt();
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
            System.out.println("Do you want to continue? (1/0): ");
            choice = sc.nextInt();
        } while (choice != 0);
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
        sc.close();
    }
}