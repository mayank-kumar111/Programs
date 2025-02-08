// Question:3
// For a given set of string, print the largest string.
public class M10_largestString {
    // public static void main(String[] args) {
    // String[] str = {"Hello", "World", "Java", "Programming", "Language"};
    // String largest = str[0];
    // for (int i = 1; i < str.length; i++) {
    // if (str[i].length() > largest.length()) {
    // largest = str[i];
    // }
    // }
    // System.out.println("Largest String: " + largest);
    // }

    public static void main(String[] args) {
        String[] str = { "Hello", "World", "Java", "Programming", "Language", "world" };
        String largest = str[0];
        for (int i = 1; i < str.length; i++) {
            if (largest.compareToIgnoreCase(str[i]) < 0) { // compareToIgnoreCase() method compares two string lexicographically, ignoring case differences.
                largest = str[i];
            }
            // if (largest.compareTo(str[i]) < 0) { // compareTo() method compares two
            // strings lexicographically.
            // largest = str[i];
            // }
        }
        System.out.println("Largest String: " + largest);
    }

}
