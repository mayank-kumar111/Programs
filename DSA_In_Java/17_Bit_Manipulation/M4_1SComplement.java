import java.util.*;

public class M4_1SComplement {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 5;
        // int c = 0;
        // c = a + ~b + 1;
        // System.out.println(c);

        // Scanner sc= new Scanner(System.in);
        // System.out.println("Enter the first number: ");
        // int a = sc.nextInt();
        // System.out.println("Enter the second number: ");
        // int b = sc.nextInt();
        // System.out.println("The result of 1's complement operation is: " + (a + ~b +
        // 1));
        // sc.close();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("The result of 1's complement operation is: " + (~a));
        sc.close();
    }
}
