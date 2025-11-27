package LinkedList1;

public class MiddleLinkedList {
     static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node findMiddle(Node head) {
        if (head == null) {
            return null; 
            }
            Node slow = head;
            Node fast = head;   
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
        
    public static void main(String[] args) {
        /* Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        Output: Middle node data: 3
        */
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);         
        Node middleNode = findMiddle(head);
        if (middleNode != null) {
            System.out.println("Middle node data: " + middleNode.data);
        } else {
            System.out.println("The linked list is empty.");      
        }
            
    }
}
