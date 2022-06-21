package startKmet.lesson13.homework.phone;

public class Main {
    public static void main(String[] args) {
        Androids android = new Androids();
        iPhones iPhone = new iPhones();
        Smartphones[] phones = {android, iPhone};
        for (Smartphones phone:
             phones) {
            if(phone instanceof iPhones) {
                ((iPhones) phone).faceID();
            } else if (phone instanceof Androids) {
                ((Androids) phone).touchID();
            }
            phone.call();
            phone.sms();
            phone.internet();
        }
        System.out.println();
        android.touchID();

    }
}
