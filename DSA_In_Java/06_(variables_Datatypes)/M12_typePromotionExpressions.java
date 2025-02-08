public class M12_typePromotionExpressions {
    public static void main(String[] args) {
        int a = 10;
        float b = 3.14f;
        float sum = a + b; // Implicit type conversion and widening. int -> float.
        System.out.println(sum);

        char c = 'a';
        char d = 'b';
        System.out.println((int) (c));
        System.out.println((int) (d));
        System.out.println(c);
        System.out.println(d - c);

        short s = 10;
        byte i = 20;
        char ch = 'a';
        byte bt = (byte) (a + b + ch);
        System.out.println(bt); // Explicit type conversion and narrowing. int -> byte.
        System.out.println(s + i + ch); // Implicit type conversion and widening. short -> int.

    }
}