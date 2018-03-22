package helper;

import practise.Sort;

import java.util.Arrays;
import java.util.Random;

/**
 * Project: algo-test
 * Package: helper
 * <p>
 * User: vthalapu
 * Date: 3/21/18
 * Time: 8:21 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class SortUtils {
    public static void sortAndLogTime(Sort sort, Integer[] actualArray) {
        long start = System.currentTimeMillis();
        System.out.println(start);
        actualArray = sort.sort(actualArray);
        System.out.println(Arrays.toString(actualArray));
        long end = System.currentTimeMillis();
        System.out.println(end);
        System.out.println("Total seconds ->" + (end - start) / 1000);
    }

    static public Integer[] getRandomUnSortedArray(Integer maxArrayLength, Integer randomLength) {
        Integer[] actualArray;
        actualArray = new Integer[maxArrayLength];
        Random random = new Random();
        for (int i = 0; i < maxArrayLength; i++) {
            actualArray[i] = random.nextInt(randomLength);
        }

        return actualArray;
    }
}
