public class M10_break {
    public static void main(String[] args) {
        for (int counter=1; counter<=10; counter++) {
            if (counter == 5) {
                break;
            }
            System.out.println("Hello Mayank");
        }
        System.out.println("Out of loop");
    }
}
