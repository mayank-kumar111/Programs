import java.util.*;
public class M1_binaryAnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("The result of binary AND operation is: " + (a & b));
        sc.close();
    }
   
}
