import java.util.*;

public class M14_binaryStrings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scn.nextInt();
        scn.close();
        binaryStrings(n, 0, "");
    }

    public static void binaryStrings(int n, int lastPlaca, String ans) {
        if (n == 0) {
            System.out.println(ans);
            return;
        }
        binaryStrings(n - 1, 0, ans + "0");
        if (lastPlaca == 0) {
            binaryStrings(n - 1, 1, ans + "1");
        }
    }
}
