public class M11_typeCasting {

    public static void main(String[] args) {
        int x = 4;
        double y = x; // Implicit type conversion and widening. int -> double.
        System.out.println(x);
        System.out.println(y);

        double myDouble = 3.14;
        int myInt = (int) myDouble; // Explicit type conversion and narrowing and type casting. double -> int. Loss of data.
        System.out.println(myDouble);
        System.out.println(myInt);

        char c = 'a';
        int ascii = c; // Implicit type conversion and widening. char -> int.
        System.out.println(c);
        System.out.println(ascii);
    }
}
