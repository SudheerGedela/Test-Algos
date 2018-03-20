package sorts;

import java.util.Arrays;
import java.util.Random;

/**
 * Project: algo-test
 * Package: sorts
 * <p>
 * User: vthalapu
 * Date: 3/19/18
 * Time: 11:43 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class QuickSort {

    private Integer[] actualArray;

    static public void main(String... args) {

        QuickSort quickSort = new QuickSort();

        int maxArrLength = 10000000;
        int maxRandom = 10000000;

        quickSort.actualArray = new Integer[maxArrLength];
        Random random = new Random();
        for (int i = 0; i < maxArrLength; i++) {
            quickSort.actualArray[i] = random.nextInt(maxRandom);
        }


//        quickSort.actualArray = new Integer[]{4, 10, 8, 7, 6, 5, 3, 12, 14, 2};


        long start = System.currentTimeMillis();
        System.out.println(start);

//        quickSort.quickSort(actArray);
        quickSort.quickSort();


        System.out.println(Arrays.toString(quickSort.actualArray));
        long end = System.currentTimeMillis();
        System.out.println(end);
        System.out.println("Total seconds ->" + (end - start) / 1000);

    }


    public void quickSort() {
        quickSort(0, actualArray.length - 1);
    }

    public void quickSort(int low, int high) {
        int i = low;
        int j = high;

        int pivot = (low + high) / 2;

        while (i <= j) {

            while (actualArray[i] < actualArray[pivot]) {
                i++;
            }

            while (actualArray[j] > actualArray[pivot]) {
                j--;
            }

            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(low, j);

        if (i < high)
            quickSort(i, high);
    }

    public void exchange(Integer i, Integer j) {
        Integer temp = actualArray[i];
        actualArray[i] = actualArray[j];
        actualArray[j] = temp;
    }


}
