package Queue;
public class CircularQueue {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front, rear;
    int size;

    public CircularQueue() {
        this.front = this.rear = null;
        this.size = 0;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (this.rear == null) {
            this.front = this.rear = newNode;
            this.rear.next = this.front; 
            size++;
            return;
        }
        this.rear.next = newNode;
        this.rear = newNode;
        this.rear.next = this.front; 
        size++;
    }

    public int dequeue() {
        if (this.front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        int data = this.front.data;
        if (this.front == this.rear) {
            this.front = this.rear = null;
        } else {
            this.front = this.front.next;
            this.rear.next = this.front; 
        }
        size--;
        return data;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Current size: " + queue.getSize());
}
}
