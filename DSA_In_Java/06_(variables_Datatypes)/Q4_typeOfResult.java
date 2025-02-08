// Question 4: What will be the type of result in the following Java code?
// (Hint : Look at the largest data type among these)
public class Q4_typeOfResult {
    public static void main(String[] args) {
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

        // int result = (int) ((f * b) + (i % c) - (d * s));
        double result = (f * b) + (i % c) - (d * s);
        System.out.println("Total is : "+result);
    }
}
