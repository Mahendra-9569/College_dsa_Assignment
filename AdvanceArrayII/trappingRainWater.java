package AdvanceArrayII;

public class trappingRainWater {
    public static int trap(int[] height) {
        int n = height.length;
        if (n == 0) return 0;

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int totalWater = 0;
        for (int i = 0; i < n; i++) {
            totalWater += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return totalWater;
    }

    public static void main(String[] args) {
        /*
        Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
         */
        
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int result = trap(height);
        System.out.println("Trapped Water: " + result);
    }
}
