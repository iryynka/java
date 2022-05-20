package startKmet.lesson8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int numbersInArray = numbersInArray();//Ведення користувачем кількості елементів у масиві
        int[] randomInArray = randomArray(numbersInArray);//Виведення заповненого масиву
        int[] sortedArray = sort(randomInArray);//Відсортований масив за зростанням
        System.out.println("Your array is " + Arrays.toString(sortedArray));//Виведення відсортованого масиву
        binarySearch(sortedArray);//Бінарний пошук
    }

    /**
     * Scan the number you want to search
     *
     * @return the entered number
     */
    private static int searchNumber() {

        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the number for binary search: ");
            if (scan.hasNextInt()) {
                return scan.nextInt();
            } else {
                System.out.println("Incorrect value. Try again.");
            }
        } while (true);
    }

    /**
     * Checks whether the number is in the array with binary search
     *
     * @param sortedArray used array
     */
    private static void binarySearch(int[] sortedArray) {
        int searchNumber = searchNumber();
        int firstIndex = 0;
        int lastIndex = sortedArray.length - 1;
        int position = (lastIndex - firstIndex) / 2;
        while ((sortedArray[position] != searchNumber) && (firstIndex <= lastIndex)) {
            if (sortedArray[position] > searchNumber) {
                lastIndex = lastIndex - 1;
            } else {
                firstIndex = firstIndex + 1;
            }
            position = (lastIndex - firstIndex) / 2;
        }
        if (sortedArray[position] == searchNumber) {
            System.out.printf("sortedArray[%d] = %d", position, searchNumber);
        } else {
            System.out.println("Not found");

            System.out.println("Try again");

            binarySearch(sortedArray);

        }
    }


    /**
     * Sorts the array from the smallest to the biggest number
     *
     * @param randomInArray array that is being sorted
     * @return sorted array
     */
    private static int[] sort(int[] randomInArray) {
        Arrays.sort(randomInArray);
        return randomInArray;
    }

    /**
     * Program creates the array with random numbers
     *
     * @param numbersInArray the number of elements in tha array
     * @return array with random numbers
     */
    private static int[] randomArray(int numbersInArray) {
        Random random = new Random();
        int[] array = new int[numbersInArray];
        for (int i = 0; i < numbersInArray; i++) {
            array[i] = random.nextInt(101);
        }
        return array;
    }

    /**
     * Scans the amount of numbers in array
     *
     * @return the amount of numbers in array
     */
    private static int numbersInArray() {
        while (true) {
            Scanner scanNumbers = new Scanner(System.in);
            System.out.print("Enter the amount of numbers in the array: ");
            if (scanNumbers.hasNextInt()) {
                return scanNumbers.nextInt();
            } else {
                System.out.println("Please enter integer value. ");
            }
        }
    }
}
