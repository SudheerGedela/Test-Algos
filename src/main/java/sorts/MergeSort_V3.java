//package sorts;
//
//import java.util.Arrays;
//
///**
// * Project: algo-test
// * Package: sorts
// * <p>
// * User: vthalapu
// * Date: 3/18/18
// * Time: 1:07 PM
// * <p>
// * Created with IntelliJ IDEA
// * To change this template use File | Settings | File Templates.
// */
//
//public class MergeSort_V3 {
//    private Integer[] numbers;
//    private Integer[] helper;
//
//    private Integer number;
//
//    static public void main(String... args) {
//
////        actArray = new Integer[]{8,4,3,49,0,-2,7,3,81,18,10, 20,8,4,3,49,0
////                ,-2,7,3,81,18,10,20,8,4,3,49,0,-2,7,3,81,18,10,20,8,4,3,49,0,-2,7,3,81,18,10,20};
//
//        MergeSort_V3 mergeSort_v3 = new MergeSort_V3();
//
//        Integer[] actArray = new Integer[]{8, 4, 3, 49, 0};
//        mergeSort_v3.mergeSort(actArray);
//        System.out.println(Arrays.toString(actArray));
//
//    }
//
//    public void mergeSort(Integer[] values) {
//        this.numbers = values;
//        number = values.length;
//        this.helper = new Integer[number];
//        mergesort(0, number - 1);
//    }
//
//    private void mergesort(int low, int high) {
//        // check if low is smaller than high, if not then the array is sorted
//        if (low < high) {
//            // Get the index of the element which is in the middle
//            int middle = low + (high - low) / 2;
//            // Sort the left side of the array
//            mergesort(low, middle);
//            // Sort the right side of the array
//            mergesort(middle + 1, high);
//            // Combine them both
//            merge(low, middle, high);
//        }
//    }
//
//    private void merge(int low, int middle, int high) {
//
//        // Copy both parts into the helper array
//        for (int i = low; i <= high; i++) {
//            helper[i] = numbers[i];
//        }
//
//        int i = low;
//        int j = middle + 1;
//        int k = low;
//        // Copy the smallest values from either the left or the right side back
//        // to the original array
//        while (i <= middle && j <= high) {
//            if (helper[i] <= helper[j]) {
//                numbers[k] = helper[i];
//                i++;
//            } else {
//                numbers[k] = helper[j];
//                j++;
//            }
//            k++;
//        }
//        // Copy the rest of the left side of the array into the target array
//        while (i <= middle) {
//            numbers[k] = helper[i];
//            k++;
//            i++;
//        }
//        // Since we are sorting in-place any leftover elements from the right side
//        // are already at the right position.
//
//    }
//}
//
//
