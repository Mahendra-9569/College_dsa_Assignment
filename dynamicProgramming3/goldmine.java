package dynamicProgramming3;

public class goldmine {
    public static void main(String[] args) {
        int gold[][] = {{1, 3, 1, 5}, {2, 2, 4, 1}, {5, 0, 2, 3}, {0, 6, 1, 2}};
        int m = gold.length;
        int n = gold[0].length;
        int dp[][] = new int[m][n]; 
        for (int j = n - 1; j >= 0; j--) {
            for (int i = 0; i < m; i++) {
                if (j == n - 1) {
                    dp[i][j] = gold[i][j];
                } else if (i == 0) {
                    dp[i][j] = gold[i][j] + Math.max(dp[i][j + 1], dp[i + 1][j + 1]);
                } else if (i == m - 1) {
                    dp[i][j] = gold[i][j] + Math.max(dp[i][j + 1], dp[i - 1][j + 1]);
                } else {
                    dp[i][j] = gold[i][j] + Math.max(dp[i][j + 1],
                            Math.max(dp[i - 1][j + 1], dp[i + 1][j + 1]));
                }
            }
        }
    }
}
