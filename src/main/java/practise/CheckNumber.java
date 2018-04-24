//package practise;
//
//import org.apache.commons.lang3.StringUtils;
//
///**
// * Project: algo-lambdas
// * Package: practise
// * <p>
// * User: vthalapu
// * Date: 3/22/18
// * Time: 7:24 PM
// * <p>
// * Created with IntelliJ IDEA
// * To change this template use File | Settings | File Templates.
// */
//public class CheckNumber {
//    static public void main(String... args) {
//        System.out.println(".3 -> " + checkNumber(".3"));
//        System.out.println("0.3 -> " + checkNumber("0.3"));
//        System.out.println(".3 -> " + checkNumber(".3"));
//        System.out.println("-.3 -> " + checkNumber("-.3"));
//        System.out.println("-.3f -> " + checkNumber("-.3f"));
//        System.out.println("1233.-2 -> " + checkNumber("1233.-2"));
//        System.out.println("-1233.f -> " + checkNumber("-1233.f"));
//        System.out.println("-1233.0 -> " + checkNumber("-1233.0"));
//        System.out.println("-f.3 -> " + checkNumber("-f.3"));
//        System.out.println("f.3 -> " + checkNumber("f.3"));
//        System.out.println("-000000033333.0003 -> " + checkNumber("-000000033333.0003"));
//        System.out.println("-000000033333.0d003 -> " + checkNumber("-000000033333.0d003"));
//        System.out.println("-000000033333.0003 -> " + checkNumber("-000000033333.0003"));
//        System.out.println("-000.00.0033333.0003 -> " + checkNumber("-000.00.0033333.0003"));
//    }
//
//    static boolean checkNumber(String numbers) {
//
//        char[] character = numbers.toCharArray();
//        int j = 0;
//        int periodCount = 0;
//        if (character[0] == '-') {
//            j = 1;
//        }
//
//        for (int i = j; i < character.length; i++) {
//
//            if (i == j && !StringUtils.isNumeric(String.valueOf(character[i])) && character[i] == '.' && character[i] != '-') {
//                return false;
//            }
//            if (character[i] == '.') {
//                periodCount++;
//            }
//
//            if (character[i] != '.') {
//                if (!StringUtils.isNumeric(String.valueOf(character[i]))) {
//                    return false;
//                }
//            }
//
//        }
//
//        return periodCount <= 1;
//    }
//}
