package AdvanceArray1;

public class SetColors {
    public static void setColors(int[] arr) {
        int n = arr.length;
        int low = 0, mid = 0, high = n - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        /*
        Given an array with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent,
        with the colors in the order red, white, and blue.
        We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
         */
        
        int[] arr = {2, 0, 2, 1, 1, 0};
        setColors(arr);
        System.out.print("Sorted Colors: ");
        for (int color : arr) {
            System.out.print(color + " ");
        }
    }
}
