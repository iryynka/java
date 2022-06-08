package startKmet.lesson13.homework.phone;

public class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("You're calling from Android phone. ");
    }

    @Override
    public void sms() {
        System.out.println("You're sending the sms from Android. ");
    }

    @Override
    public void internet() {
        System.out.println("This is internet on Android. ");
    }

    @Override
    public void touchID() {
        System.out.println("This Android has touchID");
    }
}
