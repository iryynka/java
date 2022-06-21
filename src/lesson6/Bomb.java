package startKmet.lesson6;

public class Bomb {
    public static void main(String[] args) {
        int timer = 10;
        while (timer >= 0) {
            System.out.println("It's " + timer + "...");
            timer--;
            if (timer < 0) {
                System.out.println("BOOOOOOOOOOOMM");
                break;
            }
        }
    }
}
