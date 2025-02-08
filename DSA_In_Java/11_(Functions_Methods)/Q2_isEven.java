
// Question 2 : Write a method named isEven that accepts an int argument. The method should return true if the argument is even,or false otherwise.Also write a program to test your method.
import java.util.*;

public class Q2_isEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number: ");
        int x = sc.nextInt();
        System.out.print("The number is even: " + isEven(x) + "\n");
        sc.close();
    }

    public static boolean isEven(int x) {
        return x % 2 == 0;
    }
}
