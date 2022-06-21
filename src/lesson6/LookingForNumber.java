package startKmet.lesson6;

import java.util.Scanner;

public class LookingForNumber {
    public static void main(String[] args) {

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter positive integer number: ");
            if(scanner.hasNextInt()){
                int number = scanner.nextInt();
                if(number< 0) {
                    System.out.println("You entered negative integer. Try again!");
                } else {
                    System.out.println("Thank you! You entered positive integer " + number +".");
                    break;
                }
            } else {
                System.out.println("It's not an integer positive number. Try again!");

            }
        } while (true);
    }
}
