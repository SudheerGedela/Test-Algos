package lists;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Project: algo-test
 * Package: lists
 * <p>
 * User: vamshi
 * Date: 4/22/18
 * Time: 2:47 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class TestArrayList {
    static public void main(String... args) {
        ArrayList<Integer> test = new ArrayList<>();
        test.addAll(Arrays.asList( new Integer[]{1, 2, 3, 5}));

        test.removeIf(r -> r.equals(1));
        System.out.println(test.size());
        System.out.println(test.toString());

//        ArrayList<Integer> empArrList = new ArrayList<>();
//        empArrList.add(1);
//        empArrList.add(2);
//        empArrList.add(3);
//        empArrList.add(4);
//
//        empArrList.removeIf(e -> e == 1);
//        for (Integer e : empArrList)
//            System.out.println(e);

    }
}
