package ArrayIII;

public class majority {
    public static void main(String args[]){
        //Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
        //You may assume that the majority element always exists in the array.
        //Example 1:
        //Input: nums = [3,2,3]
        //Output: 3
        //Example 2:
        //Input: nums = [2,2,1,1,1,2,2]
        //Output: 2

        
        int arr[] = {3,2,3};
        int count = 0;
        int candidate = -1;

        for(int num : arr){
            if(count == 0){
                candidate = num;
            }
            if(num == candidate){
                count++;
            } else {
                count--;
            }
        }
        System.out.println("Majority Element is: "+candidate);
    }
}
