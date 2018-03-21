package practise;

/**
 * Project: algo-test
 * Package: practise
 * <p>
 * User: vthalapu
 * Date: 3/20/18
 * Time: 10:42 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */

class Node {
    Node next;
    Integer data;

    public Node(Integer data) {
        this.data = data;
    }

}


public class LinkedListTest {
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

    public void perpendNode(Integer data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }


    public void deleteNode(Integer data) {
        Node current;
        if (head.data == data) {
            head = head.next;
            return;
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
