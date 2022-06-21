package startKmet.lesson12.practice;

public class Main {
    public static void main(String[] args) {
        Weekdays day = Weekdays.MONDAY;

        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad");
                break;
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("Midweek days are so-so");
                break;
            case FRIDAY:
                System.out.println("Fridays are better");
                break;
            case SUNDAY:
            case SATURDAY:
                System.out.println("Weekends are the best");
                break;

        }
    }
}
