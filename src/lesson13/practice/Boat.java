package startKmet.lesson13.practice;

public class Boat implements Swimmable, Transportable{
    @Override
    public void swim() {
        System.out.println("Це човен, і він плаває. ");
    }

    @Override
    public void transport() {
        System.out.println("Човен може перевозити вантаж. ");
    }

}
