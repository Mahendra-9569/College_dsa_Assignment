package LinkedList1;

public class DeleteNode {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node deleteNode(Node head, int key) {
        if (head == null) {
            return null;
        }

        if (head.data == key) {
            return head.next;
        }

        Node current = head;
        while (current.next != null && current.next.data != key) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }

        return head;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        /*
         Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
         Delete node with key 3
         Output: 1 -> 2 -> 4 -> 5
        
        */
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original List:");
        printList(head);

        int keyToDelete = 3;
        head = deleteNode(head, keyToDelete);

        System.out.println("List after deleting node with key " + keyToDelete + ":");
        printList(head);
    }
}
