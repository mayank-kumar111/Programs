import java.util.*;

// public class M2_syntaxParameter {
//     public static void calculateSum1() {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter two numbers: ");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = a + b;
//         System.out.println("Sum: " + sum);
//         sc.close();
//     }

//     public static void main(String[] args) {
//         calculateSum1(); // function call
//     }
// }

// public class M2_syntaxParameter {
//     public static void calculateSum1(int a, int b) {
//         int sum = a + b;
//         System.out.println("Sum: " + sum);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter two numbers: ");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         calculateSum1(a, b); // function call
//         sc.close();
//     }
// }

public class M2_syntaxParameter {
    public static int calculateSum1(int a, int b) { // parameter or formal parameter
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum1(a, b); // function call. argument or actual parameter.
        System.out.println("Sum: " + sum);
        sc.close();
    }
}