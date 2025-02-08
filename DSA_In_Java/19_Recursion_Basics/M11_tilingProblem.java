
// Given a “2 x n” board and tiles of size “2 x 1”, count the number of ways to tile the given board using the 2 x 1 tiles. A tile can either be placed horizontally i.e., as a 1 x 2 tile or vertically i.e., as 2 x 1 tile.
import java.util.*;

public class M11_tilingProblem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scn.nextInt();
        scn.close();
        System.out.println("Number of ways to tile the board of size 2 x " + n + " is: " + tiling(n));
    }

    public static int tiling(int n) {
        if (n == 0 || n == 1) {
            return 1 ;
        }
        return tiling(n - 1) + tiling(n - 2);
    }
}
