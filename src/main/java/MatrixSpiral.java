public class MatrixSpiral {
    public static void printSpiral(int[][] matrix) {

        int rowStart = 0;
        int colStart = 0;
        int rowEnd = matrix.length - 1;
        int colEnd = matrix[0].length - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int i = rowEnd; i >= rowStart; i--) {
                System.out.print(matrix[i][colEnd] + " ");
            }

            for (int i = colEnd - 1; i >= colStart; i--) {
                System.out.print(matrix[rowStart][i] + " ");
            }

            for (int i = rowStart + 1; i <= rowEnd; i++) {
                System.out.print(matrix[i][colStart] + " ");
            }

            if(rowStart < rowEnd && colStart < colEnd) {
                for (int i = colStart + 1; i <= colEnd - 1; i++) {
                    System.out.print(matrix[rowEnd][i] + " ");
                }
            }
            rowStart++;
            rowEnd--;
            colStart++;
            colEnd--;
        }
            System.out.println();
    }

    public static void main(String[] args) {
        int[][] squareEvenMatrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int[][] squareOddMatrix = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18}
        };

        printSpiral(squareEvenMatrix);
        printSpiral(squareOddMatrix);
    }
}

