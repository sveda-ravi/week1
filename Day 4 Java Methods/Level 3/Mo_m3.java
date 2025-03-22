package level3;
import java.util.Random;
import java.util.Scanner;

public class Mo_m3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();
        int[][] matrixA = generateRandomMatrix(rows, cols, random);
        int[][] matrixB = generateRandomMatrix(rows, cols, random);

        System.out.println("\nMatrix A:");
        displayMatrix(matrixA);
        System.out.println("\nMatrix B:");
        displayMatrix(matrixB);
        System.out.println("\nMatrix Addition:");
        displayMatrix(addMatrices(matrixA, matrixB));

        System.out.println("\nMatrix Subtraction:");
        displayMatrix(subtractMatrices(matrixA, matrixB));

        if (rows == cols) {
            System.out.println("\nMatrix A Transpose:");
            displayMatrix(transposeMatrix(matrixA));

            if (rows == 2) {
                System.out.println("\nDeterminant of 2x2 Matrix A: " + determinant2x2(matrixA));
                System.out.println("\nInverse of 2x2 Matrix A:");
                displayMatrix(inverse2x2(matrixA));
            } else if (rows == 3) {
                System.out.println("\nDeterminant of 3x3 Matrix A: " + determinant3x3(matrixA));
                System.out.println("\nInverse of 3x3 Matrix A:");
                displayMatrix(inverse3x3(matrixA));
            }
        } else {
            System.out.println("\nDeterminant and Inverse can only be found for square matrices.");
        }

        scanner.close();
    }

    public static int[][] generateRandomMatrix(int rows, int cols, Random random) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
        return matrix;
    }
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
    public static int determinant2x2(int[][] matrix) {
        return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
    }
    public static int determinant3x3(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }
    public static double[][] inverse2x2(int[][] matrix) {
        int det = determinant2x2(matrix);
        if (det == 0) {
            System.out.println("Matrix is not invertible.");
            return new double[][]{{0, 0}, {0, 0}};
        }
        double invDet = 1.0 / det;
        return new double[][]{
                {matrix[1][1] * invDet, -matrix[0][1] * invDet},
                {-matrix[1][0] * invDet, matrix[0][0] * invDet}
        };
    }
    public static double[][] inverse3x3(int[][] matrix) {
        int det = determinant3x3(matrix);
        if (det == 0) {
            System.out.println("Matrix is not invertible.");
            return new double[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        }

        double invDet = 1.0 / det;
        double[][] adj = new double[3][3];
        adj[0][0] = (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]);
        adj[0][1] = -(matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]);
        adj[0][2] = (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        adj[1][0] = -(matrix[0][1] * matrix[2][2] - matrix[0][2] * matrix[2][1]);
        adj[1][1] = (matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0]);
        adj[1][2] = -(matrix[0][0] * matrix[2][1] - matrix[0][1] * matrix[2][0]);
        adj[2][0] = (matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1]);
        adj[2][1] = -(matrix[0][0] * matrix[1][2] - matrix[0][2] * matrix[1][0]);
        adj[2][2] = (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]);
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                adj[i][j] *= invDet;

        return adj;
    }
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double num : row) {
                System.out.printf("%8.2f ", num);
            }
            System.out.println();
        }
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.printf("%5d ", num);
            }
            System.out.println();
        }
    }
}
