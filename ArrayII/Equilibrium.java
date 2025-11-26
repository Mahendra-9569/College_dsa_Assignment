package ArrayII;
import java.util.*;
public class Equilibrium {
    public static void main(String args[]){
        /*Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.

 
Example 1:Input: nums = [1,7,3,6,5,6]
Output: 3
Explanation:
The pivot index is 3.
Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
Right sum = nums[4] + nums[5] = 5 + 6 = 11  
 */
        int nums[] = { -7, 1, 5, 2, -4, 3, 0 };
        int n = nums.length;
        int  leftsum = 0;
         int rightsum = 0;
        for(int i  = 0; i<n; i++ ){
            if(i ==0){
                leftsum = 0;
            }
            else{
                leftsum  += nums[i-1];
            }
            
            for(int j = n-1; j>i; j--){
               rightsum += nums[j];
            }
            if(i == n-1 ){
                rightsum = 0;
            }
            if(leftsum == rightsum){
                System.out.println(i);
                return;
            }
            else{
                rightsum = 0;
            }
        }

        System.out.println(-1);
    }
}
