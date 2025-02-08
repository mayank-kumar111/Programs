import java.util.*;

public class M5_incomeTax {
    public static void main(String[] args) {
        System.out.println("Enter your income: ");
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;
        if (income <= 500000) {
            tax = 0;
        } else if (income > 500000 && income <= 1000000) {
            tax = (income * 20) / 100;
        } else {
            tax = (income * 30) / 100;
        }
        System.out.println("Income Tax is : " + tax);
        sc.close();

    }
}