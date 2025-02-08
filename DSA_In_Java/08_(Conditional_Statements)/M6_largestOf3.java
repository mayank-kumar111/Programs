public class M6_largestOf3 {
    public static void main(String[] args) {
        int a = 1, b = 3, c = 6;
        if (a > b && a > c) {
            System.out.println("a is the largest number");
        } else if (b > a && b > c) {
            System.out.println("b is the largest number");
        } else {
            System.out.println("c is the largest number");
        }
    }
}
