package DynamicProgramming4;

public class targetSum {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3};
        int target = 1;
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        if ((sum + target) % 2 != 0) {
            System.out.println(0);
            return;
        }
        int s1 = (sum + target) / 2;
        int dp[][] = new int[n + 1][s1 + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= s1; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        System.out.println(dp[n][s1]);
    }
}
