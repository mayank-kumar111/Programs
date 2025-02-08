import java.util.*;

public class M2_inputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("You entered: " + str);
        sc.close();
    }
}
