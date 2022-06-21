package startKmet.lesson13.homework.phone;

public class iPhones implements Smartphones, iOS {
    @Override
    public void call() {
        System.out.println("You're calling from iPhone. ");
    }

    @Override
    public void sms() {
        System.out.println("You're sending the sms from iPhone. ");
    }

    @Override
    public void internet() {
        System.out.println("This is internet on iPhone. ");
    }

    @Override
    public void faceID() {
        System.out.println("This phone has faceID");
    }
}
