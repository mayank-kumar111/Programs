import java.util.*;

public class M8_product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a * b;
        // System.out.println(product);
        System.out.println("Product of " + a + " and " + b + " is " + product);
        sc.close();
    }
}
