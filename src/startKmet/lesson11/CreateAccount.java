package startKmet.lesson11;

public class CreateAccount {
    private final String NAME;
    private final int DAY;
    private final int MONTH;
    private final int YEAR;
    private final String EMAIL;
    private final String PHONE;
    private String surname;
    private double weight;
    private int pressure;
    private int steps;
    private final int age;

    public CreateAccount(String name, int day, int month, int year, String email, String phone, String surname, double weight, int pressure, int steps) {
        this.NAME = name;
        this.DAY = day;
        this.MONTH = month;
        this.YEAR = year;
        this.EMAIL = email;
        this.PHONE = phone;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
        this.age = 2022 - this.YEAR;
    }

    public String getNAME() {
        return NAME;
    }

    public int getDAY() {
        return DAY;
    }

    public int getMONTH() {
        return MONTH;
    }

    public int getYEAR() {
        return YEAR;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public String getPHONE() {
        return PHONE;
    }

    public String getSurname() {
        return surname;
    }

    public double getWeight() {
        return weight;
    }

    public int getPressure() {
        return pressure;
    }

    public int getSteps() {
        return steps;
    }

    public int getAge() {
        return age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public String  printAccountInfo(){
        return "Name: " + getNAME() +
                "\nSurname: " + getSurname() +
                "\nBirth date: " + getDAY() + "." + getMONTH() + "." + getYEAR() +
                "\nYears: " + getAge() +
                "\nEmail: " + getEMAIL() +
                "\nPhone: " + getPHONE() +
                "\nWeight: " + getWeight() +
                "\nPressure: " + getPressure() +
                "\nSteps per day: " + getSteps() +"\n";
    }
}
