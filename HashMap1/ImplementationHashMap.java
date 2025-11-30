package HashMap1;

public class ImplementationHashMap {
    static class HashMap<K, V> {
        class Node<K, V> {
            K key;
            V value;
            Node<K, V> next;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int capacity;
        private Node<K, V>[] buckets;
        private int size;
        private final double loadFactor = 0.75;
        @SuppressWarnings("unchecked")
        public HashMap() {
            capacity = 16;
            buckets = new Node[capacity];
            size = 0;
        }

        private int getBucketIndex(K key) {
            return Math.abs(key.hashCode()) % capacity;
        }

        public void put(K key, V value) {
            int index = getBucketIndex(key);
            Node<K, V> head = buckets[index];

            while (head != null) {
                if (head.key.equals(key)) {
                    head.value = value;
                    return;
                }
                head = head.next;
            }

            Node<K, V> newNode = new Node<>(key, value);
            newNode.next = buckets[index];
            buckets[index] = newNode;
            size++;

            if ((1.0 * size) / capacity >= loadFactor) {
                resize();
            }
        }

        @SuppressWarnings("unchecked")
        private void resize() {
            capacity *= 2;
            Node<K, V>[] oldBuckets = buckets;
            buckets = new Node[capacity];
            size = 0;
            for (Node<K, V> head : oldBuckets) {
                while (head != null) {
                    put(head.key, head.value);
                    head = head.next;
                }
            }
        }

        public V get(K key) {
            int index = getBucketIndex(key);
            Node<K, V> head = buckets[index];

            while (head != null) {
                if (head.key.equals(key)) {
                    return head.value;
                }
                head = head.next;
            }
            return null;
        }
        public V remove(K key) {    
            int index = getBucketIndex(key);
            Node<K, V> head = buckets[index];
            Node<K, V> prev = null;

            while (head != null) {
                if (head.key.equals(key)) {
                    if (prev != null) {
                        prev.next = head.next;
                    } else {
                        buckets[index] = head.next;
                    }
                    size--;
                    return head.value;
                }
                prev = head;
                head = head.next;
            }
            return null;
        }

    }
    public static void main(String[] args) {
        // Implementation code for HashMap can be added here
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("apple", 5);
        hashMap.put("banana", 3);   
        System.out.println("Value for 'apple': " + hashMap.get("apple"));
        hashMap.remove("apple");
        System.out.println("Value for 'apple' after removal: " + hashMap.get("apple"));

    }
}
