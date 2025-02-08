import java.util.*;

public class M11_binaryTODecimal {
    // public static void binToDec(int binNum) {
    // int myNum = binNum;
    // int decNum = 0;
    // int power = 0;
    // while (binNum > 0) {
    // int lastDigit = binNum % 10;
    // decNum += lastDigit * Math.pow(2, power);
    // power++;
    // binNum = binNum / 10;
    // }
    // System.out.println("Decimal of " + myNum + " is " + decNum);

    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter a binary number: ");
    // int binNum = sc.nextInt();
    // sc.close();
    // binToDec(binNum);
    // }

    public static int binToDec(int binNum) {
        // int myNum = binNum;
        int decNum = 0;
        int power = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum += lastDigit * Math.pow(2, power);
            power++;
            binNum = binNum / 10;
        }
        return decNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int binNum = sc.nextInt();
        sc.close();
        System.out.println("Decimal of " + binNum + " is " + binToDec(binNum));
    }

}
