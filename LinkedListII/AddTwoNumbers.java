package LinkedListII;

public class AddTwoNumbers {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }   
    public static Node addTwoNumbers(Node head1, Node head2) {  
        Node dummyHead = new Node(0);
        Node p = head1, q = head2, current = dummyHead;
        int carry = 0;

        while (p != null || q != null) {
            int x = (p != null) ? p.data : 0;
            int y = (q != null) ? q.data : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            current.next = new Node(sum % 10);
            current = current.next;

            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }

        if (carry > 0) {
            current.next = new Node(carry);
        }

        return dummyHead.next;
    }
    public static void main(String[] args) {
        /* Create two sample linked lists:
        List 1: 2 -> 4 -> 3
        List 2: 5 -> 6 -> 4
        Output: Resultant linked list: 7 -> 0 -> 8
        */
        Node head1 = new Node(2);               
        head1.next = new Node(4);
        head1.next.next = new Node(3);          
        Node head2 = new Node(5);
        head2.next = new Node(6);
        head2.next.next = new Node(4);

        Node result = addTwoNumbers(head1, head2);

        Node current = result;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
