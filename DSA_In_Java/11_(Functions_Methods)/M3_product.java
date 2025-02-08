import java.util.*; 
public class M3_product {
    public static int calculateProduct(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = calculateProduct(a, b);
        System.out.println("Product: " + product);
        sc.close();
    }
}
