package practise;

import java.util.Random;

/**
 * Project: algo-test
 * Package: practise
 * <p>
 * User: vthalapu
 * Date: 3/20/18
 * Time: 10:09 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */

interface Sort {
    Integer[] sort(Integer[] allSorts);
}


public class PracSorts {
    Integer[] origArray;
    Integer[] helper;

    static public void main(String... args) {

        PracSorts pracSorts = new PracSorts();

        Integer[] actualArray;

        actualArray = pracSorts.getRandomUnSortedArray(10, 10);
        //Bubble
        System.out.println("**************************************************");
        System.out.println("Bubble Sort");
        Sort bubbleSortInter = actArray -> {
            for (int i = actArray.length - 1; i >= 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (actArray[j] > actArray[j + 1]) {
                        int temp = actArray[j];
                        actArray[j] = actArray[j + 1];
                        actArray[j + 1] = temp;
                    }
                }
            }
            return actArray;
        };

        pracSorts.sortAndLogTime(bubbleSortInter, actualArray);

        //Merge
        System.out.println("**************************************************");
        System.out.println("Merge Sort");
        pracSorts.origArray = pracSorts.getRandomUnSortedArray(100, 100);
        pracSorts.sortAndLogTime(new MergeSort(), pracSorts.origArray);


        //Quick
        System.out.println("**************************************************");
//        Integer arr[] = new Integer[]{8,4,3,49,0};
        System.out.println("Quick Sort");
        pracSorts.origArray = pracSorts.getRandomUnSortedArray(10000000, 10000);
//        pracSorts.sortAndLogTime(new QuickSort(), arr);
        pracSorts.sortAndLogTime(new QuickSort(), pracSorts.origArray);


    }

    public void sortAndLogTime(Sort sort, Integer[] actualArray) {
        long start = System.currentTimeMillis();
        System.out.println(start);
        actualArray = sort.sort(actualArray);
//        System.out.println(Arrays.toString(actualArray));
        long end = System.currentTimeMillis();
        System.out.println(end);
        System.out.println("Total seconds ->" + (end - start) / 1000);
    }

    public Integer[] getRandomUnSortedArray(Integer maxArrayLength, Integer randomLength) {
        Integer[] actualArray;
        actualArray = new Integer[maxArrayLength];
        Random random = new Random();
        for (int i = 0; i < maxArrayLength; i++) {
            actualArray[i] = random.nextInt(randomLength);
        }

        return actualArray;
    }

}


class MergeSort implements Sort {

    @Override
    public Integer[] sort(Integer[] origArray) {
        sort(origArray, new Integer[origArray.length], 0, origArray.length - 1);
        return origArray;
    }

    public void sort(Integer[] origArray, Integer[] helper, Integer low, Integer high) {
        if (low < high) {
            int mid = (low + high) / 2;
            sort(origArray, helper, low, mid);
            sort(origArray, helper, mid + 1, high);
            mergeHalves(origArray, helper, low, mid, high);
        }
    }

    public void mergeHalves(Integer[] origArray, Integer[] helper, int low, int mid, int high) {
        for (int i = 0; i < origArray.length; i++) {
            helper[i] = origArray[i];
        }

        int i = low;
        int j = mid + 1;
        int k = low;

        while (i <= mid && j <= high) {

            if (helper[i] < helper[j]) {
                origArray[k] = helper[i];
                i++;
            } else {
                origArray[k] = helper[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            origArray[k] = helper[i];
            i++;
            k++;
        }
    }
}


class QuickSort implements Sort {

    @Override
    public Integer[] sort(Integer[] allSorts) {
        // check for empty or null array
        if (allSorts == null || allSorts.length == 0) {
            return allSorts;
        }
        sort(allSorts, 0, allSorts.length - 1);
        return allSorts;
    }

    public void sort(Integer[] actualArray, int low, int high) {
        int i = low;
        int j = high;
        int pivot = actualArray[(high + low) / 2];

        while (i <= j) {

            if (actualArray[i] < pivot) {
                i++;
            }
            if (actualArray[j] > pivot) {
                j--;
            }

            if (i <= j) {
                exchange(actualArray, i, j);
                i++;
                j--;
            }
        }

        if (low < j)
            sort(actualArray, low, j);
        if (i < high)
            sort(actualArray, i, high);

    }

    public void exchange(Integer[] actualArray, Integer i, Integer j) {
        Integer temp = actualArray[i];
        actualArray[i] = actualArray[j];
        actualArray[j] = temp;
    }
}