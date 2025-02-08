import java.util.*;
public class M12_clearLastithBits {
    public static void main(String[] args) {
        // int n = 15;
        // int i = 2;
        // int mask = -1 << i;
        // System.out.println(n & mask);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number and ith bit to clear: ");
        int n = sc.nextInt();
        int i = sc.nextInt();
        System.out.println("Number after clearing last " + i + " bits: ");
        System.out.println(clearLastIthBits(n, i));
        sc.close();
    }

    public static int clearLastIthBits(int n, int i) {
        int mask = -1 << i;
        return n & mask;
    }
}
