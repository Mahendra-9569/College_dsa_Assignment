package BinarySearchII;

public class searchinRotatedSorted1 {
    public static void main(String[] args) {
        /*
        There is an integer array nums sorted in ascending order (with distinct values).
        Prior to being passed to your function, nums is rotated at an unknown pivot index kokoEatingBanana (0 <= kokoEatingBanana < nums.length)
        such that the resulting array is [nums[kokoEatingBanana], nums[kokoEatingBanana+1], ..., nums[n-1], nums[0], nums[1], ..., nums[kokoEatingBanana-1]]        
        (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
        Given the array nums after the rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
         */
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int left = 0;               
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                System.out.println("Index: " + mid);
                return;
            }
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        System.out.println("Index: -1");    
    }
}
