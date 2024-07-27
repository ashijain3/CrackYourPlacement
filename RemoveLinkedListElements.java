public class RemoveLinkedListElements {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static class Solution {
        public ListNode removeElements(ListNode head, int val) {
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode current = dummy;

            while (current.next != null) {
                if (current.next.val == val) {
                    current.next = current.next.next; 
                } else {
                    current = current.next; 
                }
            }

            return dummy.next; 
        }

        public void printList(ListNode head) {
            ListNode temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public ListNode createList(int[] arr) {
            if (arr.length == 0) {
                return null;
            }
            ListNode head = new ListNode(arr[0]);
            ListNode current = head;
            for (int i = 1; i < arr.length; i++) {
                current.next = new ListNode(arr[i]);
                current = current.next;
            }
            return head;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

       int[] arr = {1, 2, 6, 3, 4, 5, 6};
        ListNode head = solution.createList(arr);

        System.out.println("Original List: ");
        solution.printList(head);

        head = solution.removeElements(head, 6);

        System.out.println("Updated List: ");
        solution.printList(head);
    }
}
