package lists;

/**
 * Project: algo-test
 * Package: lists
 * <p>
 * User: vthalapu
 * Date: 3/20/18
 * Time: 9:19 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
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

    static public void main(String... args) throws CloneNotSupportedException {
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

