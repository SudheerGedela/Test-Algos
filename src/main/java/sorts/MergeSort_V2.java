//package sorts;
//
//import java.util.Arrays;
//
///**
// * Project: algo-lambdas
// * Package: sorts
// * <p>
// * User: vthalapu
// * Date: 3/18/18
// * Time: 12:03 PM
// * <p>
// * Created with IntelliJ IDEA
// * To change this template use File | Settings | File Templates.
// */
//public class MergeSort_V2 {
//    public static Integer[]actArray;
//    public static Integer[]copyTempArray;
//
//
//
//    static public void main(String... args) {
//
////        actArray = new Integer[]{8,4,3,49,0,-2,7,3,81,18,10, 20,8,4,3,49,0
////                ,-2,7,3,81,18,10,20,8,4,3,49,0,-2,7,3,81,18,10,20,8,4,3,49,0,-2,7,3,81,18,10,20};
//
//        actArray = new Integer[]{8,4,3,49,0};
//        mergeSort(actArray);
//        System.out.println(Arrays.toString(actArray));
//
//    }
//
//    public static void mergeSort(Integer[]actArray){
//        copyTempArray = new Integer[actArray.length];
//        mergeSort( 0, actArray.length -1);
//    }
//
//    public static void mergeSort( Integer leftStartIndex, Integer rightEndIndex){
//        if(leftStartIndex <  rightEndIndex){
//            Integer middleIndex = (leftStartIndex + rightEndIndex) / 2 ;
//            // Get the index of the element which is in the middle
////            int middleIndex = leftStartIndex + (rightEndIndex - leftStartIndex) / 2;
//
//            mergeSort(leftStartIndex, middleIndex );
//            mergeSort(middleIndex + 1, rightEndIndex );
//            mergeHalves(leftStartIndex, middleIndex, rightEndIndex );
//        }
//
//    }
//
//    public static void mergeHalves(Integer leftStartIndex,Integer middleIndex, Integer rightEndIndex){
//
//
//        // Copy both parts into the copyTempArray array
//        for (int i = leftStartIndex; i <= rightEndIndex; i++) {
//            copyTempArray[i] = actArray[i];
//        }
//
//        int i = leftStartIndex;
//        int j = middleIndex + 1;
//        int k = leftStartIndex;
//        // Copy the smallest values from either the left or the right side back
//        // to the original array
//        while (i <= middleIndex && j <= rightEndIndex) {
//            if (copyTempArray[i] <= copyTempArray[j]) {
//                actArray[k] = copyTempArray[i];
//                i++;
//            } else {
//                actArray[k] = copyTempArray[j];
//                j++;
//            }
//            k++;
//        }
//        // Copy the rest of the left side of the array into the target array
//        while (i <= middleIndex) {
//            actArray[k] = copyTempArray[i];
//            k++;
//            i++;
//        }
//        // Since we are sorting in-place any leftover elements from the right side
//        // are already at the right position.
//
//    }
//}
