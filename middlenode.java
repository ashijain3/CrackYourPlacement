import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class middlenode {
    public static ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode middle = middleNode(head);

        System.out.println("The value of the middle node is: " + middle.val);
    }
}

// time complexity-O(n)
// space complexity-O(1)