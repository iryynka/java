package startKmet.lesson5;

import java.util.Locale;
import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number from 1 to 7 ");
        int number = scanner.nextInt();
        if (number == 1) {
            System.out.println("It's Monday!");
        } else if (number == 2) {
            System.out.println("It's Tuesday!");
        } else if (number == 3) {
            System.out.println("It's wednesday!");
        } else if (number == 4) {
            System.out.println("It's Thursday!");
        } else if (number == 5) {
            System.out.println("It's Friday!");
        } else if (number == 6) {
            System.out.println("It's Saturday!");
        } else if (number == 7) {
            System.out.println("It's Sunday!");
        } else {
            System.out.println("Wrong value");
        }
    }
}
