package startKmet.lesson10;

public class BurgerHouse {
    public static void main(String[] args) {

        Burger basic = new Burger("2 buns", "chicken", "1 slice", "lime", 2);
        basic.printBasicBurger();

        Burger vegetarian = new Burger("3 buns", "pork", "2 slices", 1);
        vegetarian.printVegetarianBurger();

        Burger doubleMeat = new Burger("2 buns", "pork", "chicken", "3 slices", "spicy", 3);
        doubleMeat.printDoubleBurger();
    }
}
