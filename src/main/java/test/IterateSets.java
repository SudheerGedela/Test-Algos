package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Project: algo-test
 * Package: alogos
 * <p>
 * User: vthalapu
 * Date: 3/12/18
 * Time: 3:46 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class IterateSets {
    static public void main(String...args){
        Set<String> testSet = new HashSet<>();
        testSet.add("1");
        testSet.add("2");
        testSet.add("3");

        System.out.println(Arrays.toString(testSet.toArray()));

        testSet.forEach(sItem -> System.out.println(sItem));





    }
}
