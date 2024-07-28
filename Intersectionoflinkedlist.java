class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Intersectionoflinkedlist {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) 
            return null;
        
        ListNode tempA = headA;
        ListNode tempB = headB;

        while (tempA != tempB) {
            tempA = (tempA == null) ? headB : tempA.next;
            tempB = (tempB == null) ? headA : tempB.next;
        }
        
        return tempA;
    }
    
    public static void main(String[] args) {
        // Create two linked lists
        // List A: 1 -> 2 -> 3 -> 4 -> 5
        // List B: 9 -> 4 -> 5
        // The intersection is at node with value 4

        ListNode intersect = new ListNode(4);
        intersect.next = new ListNode(5);
        
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = new ListNode(3);
        headA.next.next.next = intersect;
        
        ListNode headB = new ListNode(9);
        headB.next = intersect;
        
        ListNode intersectionNode = Intersectionoflinkedlist.getIntersectionNode(headA, headB);
        
        if (intersectionNode != null) {
            System.out.println("Intersection at node with value: " + intersectionNode.val);
        } else {
            System.out.println("No intersection.");
        }
    }
}

// time complexity - O(n)
// space complexity - O(1)
