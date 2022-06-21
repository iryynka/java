package startKmet.lesson2;

public class PrimitiveTypes {
    public static void main(String[] args) {

        //Ініціалізація сторін a, b, c; об'єму та периметру паралелепіпеда
        double a = 4.5d;
        double b = 6.d;
        double c = 0.5d;
        double volume = a * b * c;
        System.out.println("Об'єм паралелепіпеда = " + volume);
        double length = 4*(a+b+c);
        System.out.println("Периметр паралелепіпеда = " + length);



        //Змінні з широтою і довготою гори, виведення в консоль
        double latitude = 27.987988;
        double longitude = 86.925168;
        System.out.println("Координати гори Еверест: \n- широта: " + latitude + "\n- довгота: " + longitude);

    }
}
