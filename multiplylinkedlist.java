class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class multiplylinkedlist {
    private static final int MOD = 1000000007;

    public static long multiplyTwoLists(Node l1, Node l2) {
        long num1 = 0;
        long num2 = 0;

        while (l1 != null) {
            num1 = (num1 * 10 + l1.data) % MOD;
            l1 = l1.next;
        }

        while (l2 != null) {
            num2 = (num2 * 10 + l2.data) % MOD;
            l2 = l2.next;
        }

        return (num1 * num2) % MOD;
    }

    public static void main(String[] args) {

        Node l1 = new Node(3);
        l1.next = new Node(4);
        l1.next.next = new Node(2);

        Node l2 = new Node(4);
        l2.next = new Node(6);

        long result = multiplyTwoLists(l1, l2);
        System.out.println("Result: " + result); 
    }
    
}
// time complexity -O(n)
// space complexity - O(1)