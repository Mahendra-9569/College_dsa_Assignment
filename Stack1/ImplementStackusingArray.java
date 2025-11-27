package Stack1;

public class ImplementStackusingArray {
    static class Stack {
        private int maxSize;
        private int[] stackArray;
        private int top;

        public Stack(int size) {
            this.maxSize = size;
            this.stackArray = new int[maxSize];
            this.top = -1;
        }

        public void push(int value) {
            if (top == maxSize - 1) {
                System.out.println("Stack Overflow");
            } else {
                stackArray[++top] = value;
            }
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow");
                return -1; 
            } else {
                return stackArray[top--];
            }
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1; 
            } else {
                return stackArray[top];
            }
        }

        public boolean isEmpty() {
            return (top == -1);
        }

        public int size() {
            return top + 1;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: " + stack.peek()); 

        System.out.println("Stack size is: " + stack.size()); 

        System.out.println("Popped element is: " + stack.pop()); 

        System.out.println("Is stack empty? " + stack.isEmpty()); 
    }
}
