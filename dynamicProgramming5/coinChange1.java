package dynamicProgramming5;
public class coinChange1{
    public static void main(String[] args) {
        int coins[] = {1, 2, 5};
        int amount = 11;
        int dp[] = new int[amount + 1];
        dp[0] = 0; 
        for (int i = 1; i <= amount; i++) {
            dp[i] = Integer.MAX_VALUE; 
            for (int coin : coins) {
                if (i - coin >= 0 && dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        if (dp[amount] == Integer.MAX_VALUE) {
            System.out.println("It's not possible to make the amount with the given coins.");
        } else {
            System.out.println("Minimum number of coins required: " + dp[amount]);
        }
    }
}