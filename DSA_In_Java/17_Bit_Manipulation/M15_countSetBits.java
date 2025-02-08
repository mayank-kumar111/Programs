import java.util.*;

public class M15_countSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Number of set bits in " + n + " is: ");
        System.out.println(countSetBits(n));
        sc.close();
    }

    // public static int countSetBits(int n) {
    // int count = 0;
    // while (n > 0) {
    // count += n & 1;
    // n >>= 1;
    // }
    // return count;
    // }

    // public static int countSetBits(int n) {
    // int count = 0;
    // while (n > 0) {
    // n = n & (n - 1);
    // count++;
    // }
    // return count;
    // }

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n >>= 1;
        }
        return count;
    }

}
