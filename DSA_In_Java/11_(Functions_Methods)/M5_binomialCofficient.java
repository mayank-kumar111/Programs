import java.util.*;

public class M5_binomialCofficient {
    public static int factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int calculateBinomialCofficient(int n, int r) {
        int binomialCofficient = factorial(n) / (factorial(r) * factorial(n - r));
        return binomialCofficient;
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter r: ");
        int r = sc.nextInt();
        sc.close();

        int binomialCofficient = calculateBinomialCofficient(n, r);
        System.out.println("Binomial Cofficient: " + binomialCofficient);
    }
}
