package PriorityQueue1;

public class HeapImplementation {
    public static class Heap {
        private int[] elements;
        private int size;

        public Heap() {
            elements = new int[10];
            size = 0;
        }   
        public void insert(int value) {
            if (size == elements.length) {
                resize();
            }
            elements[size] = value;
            size++;
            heapifyUp(size - 1);
        }
        private void resize() {
            int[] newElements = new int[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }

        private void heapifyUp(int index) {
            while (index > 0) {
                int parentIndex = (index - 1) / 2;
                if (elements[index] > elements[parentIndex]) {
                    int temp = elements[index];
                    elements[index] = elements[parentIndex];
                    elements[parentIndex] = temp;
                    index = parentIndex;
                } else {
                    break;
                }
            }
        }

    }
    public static void main(String[] args) {
        System.out.println("Heap Implementation Placeholder");
        Heap heap = new Heap();
        heap.insert(5);
        heap.insert(3); 
        heap.insert(8);
        System.out.println("Inserted elements into the heap.");
    }
}
