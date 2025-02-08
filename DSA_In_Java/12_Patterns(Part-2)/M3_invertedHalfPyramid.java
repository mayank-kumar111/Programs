import java.util.*;

// Purpose: Write a program that prints an inverted half pyramid.
public class M3_invertedHalfPyramid {
    public static void invertedHalfPyramid(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();
        sc.close();
        invertedHalfPyramid(row);
    }
}
