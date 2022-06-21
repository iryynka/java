package startKmet.lesson5;

import java.util.Scanner;

public class FormatOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double number = scanner.nextDouble();
        System.out.print("Enter the number of decimal places: ");
        int countAfterPoint = scanner.nextInt();


        double convertedDouble = doubleToDecimalPlaces(number, countAfterPoint);
        System.out.print("Result of " + countAfterPoint + " decimal:" + convertedDouble);
    }

    /**
     * Round the number to n decimal places
     *
     * @param number          the inputted number
     * @param countAfterPoint number of decimal places
     * @return converted double
     */
    private static double doubleToDecimalPlaces(double number, int countAfterPoint) {
        double scale = Math.pow(10, countAfterPoint);
        return Math.round(number * scale) / scale;
    }
}
