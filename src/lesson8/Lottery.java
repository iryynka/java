package startKmet.lesson8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        int numbersInArray = 7; //Кількість елементів у масиві
        int[] playerNumbers = playerNumbers(numbersInArray); //Масив із числами, що вводить користувач, довжини numbersInArray
        int[] randomNumbers = randomNumbers(numbersInArray); //Масив із рандомними числами,довжини numbersInArray
        int[] sortedPlayer = sort(playerNumbers); //Відсортований за зростанням масив playerNumbers
        int[] sortedRandom = sort(randomNumbers); //Відсортований за зростанням масив randomNumbers
        int match = match(sortedPlayer, sortedRandom); //Порівняння елементів двох масивів та виведення кількості співпадінь

        System.out.println("Sorted player's array: " + Arrays.toString(sortedPlayer));
        System.out.println("Sorted random array: " + Arrays.toString(sortedRandom));
        System.out.printf("There are %d matches", match);
    }

    /**
     * Checks the equality of arrays
     * @param sortedPlayer array
     * @param sortedRandom array
     * @return the number of matches
     */
    private static int match(int[] sortedPlayer, int[] sortedRandom) {
        int counter = 0;
        for (int i = 0; i < sortedPlayer.length; i++) {
            if (sortedPlayer[i] == sortedRandom[i]) {
                counter = counter + 1;
            }
        }
        return counter;
    }

    /**
     * Sorts the array from the smallest to the biggest number
     * @param array array that is being sorted
     * @return sorted array
     */
    private static int[] sort(int[] array) {
        Arrays.sort(array);
        return array;
    }

    /**
     * Program creates the array with random numbers
     * @param numbersInArray the number of elements in tha array
     * @return array with random numbers
     */
    private static int[] randomNumbers(int numbersInArray) {
        int[] randomNumbers = new int[numbersInArray];
        Random random = new Random();
        for (int i = 0; i < numbersInArray; i++) {
            randomNumbers[i] = random.nextInt(10);
        }
        return randomNumbers;
    }


    /**
     * User enter numbers
     * @param numbersInArray the amount of numbers user can enter
     * @return array with user's numbers
     */
    private static int[] playerNumbers(int numbersInArray) {
        int[] playerNumbers = new int[numbersInArray];
        for (int i = 0; i < numbersInArray; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter integer number in range 0 to 9: ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number < 0 || number > 9) {
                    System.out.println("Try again. The number is out of bounds. ");
                } else {
                    playerNumbers[i] = number;
                }
            } else {
                System.out.println("Try again. ");
                i--;
            }
        }
        return playerNumbers;
    }
}

