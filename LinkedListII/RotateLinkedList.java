package LinkedListII;

public class RotateLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node rotateLinkedList(Node head, int k) {
        if (head == null || k <= 0) {
            return head;
        }

        Node current = head;
        int length = 1; 
        while (current.next != null) {
            current = current.next;
            length++;
        }

        current.next = head; 

        k = k % length; 
        int stepsToNewHead = length - k;
        Node newTail = current; 
        while (stepsToNewHead-- > 0) {
            newTail = newTail.next;
        }

        Node newHead = newTail.next;
        newTail.next = null; 

        return newHead;
    }   
    public static void main(String[] args) {
        /* Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
           Rotate the list by k = 2
           Output: 4 -> 5 -> 1 -> 2 -> 3
        */
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int k = 2;
        Node rotatedHead = rotateLinkedList(head, k);

        Node current = rotatedHead;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
