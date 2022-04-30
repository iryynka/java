package start.lesson3;

import java.util.Scanner;

public class Random {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("This program generates random number.");

        System.out.print("Enter the integer min value: ");
        int min = scanner.nextInt();

        System.out.print("Enter the integer max value: ");
        int max = scanner.nextInt();

        //Generates random number that includes min and max value
        int random = min + (int) (Math.random() * (max - min + 1));
        System.out.println("The random value is " + random + " between range: " + min + " and " + max + ".");

    }
}