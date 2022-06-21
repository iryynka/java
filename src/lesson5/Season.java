package startKmet.lesson5;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number from 1 to 12 ");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
            case 2:
            case 12:
                System.out.println("It's winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("It's spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("It's summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("It's autumn");
                break;
            default:
                System.out.println("Wrong number");
        }
    }
}
