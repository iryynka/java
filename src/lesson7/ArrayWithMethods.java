package startKmet.lesson7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayWithMethods {
    public static void main(String[] args) {

        int length = checkEnteredValue();
        int maxNumber = 20;
        int minNumber = -20;
        int[] numbers = new int[length];
        fillTheArray(numbers, maxNumber, minNumber);


        maxElement(numbers);
        minElement(numbers);
        averageValue(numbers);

    }

    /**
     * fill the array with random integer numbers
     *
     * @param numbers   empty array
     * @param maxNumber maximum available value
     * @param minNumber minimum available value
     */
    private static void fillTheArray(int[] numbers, int maxNumber, int minNumber) {
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(maxNumber - minNumber + 1) + minNumber;
        }
        System.out.println("Array: " + Arrays.toString(numbers));
    }

    /**
     * checks the correctness of the input
     *
     * @return the length of array
     */
    private static int checkEnteredValue() {
        int length;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the length of array: ");
            if (scanner.hasNextInt()) {
                length = scanner.nextInt();
                break;
            }
            System.out.println("You entered incorrect value. Try again. ");
        }
        System.out.printf("Your array has %d elements. ", length);
        return length;
    }


    /**
     * calculates average value in the array
     *
     * @param numbers array with numbers
     */
    private static void averageValue(int[] numbers) {
        int counter = 0;
        for (int number : numbers) {
            counter = counter + number;
        }
        double averageValue = (double) counter / numbers.length;
        System.out.printf("%.2f is the average value in the array.", averageValue);
    }

    /**
     * looking for the minimum value
     *
     * @param numbers array with numbers
     */
    private static void minElement(int[] numbers) {
        int min = numbers[0];
        for (int number : numbers) {
            if (min > number) {
                min = number;
            }
        }
        System.out.println(min + " is the smallest number in array. ");
    }


    /**
     * looking for the maximum value
     *
     * @param numbers array with numbers
     */
    private static void maxElement(int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (max < number) {
                max = number;
            }
        }
        System.out.println(max + " is the largest number in array. ");
    }
}
