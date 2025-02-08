
// Print number from 1 to n.
import java.util.*;

public class M3_print1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int range = sc.nextInt();
        int counter = 1;
        while (counter <= range) {
            System.out.print(counter + " ");
            counter++;
        }
        sc.close();
    }

}
