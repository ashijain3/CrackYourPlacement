import java.util.LinkedList;

public class Sortlinkedlist {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void sortList() {
        if (head == null) {
            return;
        }

        Node zeroD = new Node(0), oneD = new Node(0), twoD = new Node(0);
        Node zero = zeroD, one = oneD, two = twoD;

        Node current = head;
        while (current != null) {
            if (current.data == 0) {
                zero.next = current;
                zero = zero.next;
            } else if (current.data == 1) {
                one.next = current;
                one = one.next;
            } else {
                two.next = current;
                two = two.next;
            }
            current = current.next;
        }

        zero.next = (oneD.next != null) ? oneD.next : twoD.next;
        one.next = twoD.next;
        two.next = null;

        head = zeroD.next;
    }

    public void append(int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Sortlinkedlist list = new Sortlinkedlist();
        list.append(0);
        list.append(1);
        list.append(2);
        list.append(1);
        list.append(2);
        list.append(0);
        list.append(1);

        System.out.println("Original List: ");
        list.printList();

        list.sortList();

        System.out.println("Sorted List: ");
        list.printList();
    }
}

// time complexity -O(n)
// space complexity -O(1)