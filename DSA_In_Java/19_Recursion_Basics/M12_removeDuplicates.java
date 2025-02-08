import java.util.*;

public class M12_removeDuplicates {
    // public static void main(String[] args) {
    // String str = "aaaabbbcc";
    // System.out.println(removeDuplicates(str));
    // }

    // public static String removeDuplicates(String str) {
    // if (str.length() == 0) {
    // return "";
    // }
    // char ch = str.charAt(0);
    // String ros = removeDuplicates(str.substring(1));
    // if (ros.length() > 0 && ch == ros.charAt(0)) {
    // return ros;
    // }
    // return ch + ros;
    // }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scn.next();
        scn.close();
        StringBuilder newStr = new StringBuilder();
        boolean map[] = new boolean[26];
        removeDuplicates(str, 0, newStr, map);
    }

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char ch = str.charAt(idx);
        if (map[ch - 'a'] == true) {
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            map[ch - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(ch), map);
        }
    }
}
