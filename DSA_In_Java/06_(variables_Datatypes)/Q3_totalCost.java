
// Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and an eraser. You have to output the total cost of the items back to the user as their bill.
// (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
import java.util.*;

public class Q3_totalCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost of 3 items - a pencil, a pen and an eraser.");
        float costp = sc.nextFloat(), costpn = sc.nextFloat(), coste = sc.nextFloat();
        float total = coste + costp + costpn;
        System.out.println("total cost of the items is : " + total);
        float Tgst = total + (total * 18) / 100;
        float gst = (total * 18) / 100;
        System.out.println("GST is : " + gst);
        System.out.println("total cost of the items after adding 18% gst tax is : " + Tgst);
        sc.close();
    }

}
