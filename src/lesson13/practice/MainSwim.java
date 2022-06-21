package startKmet.lesson13.practice;

public class MainSwim {
    public static void main(String[] args) {
        Human person = new Human();
        person.swim();

        Swimmable duck = new Duck();
        duck.swim();

        Swimmable boat = new Boat();
        boat.swim();
        Transportable boat2 = (Transportable) boat;
        boat2.transport();



    }
}
