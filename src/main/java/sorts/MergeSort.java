package sorts;

import java.util.Arrays;

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


        Integer[] actArray = new Integer[]{8, 4, 3, 49, 0, -2, 7, 3, 81, 18, 10, 20, 8, 4, 3, 49, 0
                , -2, 7, 3, 81, 18, 10, 20, 8, 4, 3, 49, 0, -2, 7, 3, 81, 18, 10, 20, 8, 4, 3, 49, 0, -2, 7, 3, 81, 18, 10, 20};
//        Integer[] actArray = new Integer[]{8, 4, 3, 49, 0};
        mergeSort.mergeSort(actArray);
        System.out.println(Arrays.toString(actArray));

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
