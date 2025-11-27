package dynamicProgramming5;

public class coinChnagfe2 {
    public static void main(String[] args) {
        int coins[] = {1, 2, 5};
        int amount = 11;
        int n = coins.length;
        int dp[][] = new int[n + 1][amount + 1];

        for (int j = 0; j <= amount; j++) {
            dp[0][j] = Integer.MAX_VALUE - 1; 
        }
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0; 
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= amount; j++) {
                if (coins[i - 1] <= j) {
                    dp[i][j] = Math.min(dp[i - 1][j], 1 + dp[i][j - coins[i - 1]]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        int result = dp[n][amount];
        if (result == Integer.MAX_VALUE - 1) {
            System.out.println(-1); 
        } else {
            System.out.println(result); 
        }
    }
}
