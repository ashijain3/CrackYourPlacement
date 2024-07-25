public class rotateimage {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        for (int row = 0; row < n / 2; row++) {
            for (int col = row; col < n - row - 1; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][n - 1 - row];
                matrix[col][n - 1 - row] = temp;

                temp = matrix[row][col];
                matrix[row][col] = matrix[n - 1 - row][n - 1 - col];
                matrix[n - 1 - row][n - 1 - col] = temp;

                temp = matrix[row][col];
                matrix[row][col] = matrix[n - 1 - col][row];
                matrix[n - 1 - col][row] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        rotate(matrix);

        System.out.println("Rotated Matrix:");
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}

    

