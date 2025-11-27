package Queue;

public class stackUsing {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        Node top;
        int size;

        Stack() {
            this.top = null;
            this.size = 0;
        }

        void push(int data) {
            Node newNode = new Node(data);
            newNode.next = this.top;
            this.top = newNode;
            size++;
        }

        int pop() {
            if (this.top == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            int data = this.top.data;
            this.top = this.top.next;
            size--;
            return data;
        }

        int peek() {
            if (this.top == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            return this.top.data;
        }

        int getSize() {
            return size;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: " + stack.peek());
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Stack size is: " + stack.getSize());
    }
}
