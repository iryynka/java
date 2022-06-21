package startKmet.lesson9;

import java.util.Random;
import java.util.Scanner;

public class MatrixComputation {


    public static void main(String[] args) {
        int dimension = dimension();//Задання розмірності матриці
        int[][] firstMatrix = createMatrix(dimension);//Створення першої матриці
        int[][] secondMatrix = createMatrix(dimension);//Створення другої матриці

        System.out.println("First matrix: ");
        printMatrix(firstMatrix);
        System.out.println("\nSecond matrix: ");
        printMatrix(secondMatrix);

        System.out.println("\nSummary: ");
        int[][] summary = add(firstMatrix, secondMatrix);//Сума матриць
        printMatrix(summary);

        System.out.println("\nMultiplication: ");
        int[][] multiply = multiply(firstMatrix, secondMatrix);//Добуток матриць
        printMatrix(multiply);
    }




    /**
     * Multiply matrices
     * @param firstMatrix first matrix
     * @param secondMatrix second matrix
     * @return multiplied matrix
     */
    private static int[][] multiply(int[][] firstMatrix, int[][] secondMatrix) {
        int[][] mul = new int[firstMatrix.length][secondMatrix.length];
        for (int i = 0; i < mul.length; i++) {
            for (int j = 0; j < mul[i].length; j++) {
                mul[i][j] = 0;
                for (int k = 0; k < mul[i].length; k++) {
                    mul[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
        return mul;
    }


    /**
     * Adds matrices
     * @param firstMatrix first matrix
     * @param secondMatrix second matrix
     * @return added matrix
     */
    private static int[][] add(int[][] firstMatrix, int[][] secondMatrix) {
        int[][] sum = new int[firstMatrix.length][firstMatrix.length];
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        return sum;
    }


    /**
     * Prints the matrix
     * @param matrix matrix that we want to print out
     */
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print("\t" + column);
            }
            System.out.println();
        }
    }


    /**
     * Determine dimension of a matrix
     * @return dimension value
     */
    private static int dimension() {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter matrix dimension: ");
            if (scan.hasNextInt()) {
                return scan.nextInt();
            }
            System.out.println("Incorrect value. Try again. ");
        }
    }


    /**
     * Creates and fills matrix with numbers
     * @param dimension dimension value of a matrix
     * @return filled matrix
     */
    private static int[][] createMatrix(int dimension) {
        Random random = new Random();
        int[][] matrix = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }
        return matrix;
    }


}
