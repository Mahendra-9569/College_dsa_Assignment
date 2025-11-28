package Queue;
public class CircularQueue {
    static class Queue{
        int arr[];
        int front;
        int rear;
        int capacity;
        int size;
        public Queue(){
            arr = new int[10];
            capacity = 10;
            size = 0;
            front = 0;
            rear = -1;
        }

        public void offer(int data){
            if(size == capacity){
                throw new StackOverflowError("Queue is full");
            }else{
                rear = (rear + 1) % capacity;
                arr[rear] = data;
                size++;
            }
        }

        public int poll(){
            if(size == 0){
                throw new StackOverflowError("Queue is empty");
            }
            else{
                int data = arr[front];
                front = (front + 1) % capacity;
                size--;
                return data;
            }
        }

        public int peek(){
            if(size == 0){
                throw new StackOverflowError("Queue is empty");
            }else{
                return arr[front];
            }
        }

        public boolean isEmpty(){
            return size == 0;
        }

        public boolean isFull(){
            return size == capacity;
        }

        public int size(){
            return size;
        }
    }
    public static void main(String[] args) { 
        // Queue q = new Queue();
        // q.offer(10);
        // q.offer(20);
        // q.offer(30);
        // System.out.println("Front element is: " + q.peek());
        // System.out.println("Queue size is: " + q.size());
        // System.out.println("Popped element is: " + q.poll());
        // System.out.println("Is queue empty? " + q.isEmpty());
        int  ch1 = '-';
        int  ch2 = '+';
        System.out.println("Character comparison: " + (ch1 > ch2));
  }
}
