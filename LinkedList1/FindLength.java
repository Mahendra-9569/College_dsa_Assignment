package LinkedList1;

public class FindLength {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }   
    public static int findLength(Node head) {
        int length = 0;
        Node current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }
    public static void main(String[] args) {
        /* Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5 
        Output: Length of the linked list: 5
        */
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);   
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int length = findLength(head);
        System.out.println("Length of the linked list: " + length);
    }
}
