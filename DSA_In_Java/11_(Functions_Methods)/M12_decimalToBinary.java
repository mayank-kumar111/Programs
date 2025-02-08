import java.util.*;

public class M12_decimalToBinary {
    // public static void decToBin(int decNum) {
    // int myNum = decNum;
    // int binNum = 0;
    // int power = 0;
    // while (decNum > 0) {
    // int lastDigit = decNum % 2;
    // binNum += lastDigit * Math.pow(10, power);
    // power++;
    // decNum = decNum / 2;
    // }
    // System.out.println("Binary of " + myNum + " is " + binNum);
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter a decimal number: ");
    // int decNum = sc.nextInt();
    // sc.close();
    // decToBin(decNum);
    // }

    public static int decToBin(int decNum) {
        // int myNum = decNum;
        int binNum = 0;
        int power = 0;
        while (decNum > 0) {
            int lastDigit = decNum % 2;
            binNum += lastDigit * Math.pow(10, power);
            power++;
            decNum = decNum / 2;
        }
        return binNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decNum = sc.nextInt();
        sc.close();
        System.out.println("Binary of " + decNum + " is " + decToBin(decNum));
    }
}
