package startKmet.lesson13.homework;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp {

    public static void main(String[] args) {
        String[] names = {"VOVA", "Ivan", "R2d2", "ZX", "Anna", "12345", "ToAd", "TomCat", " " };
        for (String name :
                names) {
            System.out.println(name + " is " + checkPersonWithRegExp(name));
        }
    }

    public static boolean checkPersonWithRegExp(String userNameString) {
       String regexpNum = "\\d";
        Pattern patternNum = Pattern.compile(regexpNum);
        Matcher matchNum = patternNum.matcher(userNameString);


        String regexpFirst = "^([A-Z])";
        Pattern patternFirst = Pattern.compile(regexpFirst);
        Matcher matchFirst = patternFirst.matcher(userNameString);


        String regexWhiteSpace = "\\S";
        Pattern patternWhite = Pattern.compile(regexWhiteSpace);
        Matcher matchWhite = patternWhite.matcher(userNameString);

        return !matchNum.find()&&matchFirst.find() && matchWhite.find() ;

    }
}
