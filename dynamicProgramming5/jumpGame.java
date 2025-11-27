package dynamicProgramming5;

public class jumpGame {
    public static void main(String[] args) {
        int nums[] = {2, 3, 1, 1, 4};
        int n = nums.length;
        boolean dp[] = new boolean[n];
        dp[0] = true; 

        for (int i = 1; i < n; i++) {
            dp[i] = false; 
            for (int j = 0; j < i; j++) {
                if (dp[j] && j + nums[j] >= i) {
                    dp[i] = true; 
                    break; 
                }
            }
        }

        if (dp[n - 1]) {
            System.out.println("Can reach the last index.");
        } else {
            System.out.println("Cannot reach the last index.");
        }
    }
}
