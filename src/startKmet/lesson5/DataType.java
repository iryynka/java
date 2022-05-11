package startKmet.lesson5;

import java.util.Scanner;

public class DataType {
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
            printDoubleDetails(isDouble);
        } else {
            String line = scanner.nextLine();
            printStringDetails(line);
        }

    }

    private static void printStringDetails(String line) {
        String lineUpperWithoutGap = line.toUpperCase().replace(" ", "");
        System.out.printf("You entered a String type. We formatted it to upper case and deleted gaps: %s.%n", lineUpperWithoutGap);
    }


    private static void printDoubleDetails(double isDouble) {
        double scale = Math.pow(10, 2);
        double formatDouble = Math.round(isDouble * scale) / scale;
        System.out.print("You entered double type. The formatted number with 2 decimal places is " + formatDouble + ". ");
        if (scale % 1 == 0) {
            if (isDouble > 0) {
                System.out.println("The number is positive.");
            } else {
                System.out.println("The number is negative.");
            }
        }
    }


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
