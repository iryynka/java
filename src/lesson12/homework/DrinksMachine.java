package startKmet.lesson12.homework;

public enum DrinksMachine {
    COFFEE(1, 45),
    TEA(2, 20),
    LEMONADE(3, 39),
    WATER(4, 15),
    COLA(5, 18),
    MOJITO(6, 39);

    private final int value;
    private final int price;

    DrinksMachine(int value, int price) {
        this.value = value;
        this.price = price;
    }

    public int getValue() {
        return this.value;
    }

    public int getPrice() {
        return this.price;
    }

    public static DrinksMachine valueOf(int drinkSelected) {
        for (DrinksMachine drink : DrinksMachine.values()) {
            if (drinkSelected == drink.getValue())
                return drink;
        }
        return null;
    }
}
