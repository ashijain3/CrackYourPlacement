public class linkedlistcycle {
    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }

        return false;        
    }

    public static void main(String[] args) {
        // Create a linked list with a cycle
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node3; 

        System.out.println("Has cycle: " + hasCycle(head)); 

        ListNode head2 = new ListNode(1);
        ListNode node22 = new ListNode(2);
        ListNode node32 = new ListNode(3);
        ListNode node42 = new ListNode(4);
        ListNode node52 = new ListNode(5);

        head2.next = node22;
        node22.next = node32;
        node32.next = node42;
        node42.next = node52;

        System.out.println("Has cycle: " + hasCycle(head2)); 
    }
}

//time complexity -O(n)
//space complexity - O(1)