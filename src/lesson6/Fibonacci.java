package startKmet.lesson6;


import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        int zero = 0;
        int first = 1;
        int next;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of Fibonacci sequence: ");


            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();


                if (number < 0) {
                    System.out.println("Please, enter integer positive number. ");
                } else {
                    for (int i = 0; i <= number; i++) {
                        System.out.println(i + " sequence number: " + zero);
                        next = first + zero;
                        zero = first;
                        first = next;
                    }
                    break;
                }


            } else {
                System.out.println("Please, enter integer positive number. ");
            }


        } while (true);

    }
}
