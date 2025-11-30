package PriorityQueueII;

public class kthLargestElement{
    public static int findKthLargest(int[] nums, int k) {
        java.util.PriorityQueue<Integer> minHeap = new java.util.PriorityQueue<>();

        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return minHeap.peek();
    }
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        int result = findKthLargest(nums, k);
        System.out.println(k + "th largest element is: " + result);
    }
}
