package BinarySearchII;

public class AggressiveCows {
    public static boolean canPlaceCows(int[] stalls, int cows, int minDist) {
        int count = 1; 
        int lastPosition = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPosition >= minDist) {
                count++;
                lastPosition = stalls[i];
                if (count == cows) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int aggressiveCows(int[] stalls, int cows) {
        int left = 1; 
        int right = stalls[stalls.length - 1] - stalls[0]; 
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canPlaceCows(stalls, cows, mid)) {
                result = mid; 
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }
        return result;
    }

    public static void main(String[] args) {
        /*
        Given an array of stall positions and a number of cows, place the cows in the stalls such that the minimum distance between any two cows is maximized.
         */
        
        int[] stalls = {1, 2, 8, 4, 9};
        int cows = 3;
        java.util.Arrays.sort(stalls); 
        int maxMinDist = aggressiveCows(stalls, cows);
        System.out.println("Maximum Minimum Distance: " + maxMinDist);
    }
}
