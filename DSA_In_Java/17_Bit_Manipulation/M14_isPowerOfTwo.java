import java.util.*;
public class M14_isPowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        //System.out.println(isPowerOfTwo(n));
        if (isPowerOfTwo(n)) {
            System.out.println("Yes, it is a power of 2");
        } else {
            System.out.println("No, it is not a power of 2");
        }
        sc.close();
    }

    public static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }
    
}
