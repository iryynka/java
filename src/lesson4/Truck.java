package startKmet.lesson4;

public class Truck {
    public static void main(String[] args) {
        int length = 18;
        int width = 5;
        int height = 6;
        long volume = countVolume(length, width, height);
        System.out.println("The volume is " + volume);
    }

    /**
     * Calculate the volume
     * @param length
     * @param width
     * @param height
     * @return
     */
    public static int countVolume(int length, int width, int height) {
        return length * width * height;
    }
}
