package Stack1;

public class stackUsingArray {

    static class Stack {
        int arr[];
        static int top;
        int capacity;
        int size;

        public Stack() {
            arr = new int[10];
            capacity = 10;
            size = 0;
            top = -1;
        }

        public  void push(int data) {
            if (size == capacity) {
                throw new StackOverflowError("Stack is full");
            } else {
                arr[++top] = data;
                size++;
            }
        }

        public int pop() {
            if (size == 0) {
                throw new StackOverflowError("Stack is empty");
            } else {
                size--;
                return arr[top--];
            }
        }

        public int peek() {
            if (size == 0) {
                throw new StackOverflowError("Stack is empty");
            } else {
                return arr[top];
            }
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == capacity;
        }

        public int size() {
            return size;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        try{
            System.out.println("Top element is: " + stack.peek());
        } catch (StackOverflowError e){
            System.out.println(e.getMessage());
        }

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack size is: " + stack.size());
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
