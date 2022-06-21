package startKmet.lesson4;

public class Airplanes {
    public static void main(String[] args) {
        String type = "Jet";
        String name = "F52";
        int firstClassPassengers = 20;
        int secondClassPassengers = 250;
        String firstPlane = buildAirplane(type, name);
        String secondPlane = buildAirplane("Boeing", "747", 300);
        String thirdPlane = buildAirplane("Boeing", "747", firstClassPassengers, secondClassPassengers);
        System.out.println(firstPlane);
        System.out.println();
        System.out.println(secondPlane);
        System.out.println();
        System.out.println(thirdPlane);
    }

    public static String buildAirplane(String type, String name) {
        return "Type: " + type + " \nName: " + name;
    }

    public static String buildAirplane(String type, String name, int secondClassPassengers) {
        return "Type: " + type + "\nName: " + name + "\nNumber of seats in second class: " + secondClassPassengers;
    }

    public static String buildAirplane(String type, String name, int firstClassPassengers, int secondClassPassengers) {
        return "Type: " + type + "\nName: " + name + "\nNumber of seats in first class: " + firstClassPassengers + "\nNumber of seats in second class: " + secondClassPassengers;

    }
}
