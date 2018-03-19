package sorts;

import java.util.Random;

/**
 * Project: algo-test
 * Package: sorts
 * <p>
 * User: vthalapu
 * Date: 3/18/18
 * Time: 5:47 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class MergeSort {

    static public void main(String... args) {

        MergeSort mergeSort = new MergeSort();

        int maxArrLength = 100000;
        int maxRandom = 80000;

        Integer[] actArray = new Integer[maxArrLength];

        Random random = new Random();
        for (int i = 0; i < maxArrLength; i++) {
            actArray[i] = random.nextInt(maxRandom);
        }

        System.out.println(System.currentTimeMillis());
        mergeSort.mergeSort(actArray);
        System.out.println(System.currentTimeMillis());
//        System.out.println(Arrays.toString(actArray));

    }

    public void mergeSort(Integer[] actualArray) {
        Integer[] helper = new Integer[actualArray.length];
        mergeSort(actualArray, helper, 0, actualArray.length - 1);

    }

    public void mergeSort(Integer[] actualArray, Integer[] helper, int low, int high) {

        if (low < high) {
            int mid = low + (high - low) / 2;
            mergeSort(actualArray, helper, low, mid);
            mergeSort(actualArray, helper, mid + 1, high);
            mergeHalves(actualArray, helper, low, mid, high);
        }

    }

    public void mergeHalves(Integer[] actualArray, Integer[] helper, int low, int mid, int high) {

        for (int i = 0; i <= actualArray.length - 1; i++) {
            helper[i] = actualArray[i];
        }

        int i = low;
        int j = mid + 1;
        int k = low;

        while (i <= mid && j <= high) {
            if (helper[i] <= helper[j]) {
                actualArray[k] = helper[i];
                i++;
            } else {
                actualArray[k] = helper[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            actualArray[k] = helper[i];
            k++;
            i++;
        }

    }

}
