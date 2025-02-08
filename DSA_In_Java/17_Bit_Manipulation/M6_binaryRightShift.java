import java.util.*;
public class M6_binaryRightShift {
    public static void main(String[] args) {
    //     int a = 6;
    //     int b = a >> 1;
    //     System.out.println(b);
    // }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Enter the number of bits to shift: ");
        int shift = sc.nextInt();
        int result = num >> shift;
        System.out.println("The result of right shift operation is: " + result);
        sc.close();
    }
}
