package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Project: algo-test
 * Package: regex
 * <p>
 * User: vthalapu
 * Date: 3/18/18
 * Time: 9:16 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class RegExTest {

    static public void main(String... args) {

        String testString = "Hello Vamsi Usha's Husband";

        Pattern pattern = Pattern.compile("^H");

        Matcher matcher = pattern.matcher(testString);


        while (matcher.find()) {
            System.out.println(matcher.start());
            System.out.println(matcher.end());
            System.out.println(matcher.group());
        }


    }
}
