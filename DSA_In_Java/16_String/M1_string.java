public class M1_string {

    public static void main(String[] args) {
    char arr[] = {'M', 'A', 'Y', 'A', 'N', 'k', ' ', 'K', 'U', 'M', 'A', 'R'};
        String str = "Hello World";
        String str1 = new String("xyz");
        String str2 = new String(arr);
        System.out.println(str); // Hello World
        System.out.println(str1); // xyz
        System.out.println(str2); // MAYANk KUMAR
        System.out.println(str.length()); // 11
        // String are immutable. Once created, they cannot be changed.
    }
}
