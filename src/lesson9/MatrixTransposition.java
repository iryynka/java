package startKmet.lesson9;

import java.util.Random;
import java.util.Scanner;

public class MatrixTransposition {
    public static void main(String[] args) {
        mainMatrixAndOutput();//Виводить матрицю із заданими параметрами та транспонований аналог
    }


    /**
     * Transposing matrix
     * @param matrix matrix we have
     * @param columns number of columns in the matrix
     * @param rows number of rows in the matrix
     */
    private static void transposedMatrix(int[][] matrix, int columns, int rows) {
        int[][] transposed = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        printMatrix(transposed);
    }


    /**
     * Prints out the matrix
     * @param matrix given matrix
     */
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }


    /**
     * Creates matrix with entered number of rows and columns. Prints transposition of that matrix and matrix.
     */
    private static void mainMatrixAndOutput() {
        int[][] matrix;
        int rows;
        int columns;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of rows in the matrix: ");
            if (scanner.hasNextInt()) {
                rows = scanner.nextInt();
                System.out.print("Enter the number of columns in the matrix: ");
                if (scanner.hasNextInt()) {
                    columns = scanner.nextInt();
                    matrix = fillTheMatrix(rows, columns);
                    System.out.println("Your created matrix: ");
                    printMatrix(matrix);
                    break;
                }
                System.out.println("Incorrect value. Try again. ");
            }
            System.out.println("Incorrect value. Try again. ");
        }
        System.out.println("The transpose of a matrix: ");
        transposedMatrix(matrix, columns, rows);
    }


    /**
     * Fills the matrix with numbers
     * @param rows number of rows in the matrix
     * @param columns number if columns in the matrix
     * @return filled matrix
     */
    private static int[][] fillTheMatrix(int rows, int columns) {
        Random random = new Random();
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
        return matrix;
    }
}
