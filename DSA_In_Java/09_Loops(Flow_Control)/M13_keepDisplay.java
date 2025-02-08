import java.util.*;

public class M13_keepDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter your number: ");
            int number = sc.nextInt();
            if (number % 10 == 0) {
                continue;
            }
            System.out.println("Your number is: " + number);
            // System.out.println("Do you want to continue? (Y/N)");
            // char ch = sc.next().charAt(0);
            // if (ch == 'N' || ch == 'n') {
            // break;
            // }
        } while (true);
        // sc.close();

    }

}
