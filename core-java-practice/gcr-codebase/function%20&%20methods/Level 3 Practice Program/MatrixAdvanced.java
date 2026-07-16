import java.util.*;
public class MatrixAdvanced {

    public static int[][] createMatrix(int rows, int cols) {

        Random random = new Random();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(9) + 1;
            }
        }

        return matrix;
    }

    public static void displayMatrix(int[][] matrix) {

        for (int[] row : matrix) {

            for (int value : row) {
                System.out.print(value + "\t");
            }

            System.out.println();
        }
    }

    public static int[][] transpose(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose =
                new int[cols][rows];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    public static int determinant2x2(int[][] m) {

        return (m[0][0] * m[1][1])
                - (m[0][1] * m[1][0]);
    }

    public static int determinant3x3(int[][] m) {

        return m[0][0] *
                ((m[1][1] * m[2][2]) -
                 (m[1][2] * m[2][1]))

             - m[0][1] *
                ((m[1][0] * m[2][2]) -
                 (m[1][2] * m[2][0]))

             + m[0][2] *
                ((m[1][0] * m[2][1]) -
                 (m[1][1] * m[2][0]));
    }

    public static double[][] inverse2x2(int[][] m) {

        int det = determinant2x2(m);

        if (det == 0)
            return null;

        double[][] inv = new double[2][2];

        inv[0][0] = m[1][1] / (double) det;
        inv[0][1] = -m[0][1] / (double) det;
        inv[1][0] = -m[1][0] / (double) det;
        inv[1][1] = m[0][0] / (double) det;

        return inv;
    }

    public static void displayDoubleMatrix(
            double[][] matrix) {

        for (double[] row : matrix) {

            for (double value : row) {

                System.out.printf("%.2f\t", value);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] matrix3 =
                createMatrix(3, 3);

        System.out.println("3x3 Matrix");
        displayMatrix(matrix3);

        System.out.println("\nTranspose");
        displayMatrix(transpose(matrix3));

        System.out.println("\nDeterminant 3x3 = "
                + determinant3x3(matrix3));

        int[][] matrix2 =
                createMatrix(2, 2);

        System.out.println("\n2x2 Matrix");
        displayMatrix(matrix2);

        System.out.println("\nDeterminant 2x2 = "
                + determinant2x2(matrix2));

        double[][] inverse =
                inverse2x2(matrix2);

        if (inverse != null) {

            System.out.println("\nInverse 2x2");

            displayDoubleMatrix(inverse);
        }
        else {
            System.out.println(
                    "Inverse does not exist");
        }
    }
}