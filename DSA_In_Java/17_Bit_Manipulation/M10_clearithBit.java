import java.util.*;

public class M10_clearithBit {
    public static void main(String args[]) {
        // int n = 10;
        // int i = 1;
        // int mask = 1 << i;
        // int clearithBit = n & ~mask;
        // System.out.println(clearithBit);

        // int n = 10;
        // int i = 1;
        // int mask = ~(1 << i);
        // int clearithBit = n & mask;
        // System.out.println(clearithBit);

        // int n = 10;
        // int i = 1;
        // int mask = 1 << i;
        // int clearithBit = n ^ mask;
        // System.out.println(clearithBit);

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number and ith bit to clear: ");
        // int n = sc.nextInt();
        // int i = sc.nextInt();
        // int mask = 1 << i;
        // int clearithBit = n & ~mask;
        // System.out.println(clearithBit);
        // sc.close();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number and ith bit to clear: ");
        int n = sc.nextInt();
        int i = sc.nextInt();
        int clearithBit = clearithBit(n, i);
        System.out.println(clearithBit);
        sc.close();
    }

    public static int clearithBit(int n, int i) {
        int mask = 1 << i;
        int clearithBit = n & ~mask;
        return clearithBit;
    }
}
