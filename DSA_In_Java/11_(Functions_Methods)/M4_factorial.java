import java.util.*;
public class M4_factorial {
    public static int calculateFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int factorial = calculateFactorial(n);
        System.out.println("Factorial: " + factorial);
        sc.close();
    }
}
