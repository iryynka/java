package start.lesson3;

public class Dinasties {
    public static void main(String[] args) {
        //There are 2 dinasties: Li and Ming

        //Li power per one person
        int warriorLi = 13;
        int archerLi = 24;
        int horsemanLi = 46;
        System.out.println("Li army (per person): - warrior " + warriorLi + " XPs\n                      - aecher " + archerLi + " XPs\n                      - horseman " + horsemanLi + " XPs");

        //Ming power per one person
        int warriorMing = 9;
        int archerMing = 35;
        int horsemanMing = 12;
        System.out.println("Ming army (per person): - warrior " + warriorMing + " XPs\n                        - aecher " + archerMing + " XPs\n                        - horseman " + horsemanMing + " XPs");

        //The number of each type of soldiers
        int numLi = 860;
        int numMing = (int) (numLi * 1.5);

        //The total power
        int powLi = numLi * (warriorLi + archerLi + horsemanLi);
        int powMing = numMing * (warriorMing + archerMing + horsemanMing);
        System.out.println("The Li army's XPs = " + powLi + "\nThe Ming army's XPs = " + powMing);
    }
}
