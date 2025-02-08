public class M4_character {
    // public static void main(String[] args) {
    // int n=4;
    // for (int line = 1; line <= n; line++) {
    // for (int number = 1; number <= line; number++) {
    // System.out.print((char)(number+64) + " ");
    // }
    // System.out.println();
    // }
    // }
    public static void main(String[] args) {
        int n = 4;
        char ch = 'A';
        for (int line = 1; line <= n; line++) {
            for (int chars = 1; chars <= line; chars++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }

}
