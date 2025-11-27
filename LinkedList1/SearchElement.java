package LinkedList1;

public class SearchElement {
        static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }   
    public static boolean searchElement(Node head, int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true; 
            }
            current = current.next;
        }
        return false; 
    }
    public static void main(String[] args) {
        /* Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        Search for element 3
        Output: Element 3 found in the linked list.
        */
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);      
        head.next.next.next.next = new Node(5);

        int keyToSearch = 3;
        boolean found = searchElement(head, keyToSearch);
        if (found) {
            System.out.println("Element " + keyToSearch + " found in the linked list.");
        } else {
            System.out.println("Element " + keyToSearch + " not found in the linked list.");
        }
    }   
}
