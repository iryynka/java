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

    /**
     * Add the amount of animals in n years
     *
     * @param bears     the number of bears in y year
     * @param tigers    the number of tigers in y year
     * @param parrots   the number of parrots in y year
     * @param elephants the number of elephants in y year
     * @param raccoons  the number of raccoons in y year
     * @param years     the number of year
     * @return the sum of animals in n years
     */
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

    /**
     * Add the amount of animals this year
     *
     * @param bears     the number of bears this year
     * @param tigers    the number of tigers this year
     * @param parrots   the number of parrots this year
     * @param elephants the number of elephants this year
     * @param raccoons  the number of raccoons this year
     * @return the sum of animals this year
     */
    public static int countAnimalsThisYear(int bears, int tigers, int parrots, int elephants, int raccoons) {
        return bears + tigers + parrots + elephants + raccoons;
    }
}
