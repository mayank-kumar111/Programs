import java.util.*;

public class M10_typeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 4;
        double y = x; // Implicit type conversion
        System.out.println(x);
        System.out.println(y);
        float number = sc.nextInt();
        System.out.println(number);
        sc.close();
    }
}
