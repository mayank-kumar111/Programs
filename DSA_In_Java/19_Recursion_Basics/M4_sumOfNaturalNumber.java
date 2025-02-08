import java.util.*;

public class M4_sumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scn.nextInt();
        scn.close();
        System.out.println("Sum of first " + n + " natural numbers is: " + sumOfNaturalNumber(n));

    }

    public static int sumOfNaturalNumber(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumOfNaturalNumber(n - 1);
    }
}
