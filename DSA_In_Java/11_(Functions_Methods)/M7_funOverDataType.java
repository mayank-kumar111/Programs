public class M7_funOverDataType {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10.5, 20.5));
    }
}
