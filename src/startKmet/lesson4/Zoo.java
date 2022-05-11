package startKmet.lesson4;

public class Zoo {
    public static void main(String[] args) {

        int bears = 10;
        int tigers = 5;
        int parrots = 15;
        int elephants = 20;
        int raccoons = 20;
        int animalsThisYear = countAnimals(bears, tigers, parrots, elephants, raccoons);
        System.out.println("There are " + animalsThisYear + " animals this year in the zoo.");
        int animalsNextYear = countAnimalsNextYear(bears, tigers, parrots, elephants, raccoons);
        System.out.println("There will be " + animalsNextYear + " animals next year in the zoo.");
        int porcupines = 20;
        int animalsNextYearPorcupine = countAnimalsNextYear(bears, tigers, parrots, elephants, raccoons, porcupines);
        System.out.println("If this year we buy " + porcupines + " porcupines, we will have totaly " + animalsNextYearPorcupine + " animals next year.");

    }


    /**
     * Counts the number of animals in the zoo this year
     *
     * @param bears     number of bears this year
     * @param tigers    number of tigers this year
     * @param parrots   number of parrots this year
     * @param elephants number of elephants this year
     * @param raccoons  number of raccoons this year
     * @return the sum of the animals in the zoo this year
     */
    public static int countAnimals(int bears, int tigers, int parrots, int elephants, int raccoons) {
        return bears + tigers + parrots + elephants + raccoons;
    }

    /**
     * Counts the number of animals in the zoo next year
     *
     * @param bears     number of bears this year
     * @param tigers    number of tigers this year
     * @param parrots   number of parrots this year
     * @param elephants number of elephants this year
     * @param raccoons  number of raccoons this year
     * @return the sum of the animals in the zoo next year
     */
    public static int countAnimalsNextYear(int bears, int tigers, int parrots, int elephants, int raccoons) {
        return (int) (bears * 1.3 + tigers * 1.2 + parrots * 1.4 + elephants * 1.05 + raccoons * 1.8);
    }

    /**
     * Counts the number of animals in the zoo next year with porcupines
     *
     * @param bears      number of bears this year
     * @param tigers     number of tigers this year
     * @param parrots    number of parrots this year
     * @param elephants  number of elephants this year
     * @param raccoons   number of raccoons this year
     * @param porcupines number of bought porcupines this year
     * @return the sum of the animals in the zoo next year
     */
    public static int countAnimalsNextYear(int bears, int tigers, int parrots, int elephants, int raccoons, int porcupines) {
        return (int) (bears * 1.3 + tigers * 1.2 + parrots * 1.4 + elephants * 1.05 + raccoons * 1.8 + 1.15 * porcupines);
    }
}
