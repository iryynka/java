package startKmet.lesson10;

public class Burger {
    String bun;
    String firstMeat;
    String secondMeat;
    String cheese;
    String mayonnaise;
    int salad;


    public Burger(String bun, String firstMeat, String cheese, int salad) {
        this.bun = bun;
        this.firstMeat = firstMeat;
        this.cheese = cheese;
        this.salad = salad;
    }

    public void printBasicBurger() {
        System.out.printf("The basic burgers has: %s, %s meat, %s of cheese, %s mayonnaise, %d lettuce \n", this.bun, this.firstMeat, this.cheese, this.mayonnaise, this.salad);
    }

    public Burger(String bun, String firstMeat, String cheese, String mayonnaise, int salad) {
        this.bun = bun;
        this.firstMeat = firstMeat;
        this.cheese = cheese;
        this.mayonnaise = mayonnaise;
        this.salad = salad;
    }

    public void printVegetarianBurger() {
        System.out.printf("The vegetarian burgers has: %s buns, %s meat, %s of cheese, %d lettuce \n", this.bun, this.firstMeat, this.cheese, this.salad);
    }

    public Burger(String bun, String firstMeat, String secondMeat, String cheese, String mayonnaise, int salad) {
        this.bun = bun;
        this.firstMeat = firstMeat;
        this.secondMeat = secondMeat;
        this.cheese = cheese;
        this.mayonnaise = mayonnaise;
        this.salad = salad;
    }

    public void printDoubleBurger() {
        System.out.printf("Double meat burger has: %s buns, %s and %s meat, %s of cheese, %s mayonnaise, %d lettuce \n", this.bun, this.firstMeat, this.secondMeat, this.cheese, this.mayonnaise, this.salad);
    }
}
