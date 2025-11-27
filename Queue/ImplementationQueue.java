package Queue;

public class ImplementationQueue {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        Node front, rear;
        int size;

        Queue() {
            this.front = this.rear = null;
            this.size = 0;
        }

        void enqueue(int data) {
            Node newNode = new Node(data);
            if (this.rear == null) {
                this.front = this.rear = newNode;
                size++;
                return;
            }
            this.rear.next = newNode;
            this.rear = newNode;
            size++;
        }

        int dequeue() {
            if (this.front == null) {
                System.out.println("Queue is empty");
                return -1;
            }
            int data = this.front.data;
            this.front = this.front.next;
            if (this.front == null) {
                this.rear = null;
            }
            size--;
            return data;
        }

        int getSize() {
            return size;
        }
    }
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Current size: " + queue.getSize());

        queue.enqueue(40);
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Current size: " + queue.getSize());
    }
}
