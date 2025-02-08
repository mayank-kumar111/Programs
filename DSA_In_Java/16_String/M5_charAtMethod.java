public class M5_charAtMethod {
    public static void main(String[] args) {
        String str = "Hello";
        char ch = str.charAt(0);
        System.out.println(ch);
        printLetter(str);
    }

    public static void printLetter(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }
}
