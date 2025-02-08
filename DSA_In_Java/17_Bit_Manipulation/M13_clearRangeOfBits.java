import java.util.*;

public class M13_clearRangeOfBits {
    public static void main(String[] args) {
        // int n = 15;
        // int i = 1;
        // int j = 3;
        // int mask1 = -1 << (j + 1);
        // int mask2 = (1 << i) - 1;
        // int mask = mask1 | mask2;
        // n = n & mask;
        // System.out.println(n);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number, i and j");
        int n = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(clearRangeOfBits(n, i, j)));
        System.out.println(clearRangeOfBits(n, i, j));
        sc.close();

    }

    public static int clearRangeOfBits(int n, int i, int j) {
        int mask1 = -1 << (j + 1);
        int mask2 = (1 << i) - 1;
        int mask = mask1 | mask2;
        n = n & mask;
        return n;
    }
}
