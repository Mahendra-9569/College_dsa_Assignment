package Recursion1;

public class sumArray {
    public static void main(String args[]){
        /*
        You are given an integer array arr[]. The task is to find the sum of it.
         */

        
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int result = sum(arr, n);
        System.out.println("Sum of array elements: " + result);
    }

    public static int sum(int arr[], int n){
        if(n <= 0){
            return 0;
        }
        return arr[n-1] + sum(arr, n-1);
    }
}
