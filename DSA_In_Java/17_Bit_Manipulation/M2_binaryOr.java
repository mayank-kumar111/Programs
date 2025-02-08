import java.util.*;
public class M2_binaryOr {
    public static void main(String[] args) {
        // int a = 60; /* 60 = 0011 1100 */
        // int b = 13; /* 13 = 0000 1101 */
        // int c = 0;

        // c = a | b; /* 61 = 0011 1101 */
        // System.out.println("a | b = " + c);
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("The result of binary OR operation is: " + (a | b));
        sc.close();
    }
}
