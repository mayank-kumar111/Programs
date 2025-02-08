import java.util.*;

// Question: 4.
// For a given string convert each the first letter of each word to uppercase.
public class M12_toUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("String after converting first letter of each word to uppercase: ");
        System.out.println(toUpperCase(str));
        sc.close();
    }

    // public static String toUpperCase(String str) {
    // String[] words = str.split(" ");
    // StringBuilder sb = new StringBuilder();
    // for (String word : words) {
    // sb.append(Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ");
    // }
    // return sb.toString().trim();
    // }

    // public static String toUpperCase(String str) {
    // char[] ch = str.toCharArray();
    // for (int i = 0; i < ch.length; i++) {
    // if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ') {
    // if (ch[i] >= 'a' && ch[i] <= 'z') {
    // ch[i] = (char) (ch[i] - 'a' + 'A');
    // }
    // }
    // }
    // return new String(ch);
    // }

    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }

        }
        return sb.toString();
    }

}
