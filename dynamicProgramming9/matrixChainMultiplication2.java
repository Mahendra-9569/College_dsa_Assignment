package dynamicProgramming9;

public class matrixChainMultiplication2 {
    public static void main(String[] args) {
        int matrix[] = {3, 4, 5, 6, 7};
        int n = matrix.length;
        int dp[][] = new int[n][n];
        
        for(int len = 2; len<n; len++){
            for(int col = 1; col <= n-len; col++){
                int i = col;
                int j = len + col -1;
                dp[i][j] = Integer.MIN_VALUE;
                for(int k = i; k<j; k++){
                    int left = dp[i][k];
                    int right = dp[k+1][j];
                    int currAns = matrix[i-1] + matrix[k] + matrix[j];

                    dp[i][j] = Math.max(currAns, dp[i][j]);
                }
            }
        }

        System.out.println(dp[1][n-1]);
    
    }
}
