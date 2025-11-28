package BinaryTree1;

public class upperBound {
    public static int upperBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        return left;
    }

    public static void main(String[] args) {
        /*
        Given a sorted array arr and a target value target, find the index of the first element in arr that is greater than target.
        If all elements in arr are less than or equal to target, return arr.length.
         */
        
        int[] arr = {1, 2, 4, 4, 5, 6};
        int target = 4;
        int result = upperBound(arr, target);
        System.out.println("Upper Bound Index: " + result);
    }
}
