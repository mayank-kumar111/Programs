public class M4_searchInSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 4, 7, 12, 15, 1000 },
                { 2, 5, 19, 31, 32, 1001 },
                { 3, 8, 24, 33, 35, 1002 },
                { 40, 41, 42, 44, 45, 1003 },
                { 99, 100, 103, 106, 128, 1004 }
        };
        int target = 44;
        searchInSortedMatrix(matrix, target);
    }

    public static boolean searchInSortedMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                System.out.println("Element found at index: (" + row + "," + col +")");
                return true;
            } else if (matrix[row][col] < target) {
                row++;
            } else {
                col--;

            }
        }
        System.out.println("Element not found");
        return false;
    }
}
