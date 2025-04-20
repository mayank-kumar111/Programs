
//Devide two numbers and print the result.
import java.util.*;

public class Q21 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        try {
            Double c = a / b;
            System.out.println("Result: " + c);
        } catch (Exception e) {
            System.out.println("Division by zero is not possible.");
            sc.close();
        }
    }

}
