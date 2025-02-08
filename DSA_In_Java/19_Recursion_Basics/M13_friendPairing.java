import java.util.*;

public class M13_friendPairing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scn.nextInt();
        scn.close();
        System.out.println("Number of ways to pair " + n + " friends is: ");
        System.out.println(friendPairing(n));
    }

    public static int friendPairing(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return n;
        }
        return friendPairing(n - 1) + friendPairing(n - 2) * (n - 1);
    }
}
