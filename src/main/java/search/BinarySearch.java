package search;

import static sorts.BubbleSort.bubbleSort;

/**
 * Project: algo-lambdas
 * Package: search
 * <p>
 * User: vthalapu
 * Date: 3/13/18
 * Time: 1:43 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class BinarySearch {

    static public void main(String... args) {

        Integer arr[] = bubbleSort(new Integer[]{8,4,3,49,0,-2,7,3,81,18,10,20});
        System.out.println(binarySearch(arr, 18));
        System.out.println(binarySearch(arr, 8));
        System.out.println(binarySearch(arr, -2));
        System.out.println(binarySearch(arr, -3));

    }


    public static boolean binarySearch(Integer[] sortedArray, int elementToFind) {

        int lowIndex = 0;
        int highIndex = sortedArray.length - 1;

        int middleIndex;


        while ( highIndex > -1){
            middleIndex = (lowIndex + highIndex) / 2;

            if (elementToFind > sortedArray[middleIndex]) {
                lowIndex = middleIndex + 1;
            } else if (elementToFind < sortedArray[middleIndex]) {
                highIndex = middleIndex - 1;
            } else {
                return true;
            }
        }


        return false;
    }

}
