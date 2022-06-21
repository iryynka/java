package startKmet.draft.practice3;

public class Arithmetic {
    public static void main(String[] args) {


        double a = 10d;
        double b = 6d;
        double c = 4d;
        double firstExpression = (Math.abs(a - b)) / (Math.pow(a + b, 3)) - Math.sqrt(c);
        double secondExpression = (a + b) / (((12 * c) % 4) + Math.abs(b));
        System.out.println(firstExpression);
        System.out.println(secondExpression);


    }
}
