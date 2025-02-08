import java.util.*;
// Question 1 : Write a Java program to get a number from the user and print whether it ispositive or negative.
public class Q1_positiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (num > 0)
            System.out.println("Positive");
        else if (num < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
        sc.close();
    }
}
