import java.util.*;

// Purpose: To print Floyd's Triangle.
public class M4_floydsTriangle {
    public static void floydsTriangle(int row) {
        int count = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();
        sc.close();
        floydsTriangle(row);
    }

}
