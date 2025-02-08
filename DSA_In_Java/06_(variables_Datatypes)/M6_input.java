import java.util.*;

public class M6_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You entered: ");
        String input = sc.next();
        System.out.println(input);
        String name = sc.nextLine();
        System.out.println(name);
        int num = sc.nextInt();
        System.out.println(num);
        float f = sc.nextFloat();
        System.out.println(f);
        byte b = sc.nextByte();
        System.out.println(b);
        double d = sc.nextDouble();
        System.out.println(d);
        boolean bool = sc.nextBoolean();
        System.out.println(bool);
        char c = sc.next().charAt(0);
        System.out.println(c);
        short s = sc.nextShort();
        System.out.println(s);
        long l = sc.nextLong();
        System.out.println(l);
        sc.close();

    }
}
