import java.util.*;
public class M16_fastExponentiation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and n: ");
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(fastExponentiation(a, n));
        sc.close();
    }

    // public static long fastExponentiation(int a, int n) {
    //     if (n == 0) {
    //         return 1;
    //     }
    //     long res = fastExponentiation(a, n / 2);
    //     if (n % 2 == 0) {
    //         return res * res;
    //     } else {
    //         return res * res * a;
    //     }
    // }

    // public static long fastExponentiation(int a, int n) {
    //     long res = 1;
    //     while (n > 0) {
    //         if (n % 2 == 1) {
    //             res = res * a;
    //         }
    //         a = a * a;
    //         n = n / 2;
    //     }
    //     return res;
    // }

    public static long fastExponentiation(int a, int n) {
        long res = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                res = res * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return res;
    }
}
