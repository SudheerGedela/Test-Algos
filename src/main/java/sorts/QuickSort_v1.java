package sorts;

import java.util.Arrays;
import java.util.Random;

/**
 * Project: algo-lambdas
 * Package: sorts
 * <p>
 * User: vthalapu
 * Date: 3/19/18
 * Time: 9:21 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class QuickSort_v1 {
    private Integer[] numbers;
    private Integer number;


    static public void main(String... args) {

        QuickSort_v1 quickSort = new QuickSort_v1();

        int maxArrLength = 20;
        int maxRandom = 20;
//
        Integer[] actArray = new Integer[maxArrLength];
        Random random = new Random();
        for (int i = 0; i < maxArrLength; i++) {
            actArray[i] = random.nextInt(maxRandom);
        }

//        Integer[] actArray = new Integer[]{4,10,8,7,6,5,3,12,14,2};


        long start = System.currentTimeMillis();
        System.out.println(start);
        quickSort.quickSort(actArray);
        System.out.println(Arrays.toString(actArray));
        long end = System.currentTimeMillis();
        System.out.println(end);
        System.out.println("Total seconds ->" + (end - start) / 1000);

    }


    public void quickSort(Integer[] values) {
        // check for empty or null array
        if (values == null || values.length == 0) {
            return;
        }
        this.numbers = values;
        number = values.length;
        quickSort(0, number - 1);
    }

    private void quickSort(int low, int high) {
        int i = low, j = high;
        // Get the pivot element from the middle of the list
        int pivot = numbers[low + (high - low) / 2];

        // Divide into two lists
        while (i <= j) {
            // If the current value from the left list is smaller than the pivot
            // element then get the next element from the left list
            while (numbers[i] < pivot) {
                i++;
            }
            // If the current value from the right list is larger than the pivot
            // element then get the next element from the right list
            while (numbers[j] > pivot) {
                j--;
            }

            // If we have found a value in the left list which is larger than
            // the pivot element and if we have found a value in the right list
            // which is smaller than the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j)
            quickSort(low, j);
        if (i < high)
            quickSort(i, high);
    }

    private void exchange(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
