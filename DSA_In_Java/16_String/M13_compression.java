import java.util.*;

public class M13_compression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("String after compressing: ");
        System.out.println(compress(str));
        sc.close();
    }

    // public static String compress(String str) {
    // StringBuilder sb = new StringBuilder("");
    // char ch = str.charAt(0);
    // sb.append(ch);
    // int count = 1;
    // for (int i = 1; i < str.length(); i++) {
    // if (str.charAt(i) == ch) {
    // count++;
    // } else {
    // if (count > 1) {
    // sb.append(count);
    // }
    // ch = str.charAt(i);
    // sb.append(ch);
    // count = 1;
    // }
    // }
    // if (count > 1) {
    // sb.append(count);
    // }
    // return sb.toString();
    // }

    public static String compress(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = str.charAt(0);
        sb.append(ch);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            } else {
                if (count > 1) {
                    sb.append(count);
                }
                ch = str.charAt(i);
                sb.append(ch);
                count = 1;
            }
        }
        if (count > 1) {
            sb.append(count);
        }
        return sb.toString();
    }

}
