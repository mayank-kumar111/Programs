import java.util.*;

public class M9_setithBit {
    public static void main(String args[]) {
        // int n = 10;
        // int i = 2;
        // int mask = 1 << i;
        // int setithBit = n | mask;
        // System.out.println(setithBit);

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number: ");
        // int n = sc.nextInt();
        // System.out.println("Enter the ith bit: ");
        // int i = sc.nextInt();
        // int mask = 1 << i;
        // int setithBit = n | mask;
        // System.out.println(setithBit);
        // sc.close();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the ith bit: ");
        int i = sc.nextInt();
        setithBit(n, i);
        sc.close();
    }

    public static void setithBit(int n, int i) {
        int mask = 1 << i;
        int setithBit = n | mask;
        System.out.println("Value after set is : "+setithBit);
    }
}
