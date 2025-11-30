package PriorityQueue1;
import java.util.*;
public class implementPriorityQueue {
    public static class PriorityQueue {
        private List<Integer> elements;

        public PriorityQueue() {
            elements = new ArrayList<>();
        }

        public void enqueue(int value) {
            elements.add(value);
            Collections.sort(elements);
        }

        public int dequeue() {
            if (isEmpty()) {
                throw new IllegalStateException("Priority Queue is empty");
            }
            return elements.remove(0);
        }

        public boolean isEmpty() {
            return elements.isEmpty();
        }

        public int peek() {
            if (isEmpty()) {
                throw new IllegalStateException("Priority Queue is empty");
            }
            return elements.get(0);
        }
    }
    public static void main(String[] args) {
        System.out.println("Priority Queue implementation placeholder.");
        PriorityQueue pq = new PriorityQueue();
        pq.enqueue(5);
        pq.enqueue(1);
        pq.enqueue(3);
        System.out.println("Peek: " + pq.peek()); 
        System.out.println("Dequeue: " + pq.dequeue()); 
        System.out.println("Dequeue: " + pq.dequeue()); 
        System.out.println("Dequeue: " + pq.dequeue()); 
    }
}
