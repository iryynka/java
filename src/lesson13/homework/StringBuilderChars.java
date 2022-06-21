package startKmet.lesson13.homework;

import java.util.Arrays;

public class StringBuilderChars {

    public static char[] uniqueChars(String s) {
        char[] uniqueChars = new char[s.length()];
        s.getChars(0, s.length(), uniqueChars, 0);
        return uniqueChars;
    }

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Using methods of class String");
        System.out.println("Your string - " + s);
        char[] uniqueChars = uniqueChars(s.toString());
        System.out.println("Chars in your string - " + Arrays.toString(uniqueChars));
    }
}
