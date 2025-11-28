package BinaryTree1;

public class lowerBound {
    public static int lowerBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length; 

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid; 
            }
        }
        return left; 
    }

    public static void main(String[] args) {
        /*
        Given a sorted array of integers arr and a target value target, find the index of the first occurrence of target in arr.
        If target is not found in arr, return the index where it would be if it were inserted in order.
         */
        
        int[] arr = {1, 3, 5, 6};
        int target = 5;
        int result = lowerBound(arr, target);
        System.out.println("Lower Bound Index: " + result);
    }
}
