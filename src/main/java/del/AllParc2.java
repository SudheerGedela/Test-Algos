package del;

import helper.SortUtils;
import practise.Sort;

/**
 * Project: Test-Algos
 * Package: practise.del
 * <p>
 * User: vthalapu
 * Date: 4/1/18
 * Time: 2:16 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
class AllParc2 {
    static public void main(String... args) throws CloneNotSupportedException {

//        AllParc allParc = new AllParc();

        Integer[] actualArray;

        //Bubble
        System.out.println("**************************************************");
        System.out.println("Bubble Sort");
        actualArray = SortUtils.getRandomUnSortedArray(100, 100);
        SortUtils.sortAndLogTime(new BubbleSort(), actualArray);

//        //Merge
//        System.out.println("**************************************************");
//        System.out.println("Merge Sort");
//        actualArray = SortUtils.getRandomUnSortedArray(100, 100);
//        SortUtils.sortAndLogTime(new MergeSort(), actualArray);
//
//
//        //Quick
//        System.out.println("**************************************************");
//        System.out.println("Quick Sort");
//        actualArray = SortUtils.getRandomUnSortedArray(100, 100);
//        SortUtils.sortAndLogTime(new QuickSort(), actualArray);

//        //LinkedList
//        System.out.println("**************************************************");
//        System.out.println("Linked List");
//        LinkedList linkedList = new LinkedList();
//        linkedList.append(1);
//        linkedList.append(1);
//        linkedList.append(2);
//        linkedList.append(3);
//        LinkedList.printlInkedList(linkedList);
//
//        linkedList.prependNode(45);
//        LinkedList.printlInkedList(linkedList);
//
//        linkedList.deleteNode(45);
//        LinkedList.printlInkedList(linkedList);
//
//        linkedList.append(45);
//        LinkedList.printlInkedList(linkedList);
//
//        linkedList.deleteNode(2);
//        LinkedList.printlInkedList(linkedList);


    }
}

class BubbleSort implements Sort{

    @Override
    public Integer[] sort(Integer[] allSorts) {

        for(int i = allSorts.length-1 ; i >= 0; i-- ){
            for(int j =0 ; j < i ; j++){
                if(allSorts[j] > allSorts[j+1]){
                    int temp = allSorts[j];
                    allSorts[j] = allSorts[j+1];
                    allSorts[j+1] = temp;
                }
            }
        }


        return allSorts;
    }
}

//class MergeSort implements  Sort {
//
//    @Override
//    public Integer[] sort(Integer[] allSorts) {
//    }
//
//    public Integer[] sort(Integer[] allSorts) {
//
//    }
//
//}