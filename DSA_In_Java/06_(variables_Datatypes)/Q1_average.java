import java.util.*;

// Question 1 : In a program, input 3 numbers : A, B and C. You have to output the average of these 3 numbers.
// (Hint : Average of N numbers is sum of those numbers divided by N)
public class Q1_average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input 3 numbers : A, B and C.");
        float A = sc.nextFloat(), B = sc.nextFloat(), C = sc.nextFloat();
        float avg = (A + B + C) / 3;
        System.out.println("Average is :" + avg);
        sc.close();
    }

}
