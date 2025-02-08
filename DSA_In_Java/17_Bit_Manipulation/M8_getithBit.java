import java.util.*;

public class M8_getithBit {
    public static void main(String[] args) {
        // int n = 57;
        // int i = 3;
        // int mask = 1 << i;
        // int ithBit = n & mask;
        // if (ithBit == 0) {
        // System.out.println("0");
        // } else {
        // System.out.println("1");
        // }

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number: ");
        // int n = sc.nextInt();
        // System.out.println("Enter the ith bit: ");
        // int i = sc.nextInt();
        // int mask = 1 << i;
        // int ithBit = n & mask;
        // if (ithBit == 0) {
        // System.out.println("0");
        // } else {
        // System.out.println("1");
        // }
        // sc.close();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the ith bit: ");
        int i = sc.nextInt();
        getithBit(n, i);

        sc.close();

    }

    public static void getithBit(int n, int i) {
        int mask = 1 << i;
        int ithBit = n & mask;
        if (ithBit == 0) {
            System.out.println("ith bit is 0");
        } else {
            System.out.println("ith bit is 1");
        }
    }
}
