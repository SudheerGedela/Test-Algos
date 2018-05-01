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
    static public void main(String... args) {

//        AllParc allParc = new AllParc();

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

        //LinkedList
        System.out.println("**************************************************");
        System.out.println("Linked List");
        LinkedList linkedList = new LinkedList();
        linkedList.addNode(1);
        linkedList.addNode(1);
        linkedList.addNode(2);
        linkedList.addNode(3);
        LinkedList.printLinkedListData(linkedList);

        linkedList.prependNode(45);
        LinkedList.printLinkedListData(linkedList);

        linkedList.deleteNode(45);
        LinkedList.printLinkedListData(linkedList);

        linkedList.addNode(45);
        LinkedList.printLinkedListData(linkedList);

        linkedList.deleteNode(2);
        LinkedList.printLinkedListData(linkedList);


        //Factorial
        System.out.println("**************************************************");
        System.out.println("Factorial");
        Factorial factorial = new Factorial();
        System.out.println(factorial.getFactorial(6));

        //Fib
        Fibanacii fibanacii = new Fibanacii();
        System.out.println(fibanacii.fib(5));


    }
}

class BubbleSort implements Sort {

    @Override
    public Integer[] sort(Integer[] allSorts) {

        for (int i = allSorts.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (allSorts[j] > allSorts[j + 1]) {
                    int temp = allSorts[j];
                    allSorts[j] = allSorts[j + 1];
                    allSorts[j + 1] = temp;
                }
            }
        }

        return allSorts;
    }
}


class MergeSort implements Sort {

    @Override
    public Integer[] sort(Integer[] allSorts) {
        sort(allSorts, new Integer[allSorts.length], 0, allSorts.length - 1);
        return allSorts;
    }

    public void sort(Integer[] allSorts, Integer[] helper, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            sort(allSorts, helper, low, mid);
            sort(allSorts, helper, mid + 1, high);
            mergeHalves(allSorts, helper, low, mid, high);
        }
    }

    public void mergeHalves(Integer[] allSorts, Integer[] helper, int low, int mid, int high) {
        for (int i = 0; i < allSorts.length; i++) {
            helper[i] = allSorts[i];
        }

        int i = low;
        int j = mid + 1;
        int k = low;


        while (i <= mid && j <= high) {
            if (helper[i] < helper[j]) {
                allSorts[k] = helper[i];
                i++;
            } else {
                allSorts[k] = helper[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            allSorts[k] = helper[i];
            i++;
            k++;
        }

    }

}


class QuickSort implements Sort {

    @Override
    public Integer[] sort(Integer[] allSorts) {
        sort(allSorts, 0, allSorts.length - 1);
        return allSorts;
    }

    public void sort(Integer[] allSorts, int low, int high) {
        int i = low;
        int j = high;
        int pivot = allSorts[(low + high) / 2];


        while (i <= j) {


            while (allSorts[i] < pivot) {
                i++;
            }

            while (allSorts[j] > pivot) {
                j--;
            }

            if (i <= j) {
                exchange(allSorts, i, j);
                i++;
                j--;
            }

        }

        if (low < j)
            sort(allSorts, low, j);

        if (i < high)
            sort(allSorts, i, high);


    }

    private void exchange(Integer[] allSorts, int i, int j) {
        int temp = allSorts[i];
        allSorts[i] = allSorts[j];
        allSorts[j] = temp;
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


    static public void printLinkedListData(LinkedList linkedListTemp) {
        LinkedList linkedList = new LinkedList();
        linkedList.head = linkedListTemp.head;
        while (linkedList.head != null) {
            System.out.print(linkedList.head.data + "->");
            linkedList.head = linkedList.head.next;
        }
        System.out.println();
    }


    //try
    public void addNode(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void prependNode(int data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
    }

    public void deleteNode(int data) {

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;

        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
            }
            current = current.next;
        }


    }

}

class Factorial {
    public int getFactorial(int i) {
        if (i == 0 || i == 1)
            return 1;
        else
            return i * getFactorial(i - 1);
    }
}

class Fibanacii {

    public int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }


}