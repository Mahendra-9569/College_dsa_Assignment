package LinkedList1;

public class Reverse {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node reverseLinkedList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next; 
            current.next = prev;
            prev = current;      
            current = next;
        }
        return prev; 
    }   
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);       
            current = current.next;
        }
    }
    public static void main(String[] args)      
    {
        /* Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        Output: Reversed linked list: 5 -> 4 -> 3 -> 2 -> 1
        */
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original List:");
        printList(head);

        Node reversedHead = reverseLinkedList(head);

        System.out.println("Reversed List:");
        printList(reversedHead);
    }       
}
