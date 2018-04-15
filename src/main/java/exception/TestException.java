package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Project: Test-Algos
 * Package: PACKAGE_NAME
 * <p>
 * User: vthalapu
 * Date: 4/15/18
 * Time: 12:39 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
class TestException {
    public static void main(String... args){
        try {
            String path = "";
         //   String path = null;
            FileInputStream fileInputStream = new FileInputStream(path);
        } catch (FileNotFoundException | NullPointerException e) {
            System.out.println("file not found exception occured while using FileInputstream in main method of TestException");
            e.printStackTrace();
        }
//        catch (NullPointerException n){
//            System.out.println("NullPointerException occured while using FileInputstream in main method of TestException");
//            n.printStackTrace();
//        }
    }
}
