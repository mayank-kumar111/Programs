public class M2_invertedStar {
    // public static void main(String[] args) {
    // for (int line = 4; line >= 1; line--) {
    // // one line.
    // for (int star = 1; star <= line; star++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    // }
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
