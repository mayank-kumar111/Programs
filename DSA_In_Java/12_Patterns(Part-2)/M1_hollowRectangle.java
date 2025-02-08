import java.util.*;

// Write a program to print hollow rectangle star pattern series.
public class M1_hollowRectangle {
    public static void hollowRectangle(int row, int col) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        hollowRectangle(row, col);
        sc.close();
    }

}
