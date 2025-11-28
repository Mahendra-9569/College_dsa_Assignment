package BinarySearchII;

public class searchinSortedRotated2 {
    public static boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return true;
            }

            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
                left++;
                right--;
            } else if (nums[left] <= nums[mid]) { 
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

        return false;
    }

    public static void main(String[] args) {
        /*
        Given an integer array nums sorted in non-decreasing order, and an integer target, 
        write a function to determine if target is in nums. The array may contain duplicates.
         */
        
        int[] nums = {2,5,6,0,0,1,2};
        int target = 0;
        boolean result = search(nums, target);
        System.out.println("Target Found: " + result);
    }
}
