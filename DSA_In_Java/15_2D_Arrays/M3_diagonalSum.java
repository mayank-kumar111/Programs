public class M3_diagonalSum {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }

        };
        System.out.println("Diagonal Sum : " + diagonalSum1(arr));
        System.out.println("Diagonal Sum : " + diagonalSum2(arr));
    }

    public static int diagonalSum1(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            // for (int j = 0; j < arr[0].length; j++) {
            // if (i == j || i + j == arr.length - 1) {
            // sum += arr[i][j];
            // }
            // }

            for (int j = 0; j < arr[0].length; j++)
                if (i == j) {
                    sum += arr[i][j];

                } else if (i + j == arr.length - 1) {
                    sum += arr[i][j];

                }
        }
        return sum;
    }

    public static int diagonalSum2(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            // sum += arr[i][i];
            // if (i != arr.length - i - 1) {
            //     sum += arr[i][arr.length - i - 1];
            // }
            sum += arr[i][i] + arr[i][arr.length - i - 1];
        }
        return sum;
    }
}
