package LinkedList1;

public class MergeLinkedList{
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node mergeLinkedList(Node head1, Node head2){
        if(head1 == null) return head2;
        if(head2 == null) return head1;

        Node mergedHead = head1;
        Node current = mergedHead;
        while(current.next != null){
            current = current.next;     
        }
        current.next = head2;
        return mergedHead;
    }
    public static void main(String args[]){
         /* Merge two linked lists:
         List 1: 1 -> 2 -> 3
         List 2: 4 -> 5 -> 6
         Merged List: 1 -> 2 -> 3 -> 4 -> 5 -> 6
        */

        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);  
        Node head2 = new Node(4);
        head2.next = new Node(5);
        head2.next.next = new Node(6);  
       
        Node mergedHead = head1;;
        Node current = mergedHead;
        while(current.next != null){
            current = current.next;     
            }
        current.next = head2;
        current = mergedHead;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null"); 
    }
}
