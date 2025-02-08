import java.util.*;

// Write a program to print inverted and rotated half pyramid star pattern series.
public class M2_invertedHalfPyramid {
    public static void invertedHalfPyramid(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
             }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();
        invertedHalfPyramid(row);
        sc.close();
    }
}
