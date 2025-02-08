import java.util.Scanner;
public class M8_compare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = input.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = input.nextLine();
        // String str3 = str1.concat(str2);
        // System.out.println("The concatenated string is: " + str3);
        if (str1.equals(str2)) {
            System.out.println("The two strings are equal.");
        } else {
            System.out.println("The two strings are not equal.");
        }
        input.close();
    }
    
}
