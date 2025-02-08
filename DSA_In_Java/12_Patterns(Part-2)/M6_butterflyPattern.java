import java.util.*;

// Purpose: To print a butterfly pattern.
public class M6_butterflyPattern {
    public static void butterflyPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            int space = 2 * n - 2 * i; // 2 * n - 2 * i = 2 * (n - i)
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close();
        butterflyPattern(n);
    }

}
