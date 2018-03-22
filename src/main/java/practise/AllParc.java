package practise;

import helper.SortUtils;

/**
 * Project: algo-test
 * Package: practise
 * <p>
 * User: vthalapu
 * Date: 3/21/18
 * Time: 8:23 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class AllParc {


    static public void main(String... args) {

        AllParc allParc = new AllParc();

        Integer[] actualArray;

        //Bubble
        System.out.println("**************************************************");
        System.out.println("Bubble Sort");
        actualArray = SortUtils.getRandomUnSortedArray(100, 100);
        SortUtils.sortAndLogTime(new BubbleSort(), actualArray);

        //Merge
        System.out.println("**************************************************");
        System.out.println("Merge Sort");
        actualArray = SortUtils.getRandomUnSortedArray(100, 100);
        SortUtils.sortAndLogTime(new MergeSort(), actualArray);


        //Quick
        System.out.println("**************************************************");
        System.out.println("Quick Sort");
        actualArray = SortUtils.getRandomUnSortedArray(100, 100);
        SortUtils.sortAndLogTime(new QuickSort(), actualArray);


    }

}

class BubbleSort implements Sort {

    @Override
    public Integer[] sort(Integer[] actualArray) {

        for (int i = actualArray.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (actualArray[j] > actualArray[j + 1]) {
                    int temp = actualArray[j];
                    actualArray[j] = actualArray[j + 1];
                    actualArray[j + 1] = temp;

                }
            }
        }


        return actualArray;
    }
}

class MergeSort implements Sort {

    @Override
    public Integer[] sort(Integer[] actualArray) {
        Integer[] helper = new Integer[actualArray.length];
        sort(actualArray, helper, 0, actualArray.length - 1);
        return actualArray;
    }


    public void sort(Integer[] actualArray, Integer[] helper, int low, int high) {

        if (low < high) {
            int mid = (low + high) / 2;
            sort(actualArray, helper, low, mid);
            sort(actualArray, helper, mid + 1, high);
            mergeHalves(actualArray, helper, low, mid, high);

        }
    }

    public void mergeHalves(Integer[] actualArray, Integer[] helper, int low, int mid, int high) {

        for (int i = 0; i < actualArray.length; i++) {
            helper[i] = actualArray[i];
        }

        int i = low;
        int j = mid + 1;
        int k = low;

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

        while (i <= mid) {
            actualArray[k] = helper[i];
            k++;
            i++;
        }

    }

}

class QuickSort implements Sort {

    @Override
    public Integer[] sort(Integer[] actualArray) {
        sort(actualArray, 0, actualArray.length - 1);
        return actualArray;
    }

    public void sort(Integer[] actualArray, int low, int high) {
        int i = low;
        int j = high;

        int pivot = actualArray[(low + high) / 2];

        while (i <= j) {

            while (actualArray[i] < pivot) {
                i++;
            }

            while (actualArray[j] > pivot) {
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

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node head;


    public void addNode(int data) {
        Node current;
        if (head == null) {
            head = new Node(data);
        }
        current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node(data);

    }

    public void prependNode(int data) {
        Node newNode = new Node(data);
        newNode = head;
        head = newNode;
    }

    public void deleteNode(int data) {
        Node current;
        if (head.data == data) {
            head = head.next;
        }

        current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
            }
            current = current.next;
        }

    }


}


