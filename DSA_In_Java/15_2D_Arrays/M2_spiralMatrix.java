public class M2_spiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 }

        };
        spiralOrder(matrix);
    }

    // public static void spiralOrder(int[][] matrix) {
    // int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length -
    // 1;
    // int dir = 0; // 0: left to right, 1: top to bottom, 2: right to left, 3:
    // bottom to top
    // // dir is used to keep track of the direction of the traversal
    // while (top <= bottom && left <= right) {
    // if (dir == 0) {
    // for (int i = left; i <= right; i++) {
    // System.out.print(matrix[top][i] + " ");
    // }
    // top++;
    // } else if (dir == 1) {
    // for (int i = top; i <= bottom; i++) {
    // System.out.print(matrix[i][right] + " ");
    // }
    // right--;
    // } else if (dir == 2) {
    // for (int i = right; i >= left; i--) {
    // System.out.print(matrix[bottom][i] + " ");
    // }
    // bottom--;
    // } else if (dir == 3) {
    // for (int i = bottom; i >= top; i--) {
    // System.out.print(matrix[i][left] + " ");
    // }
    // left++;
    // }
    // dir = (dir + 1) % 4;
    // }
    // }

    // public static void spiralOrder(int[][] matrix) {
    // int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length -
    // 1;
    // while (top <= bottom && left <= right) {
    // for (int i = left; i <= right; i++) {
    // System.out.print(matrix[top][i] + " ");
    // }
    // top++;
    // for (int i = top; i <= bottom; i++) {
    // System.out.print(matrix[i][right] + " ");
    // }
    // right--;
    // if (top <= bottom) {
    // for (int i = right; i >= left; i--) {
    // System.out.print(matrix[bottom][i] + " ");
    // }
    // bottom--;
    // }
    // if (left <= right) {
    // for (int i = bottom; i >= top; i--) {
    // System.out.print(matrix[i][left] + " ");
    // }
    // left++;
    // }
    // }
    // }

    public static void spiralOrder(int[][] matrix) {
        int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;
            for (int i = top + 1; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            for (int i = right - 1; i >= left; i--) {
                if (top == bottom) {
                    break;
                }
                System.out.print(matrix[bottom][i] + " ");

                bottom--;
            }
            for (int i = bottom - 1; i >= top - 1; i--) {
                if (left == right) {
                    break;
                }
                System.out.print(matrix[i][left] + " ");
            }
            left++;

        }
    }

}
