package sorts;

import java.util.Arrays;

/**
 * Project: algo-test
 * Package: sorts
 * <p>
 * User: vthalapu
 * Date: 3/13/18
 * Time: 1:30 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class BubbleSort {

    static public void main(String...args){
        Integer arr[] = bubbleSort(new Integer[]{8,4,3,49,0,-2,7,3,81,18,10,20});
        System.out.println(Arrays.toString(arr));
    }

    public static Integer[] bubbleSort(Integer toBeSortet[]){


        main:
        for(int i = toBeSortet.length-1 ;i >= 0 ; i-- ){
            sub:
            for(int j=0; j < i ; j++ ){
                if(toBeSortet[j] > toBeSortet[j+1] ){
                    toBeSortet[j] = toBeSortet[j] + toBeSortet[j+1];
                    toBeSortet[j+1] = toBeSortet[j]- toBeSortet[j+1];
                    toBeSortet[j] = toBeSortet[j]- toBeSortet[j+1];
                }
            }

        }
        return toBeSortet;
    }
}
