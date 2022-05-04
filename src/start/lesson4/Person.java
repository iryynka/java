package start.lesson4;

public class Person {

    public static void main(String[] args) {

        String willSmith = personInfo("Will", "Smith", "New York", 19875699728L);
        String jackieChan = personInfo("Jackie", "Chan", "Shanghai", 862165937544L);
        String sherlockHolmes = personInfo("Sherlock", "Holmes", "London", 442045773764L);

        System.out.println(willSmith);
        System.out.println(jackieChan);
        System.out.println(sherlockHolmes);
    }


    /**
     * Create a sentence with given information
     *
     * @param name    the person's name
     * @param surname the person's surname
     * @param city    city where the person is registered
     * @param number  person's phone number
     * @return give back sentence with used params
     */
    public static String personInfo(String name, String surname, String city, long number) {
        return "You can make a call to citizen " + name + " " + surname + " from " + city + " city with this phone number " + number + ".";
    }
}
