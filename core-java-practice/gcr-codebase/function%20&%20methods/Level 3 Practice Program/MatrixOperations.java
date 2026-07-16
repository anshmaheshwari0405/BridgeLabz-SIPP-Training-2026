import java.util.*;
public class MatrixOperations {

    public static int[][] createMatrix(int rows, int cols) {

        Random random = new Random();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }

        return matrix;
    }

    public static int[][] addMatrices(int[][] A, int[][] B) {

        int rows = A.length;
        int cols = A[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }

        return result;
    }

    public static int[][] subtractMatrices(int[][] A, int[][] B) {

        int rows = A.length;
        int cols = A[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }

        return result;
    }

    public static int[][] multiplyMatrices(int[][] A, int[][] B) {

        int[][] result =
                new int[A.length][B[0].length];

        for (int i = 0; i < A.length; i++) {

            for (int j = 0; j < B[0].length; j++) {

                for (int k = 0; k < B.length; k++) {

                    result[i][j] +=
                            A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }

    public static void displayMatrix(int[][] matrix) {

        for (int[] row : matrix) {

            for (int value : row) {
                System.out.print(value + "\t");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] A = createMatrix(3, 3);
        int[][] B = createMatrix(3, 3);

        System.out.println("Matrix A");
        displayMatrix(A);

        System.out.println("\nMatrix B");
        displayMatrix(B);

        System.out.println("\nAddition");
        displayMatrix(addMatrices(A, B));

        System.out.println("\nSubtraction");
        displayMatrix(subtractMatrices(A, B));

        System.out.println("\nMultiplication");
        displayMatrix(multiplyMatrices(A, B));
    }
}