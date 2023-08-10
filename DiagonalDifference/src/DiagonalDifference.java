public class DiagonalDifference {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4, 7}, {5, 5, 5, 5, 2}, {1, 1, 0, 0, 0}, {0, 2, 3, 4, 1}, {0, 1, 1, 2, 2}};
        System.out.println(getDiagonalDifference(matrix));
    }

    static int getDiagonalDifference(int[][] matrix) {
        int diagon1 = 0;
        int diagon2 = 0;
        for (int i = 0, j = matrix[i].length - 1; i < matrix.length; i++, j--) {
            diagon1 += matrix[i][i];
            diagon2 += matrix[i][j];
        }
        return diagon1 - diagon2;
    }
}
