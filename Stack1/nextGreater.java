package Stack1;
import java.util.*;
public class nextGreater {
    public static void main(String args[]){
       /*
       The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.

      You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.

      For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.

     Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.

     */
    // using Stack

            int[] nums1 = {4,1,2};
            int[] nums2 = {1,3,4,2};
            int[] result = new int[nums1.length];
            Stack<Integer> stack = new Stack<>();
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = nums2.length - 1; i >= 0; i--) {
                while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    map.put(nums2[i], -1);
                } else {
                    map.put(nums2[i], stack.peek());
                }
                stack.push(nums2[i]);
            }
            for (int i = 0; i < nums1.length; i++) {
                result[i] = map.get(nums1[i]);
            }
            System.out.println(Arrays.toString(result));
      
    }
}
