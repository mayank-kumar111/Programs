import java.util.*;

public class M10_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number First: ");
        int a = sc.nextInt();
        System.out.println("Enter number Second: ");
        int b = sc.nextInt();
        System.out.println("Enter operator: ");
        char operator = sc.next().charAt(0);
        int result = 0;
        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("Invalid operator");
        }
        System.out.println(result);
        sc.close();
    }
}
