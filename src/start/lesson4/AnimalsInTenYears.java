package start.lesson4;

public class AnimalsInTenYears {
    public static void main(String[] args) {
        int bears = 10;
        int tigers = 5;
        int parrots = 15;
        int elephants = 20;
        int raccoons = 20;
        int years = 10;
        int animalsInTenYears = countAnimalsNextYear(bears, tigers, parrots, elephants, raccoons, years);
        System.out.println("There will be " + animalsInTenYears + " animals in " + years + " years.");
    }

    public static int countAnimalsNextYear(int bears, int tigers, int parrots, int elephants, int raccoons, int years) {
        if (years > 0) {
            int animalsThisYear = countAnimalsThisYear(bears, tigers, parrots, elephants, raccoons);
            bears = (int) (bears * 1.3);
            tigers = (int) (tigers * 1.2);
            parrots = (int) (parrots * 1.4);
            elephants = (int) (elephants * 1.05);
            raccoons = (int) (raccoons * 1.8);
            return animalsThisYear + countAnimalsNextYear(bears, tigers, parrots, elephants, raccoons, years - 1);
        }
        return 0;
    }

    public static int countAnimalsThisYear(int bears, int tigers, int parrots, int elephants, int raccoons) {
        return bears + tigers + parrots + elephants + raccoons;
    }
}
