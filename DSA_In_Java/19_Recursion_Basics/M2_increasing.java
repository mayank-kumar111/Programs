import java.util.*;

public class M2_increasing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scn.nextInt();
        System.out.println("Increasing order of " + n + " is:");
        printIncreasing(n);
        scn.close();
    }

    public static void printIncreasing(int n) {
        if (n == 0) {
            return;
        }
        printIncreasing(n - 1);
        System.out.println(n);
    }
}
