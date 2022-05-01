package start.lesson3;

public class Dynasties {
    public static void main(String[] args) {
        //There are 2 dynasties: Li and Ming

        //Li power per one person
        int warriorLi = 13;
        int archerLi = 24;
        int horsemanLi = 46;
        System.out.printf("Li army (per person): \t - warrior %d XPs\n\t\t\t\t\t\t - archer %d XPs\n\t\t\t\t\t\t - horseman %d XPs", warriorLi, archerLi, horsemanLi);
        System.out.println();

        //Ming power per one person
        int warriorMing = 9;
        int archerMing = 35;
        int horsemanMing = 12;
        System.out.printf("Ming army (per person):  - warrior %d XPs\n\t\t\t\t\t\t - arWithcher %d XPs\n\t\t\t\t\t\t - horseman %d XPs", warriorMing, archerMing, horsemanMing);
        System.out.println();

        //The number of each type of soldiers
        int numLi = 860;
        int numMing = (int) (numLi * 1.5);

        //The total power
        int powLi = numLi * (warriorLi + archerLi + horsemanLi);
        int powMing = numMing * (warriorMing + archerMing + horsemanMing);
        System.out.println("The Li army's XPs = " + powLi + "\nThe Ming army's XPs = " + powMing);
    }
}
