import java.util.*;

public class M7_OddOrEven {
    public static void main(String[] args) {
        // int num = 6;
        // if ((num & 1) == 0) {
        // System.out.println("The number is even.");
        // } else {
        // System.out.println("The number is odd.");
        // }

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number: ");
        // int num = sc.nextInt();
        // if ((num & 1) == 0) {
        // System.out.println("The number is even.");
        // } else {
        // System.out.println("The number is odd.");
        // }
        // sc.close();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        checkOddEven(num);
        sc.close();

    }

    public static void checkOddEven(int num) {
        if ((num & 1) == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }

}
