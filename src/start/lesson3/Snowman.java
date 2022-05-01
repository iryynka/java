package start.lesson3;

public class Snowman {
    public static void main(String[] args) {

        //Three snowballs with r1 = 1 m, r2 = 0.5 m, r3 = 0.2 m
        double r1 = 1d;
        double r2 = .5d;
        double r3 = .2d;
        System.out.println("We have made a snowman with three balls. The first has a radius " + r1 + " m, the second - " + r2 + " m, the third - " + r3 + " m.");

        //Density of the snow in kg/m^3
        double den = .7;
        System.out.println("The density of the snow is " + den + " kg/m^3.");

        double pi = Math.PI;

        //Snowballs' volume
        double vol1 = pi * (4. / 3.) * Math.pow(r1, 3);
        double vol2 = pi * (4. / 3.) * Math.pow(r2, 3);
        double vol3 = pi * (4. / 3.) * Math.pow(r3, 3);
        System.out.printf("The largest ball has a volume = %.2f", vol1);
        System.out.printf(" m^3.\nThe second = %.2f", vol2);
        System.out.printf(" m^3.\nThe third = %.2f", vol3);
        System.out.print(" m^3.\n");

        //Calculating the weight
        double vol = vol1 + vol2 + vol3;
        double weight = den * vol;
        System.out.printf("The weight is near %.2f kg.", weight);
    }
}
