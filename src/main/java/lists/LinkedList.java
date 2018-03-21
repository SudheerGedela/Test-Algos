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
    int data;

    Node(Integer data) {
        this.data = data;
    }
}


public class LinkedList {
    Node head;

    public void addNode(Integer data) {
        Node current;
        if (head == null) {
            head = new Node(data);
            return;
        }
        current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node(data);
    }

    public void prependNode(Integer data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void deleteNode(Integer data) {
        Node current;

        if (head == null) return;


        current = head;

        if (head.data == data) {
            head = head.next;
            return;
        }

        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

}


