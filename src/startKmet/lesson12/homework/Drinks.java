package startKmet.lesson12.homework;

import java.util.Objects;
import java.util.Scanner;

public class Drinks {

    public static void main(String[] args) {

        int countDrinks = 0;
        int countSum = 0;
        for (DrinksMachine drink : DrinksMachine.values())
            System.out.println(" " + drink.getValue() + " " + drink.name() + " - " + drink.getPrice());


        while (true) {

            System.out.print("Enter number of drink that you want to order: ");
            Scanner scan = new Scanner(System.in);

            if (scan.hasNextInt()) {
                int number = scan.nextInt();
                if (number > 0 && number < 7) {
                    switch (number) {
                        case 1:
                            System.out.println("You ordered coffee! ");
                            break;
                        case 2:
                            System.out.println("You ordered tea! ");
                            break;
                        case 3:
                            System.out.println("You ordered lemonade! ");
                            break;
                        case 4:
                            System.out.println("You ordered water! ");
                            break;
                        case 5:
                            System.out.println("You ordered cola! ");
                            break;
                        case 6:
                            System.out.println("You ordered mojito! ");
                            break;
                    }
                    countDrinks = countDrinks + 1;
                    countSum = countSum + Objects.requireNonNull(DrinksMachine.valueOf(number)).getPrice();
                    System.out.println("Do you want to order something else? Enter \"+\" if so ");
                    String character = scan.next();
                    if (character.equals("+")) {
                        continue;
                    } else {
                        System.out.printf("You ordered %d drinks and total sum is %d", countDrinks, countSum);
                        break;
                    }
                }
            }


            System.out.println("Please enter integer number from 1 to 6. ");


        }


    }
}
