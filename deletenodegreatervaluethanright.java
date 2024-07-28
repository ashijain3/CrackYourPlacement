public class deletenodegreatervaluethanright {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static ListNode removeNodes(ListNode head) {
        head = reverseList(head);

        int max = head.val;
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.next.val < max) {
                current.next = current.next.next;
            } else {
                max = current.next.val;
                current = current.next;
            }
        }

        head = reverseList(head);

        return head;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(12);
        head.next = new ListNode(15);
        head.next.next = new ListNode(10);
        head.next.next.next = new ListNode(11);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next.next = new ListNode(3);

        System.out.println("Original List:");
        printList(head);

        head = removeNodes(head);

        System.out.println("Modified List:");
        printList(head);
    }
}

// time complexity -0(n)
// space complexity -0(1)
