package ArrayIII;

public class KadnesAlgo {
    public static void main(String args[]){
        //Given an integer array nums, find the subarray with the largest sum, and return its sum.
        //Example 1:
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int currSum = arr[0];
        int currMax = arr[0];

        for(int i=0;i<arr.length;i++){
           currSum = Math.max(arr[i], currSum + arr[i]);
           currMax = Math.max(currMax, currSum); 
        }
        System.out.println("Maximum Subarray Sum is: "+currMax);
    }
}
