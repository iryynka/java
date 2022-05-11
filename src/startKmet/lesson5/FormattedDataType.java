package startKmet.lesson5;

import java.util.Scanner;

public class FormattedDataType {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter anything: ");

        boolean hasInteger = scanner.hasNextInt();
        boolean hasDouble = scanner.hasNextDouble();

        if (hasInteger) {
            int isInteger = scanner.nextInt();
            printIntegerDetails(isInteger);
        } else if (hasDouble) {
            double isDouble = scanner.nextDouble();
            System.out.print("Enter the number of decimal places: ");
            int countAfterPoint = scanner.nextInt();
            double formattedDouble = doubleToDecimalPlaces(isDouble, countAfterPoint);
            printDoubleDetails(formattedDouble, countAfterPoint);
        } else {
            String line = scanner.nextLine();
            printStringDetails(line);
        }

    }


    /**
     * Method format string that it doesn't have space and only uppercase letters
     *
     * @param line is formatted
     */
    private static void printStringDetails(String line) {
        String lineUpperWithoutGap = line.toUpperCase().replace(" ", "");
        System.out.printf("You entered a String type. We formatted it to upper case and deleted gaps: %s.%n", lineUpperWithoutGap);
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


    /**
     * Method format double that it prints it in console with only 2 decimal places, checks whether it is integer and if so prints is it positive or negative
     *
     * @param formattedDouble is formatted and analysed
     */
    private static void printDoubleDetails(double formattedDouble, int countAfterPoint) {

        System.out.print("You entered double type. The formatted number with " + countAfterPoint + " decimal places is " + formattedDouble + ". ");
        if (formattedDouble % 1 == 0) {
            if (formattedDouble > 0) {
                System.out.println("The number is positive.");
            } else {
                System.out.println("The number is negative.");
            }
        }
    }


    /**
     * Method check whether the number is positive, negative ot zero.
     *
     * @param isInteger is analysed
     */
    public static void printIntegerDetails(int isInteger) {
        System.out.print("You entered integer type. ");
        if (isInteger > 0) {
            System.out.println("The number is positive.");
        } else if (isInteger == 0) {
            System.out.println("The number equals zero.");
        } else {
            System.out.println("The number is negative.");
        }
    }


}
