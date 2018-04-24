package practise;

import helper.SortUtils;

/**
 * Project: algo-lambdas
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


    static public void main(String... args) throws CloneNotSupportedException {

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

        //LinkedList
        System.out.println("**************************************************");
        System.out.println("Linked List");
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        LinkedList.printlInkedList(linkedList);

        linkedList.prependNode(45);
        LinkedList.printlInkedList(linkedList);

        linkedList.deleteNode(45);
        LinkedList.printlInkedList(linkedList);

        linkedList.append(45);
        LinkedList.printlInkedList(linkedList);

        linkedList.deleteNode(2);
        LinkedList.printlInkedList(linkedList);



    }

}

class BubbleSort implements Sort {


    @Override
    public Integer[] sort(Integer[] allSorts) {
        int i;
        int j;
        int temp;

        for (i = allSorts.length - 1; i >= 0; i--) {
            for (j = 0; j < i; j++) {
                if (allSorts[j] > allSorts[j + 1]) {
                    temp = allSorts[j];
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
        Integer[] helper = new Integer[allSorts.length];
        sort(allSorts, helper, 0, allSorts.length - 1);
        return allSorts;
    }


    public void sort(Integer[] allSorts, Integer[] helper, Integer low, Integer high) {
        int mid;
        if (low < high) {
            mid = (low + high) / 2;
            sort(allSorts, helper, low, mid);
            sort(allSorts, helper, mid + 1, high);
            mergeHalves(allSorts, helper, low, mid, high);
        }

    }

    public void mergeHalves(Integer[] allSorts, Integer[] helper, Integer low, Integer mid, Integer high) {
        for (Integer i = 0; i < allSorts.length; i++) {
            helper[i] = allSorts[i];
        }

        Integer i = low;
        Integer j = mid + 1;
        Integer k = low;

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
            k++;
            i++;
        }

    }
}

class QuickSort implements Sort {


    @Override
    public Integer[] sort(Integer[] allSorts) {
        sort(allSorts, 0, allSorts.length - 1);
        return allSorts;
    }


    public void sort(Integer[] allSorts, Integer low, Integer high) {
        Integer i = low;
        Integer j = high;

        Integer mid = allSorts[(low + high) / 2];

        while (i <= j) {

            while (allSorts[i] < mid) {
                i++;
            }

            while (allSorts[j] > mid) {
                j--;
            }

            if (i <= j) {
                exchange(allSorts, i, j);
                i++;
                j--;
            }

        }

        if (low < j) {
            sort(allSorts, low, j);
        }
        if (i < high) {
            sort(allSorts, i, high);
        }

    }

    public void exchange(Integer[] allSorts, Integer i, Integer j) {
        Integer temp = allSorts[i];
        allSorts[i] = allSorts[j];
        allSorts[j] = temp;
    }
}


class Node {
    Node next;
    Integer data;

    Node(Integer data) {
        this.data = data;
    }
}

class LinkedList {
    Node head;

    public static void printlInkedList(LinkedList linkedListPrint) throws CloneNotSupportedException {
        LinkedList linkedList = new LinkedList();
        linkedList.head = linkedListPrint.head;
        while (linkedList.head != null) {
            System.out.print(linkedList.head.data + "->");
            linkedList.head = linkedList.head.next;
        }
        System.out.println();
    }

    public void append(Integer data) {
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

    public void prependNode(Integer data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
    }

    public void deleteNode(Integer data) {
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


