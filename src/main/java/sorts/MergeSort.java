package sorts;

import java.util.Arrays;
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

        int maxArrLength = 10;
        int maxRandom = 10;

        Integer[] actArray = new Integer[maxArrLength];

        Random random = new Random();
        for (int i = 0; i < maxArrLength; i++) {
            actArray[i] = random.nextInt(maxRandom);
        }

        System.out.println(System.currentTimeMillis());
        mergeSort.mergeSort(actArray);
        System.out.println(Arrays.toString(actArray));

        System.out.println(System.currentTimeMillis());

    }

    public void mergeSort(Integer[] actualArray) {
        Integer[] helper = new Integer[actualArray.length];
        mergeSort(actualArray, helper, 0, actualArray.length - 1);
    }

    public void mergeSort(Integer[] actualArray, Integer[] helper, int low, int high) {

        int mid;
        if (low < high) {
            mid = low + (high - low) / 2;
            mergeSort(actualArray, helper, low, mid);
            mergeSort(actualArray, helper, mid + 1, high);
            mergeHalves(actualArray, helper, low, mid, high);

        }


    }

    private void mergeHalves(Integer[] actualArray, Integer[] helper, int low, int mid, int high) {

        //Copy elements to the array
        for (int i = 0; i < actualArray.length; i++) {
            helper[i] = actualArray[i];
        }

        //assign halves values
        int i = low; //left half start index
        int j = mid + 1; //right half start
        int k = low; //actual array position , will be shifted when compared

        //Compare two half's i-left, j -right
        while (i <= mid && j <= high) {
            if (helper[i] < helper[j]) {
                actualArray[k] = helper[i];
                i++;
            } else {
                actualArray[k] = helper[j];
                j++;
            }
            k++;
        }
        //Copy back the replaced value from help to the actual array
        //this is value which got overriden by the comparision
        while (i <= mid) {
            actualArray[k] = helper[i];
            k++;
            i++;
        }

    }

}