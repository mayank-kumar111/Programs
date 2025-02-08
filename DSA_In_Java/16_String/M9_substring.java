public class M9_substring {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.substring(6)); // World
        System.out.println(str.substring(0, 5)); // Hello

        System.out.println(substring(str, 0, 5)); // World

        // substring() method returns a new string that is a substring of this string.
        // The substring begins with the character at the specified index and extends to
        // the end of this string.

    }

    public static String substring(String str, int beginIndex, int endIndex) {
        String result = "";
        for (int i = beginIndex; i < endIndex; i++) {
            result += str.charAt(i);
        }
        return result;
    }
}
