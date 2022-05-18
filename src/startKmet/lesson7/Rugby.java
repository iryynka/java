package startKmet.lesson7;

import java.util.Random;

public class Rugby {
    public static void main(String[] args) {
        int numberOfPlayersFirstTeam = 25;
        int numberOfPlayersSecondTeam = 25;
        int[] firstTeamAgeArray = new int[numberOfPlayersFirstTeam];
        int[] secondTeamAgeArray = new int[numberOfPlayersSecondTeam];
        int maxAge = 40;
        int minAge = 18;

        firstTeamData(firstTeamAgeArray, maxAge, minAge, numberOfPlayersFirstTeam);

        System.out.println();

        secondTeamData(secondTeamAgeArray, maxAge, minAge, numberOfPlayersSecondTeam);
    }




    /**
     * Returns data about age, average age in the team
     * @param secondTeamAgeArray an array with age of each player
     * @param maxAge the maximum age allowed
     * @param minAge the minimum age allowed
     * @param numberOfPlayersSecondTeam the number of players
     */
    private static void secondTeamData(int[] secondTeamAgeArray, int maxAge, int minAge, int numberOfPlayersSecondTeam) {
        Random age = new Random();
        int countAgeSecondTeam = 0;
        for (int i = 0; i < secondTeamAgeArray.length; i++) {
            secondTeamAgeArray[i] = age.nextInt(maxAge - minAge + 1) + minAge;
            countAgeSecondTeam = countAgeSecondTeam + secondTeamAgeArray[i];
            if (i == 0) {
                System.out.print("Age of players in second team:");
            }
            System.out.print(" " + secondTeamAgeArray[i]);
        }
        int averageAgeSecond = countAgeSecondTeam / numberOfPlayersSecondTeam;
        System.out.printf("\nThe average age in second team is %d", averageAgeSecond);
    }


    /**
     * Returns data about age, average age in the team
     * @param firstTeamAgeArray an array with age of each player
     * @param maxAge the maximum age allowed
     * @param minAge the minimum age allowed
     * @param numberOfPlayersFirstTeam the number of players
     */
    private static void firstTeamData(int[] firstTeamAgeArray, int maxAge, int minAge, int numberOfPlayersFirstTeam) {
        Random age = new Random();

        int countAgeFirstTeam = 0;
        for (int i = 0; i < firstTeamAgeArray.length; i++) {
            firstTeamAgeArray[i] = age.nextInt(maxAge - minAge + 1) + minAge;
            countAgeFirstTeam = countAgeFirstTeam + firstTeamAgeArray[i];
            if (i == 0) {
                System.out.print("Age of players in first team:");
            }
            System.out.print(" " + firstTeamAgeArray[i]);
        }
        int averageAgeFirst = countAgeFirstTeam / numberOfPlayersFirstTeam;
        System.out.printf("\nThe average age in first team is %d", averageAgeFirst);
    }
}
