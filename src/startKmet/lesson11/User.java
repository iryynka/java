package startKmet.lesson11;

public class User {
    public static void main(String[] args) {

        CreateAccount first = new CreateAccount("Oleg", 23, 6, 2001, "olegk@gmail.com", "+380958625128", "Koval", 65.7, 130, 12_000);
        System.out.println(first.printAccountInfo());
        CreateAccount second = new CreateAccount("Sofia", 13, 9, 1994, "soofik@gmail.com", "+380991285128", "Petruk", 49.1, 120, 9_000);
        System.out.println(second.printAccountInfo());
        CreateAccount third = new CreateAccount("Taras", 1, 1, 2008, "taras08buts@gmail.com", "+380554539000", "Buts", 59.9, 135, 21_000);
        System.out.println(third.printAccountInfo());
        CreateAccount fourth = new CreateAccount("Amelia", 4, 4, 2010, "amelia.princess@ukr.net", "+380956749675", "Kogut", 38.7, 119, 5_000);
        System.out.println(fourth.printAccountInfo());

        first.setSurname("Petriv");
        first.setPressure(120);
        System.out.println(first.printAccountInfo());

        third.setSteps(30_000);
        System.out.println(third.printAccountInfo());

        fourth.setWeight(40.4);
        System.out.println(fourth.printAccountInfo());
    }
}
