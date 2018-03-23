package practise;

import org.apache.commons.lang3.StringUtils;

/**
 * Project: algo-test
 * Package: practise
 * <p>
 * User: vthalapu
 * Date: 3/22/18
 * Time: 7:24 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class CheckNumber {
    static public void main(String... args) {
        System.out.println(checkNumber(".3"));
        System.out.println(checkNumber("0.3"));
    }

    static boolean checkNumber(String numbers) {

        char[] character = numbers.toCharArray();

        for (int i = 0; i < character.length; i++) {

            if (i == 0 && !StringUtils.isNumeric(String.valueOf(character[i])) && character[i] == '.' && character[i] != '-') {
                return false;
            }
            if (character[i] == '.') {
            }

            if (character[i] != '.') {
                if (!StringUtils.isNumeric(String.valueOf(character[i]))) {
                    return false;
                }
            }

        }

        return true;
    }
}
