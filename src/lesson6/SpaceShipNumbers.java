package startKmet.lesson6;

public class SpaceShipNumbers {
    public static void main(String[] args) {
        int numberOfShips = 100;
        int number = 1;
        for (int i = 1; i <= numberOfShips; i++) {
            if (String.valueOf(number).contains("9") || String.valueOf(number).contains("4")) {
                number++;
                i--;
                continue;
            }
            System.out.println("Number for " + i + " ship: " + number);
            number++;
        }
    }
}


