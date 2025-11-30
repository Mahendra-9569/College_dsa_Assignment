package dynamicProgramming9;
import java.util.*;
public class matrixChainMultiplication1 {
    public static int maxAns(int arr[], int i, int j, int dp[][]){
        if(i >= j)return 0;
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int max = Integer.MIN_VALUE;
        for(int k = i; k< j; k++){
            int left = maxAns(arr, i, k, dp);
            int right = maxAns(arr, k+1, j, dp);
            int currAns = arr[i-1] + arr[k] + arr[j];

            int ans = left = right + currAns;
            max = Math.max(currAns , max);
        }

        return dp[i][j] = max;
    }
    public static void main(String[] args) {
        int matrix[] = {3, 4, 5, 6, 7};
        int  n  = matrix.length;
        int dp[][] = new int[n][n];
        for(int arr[]: dp){
            Arrays.fill(arr, -1);
        }
        int res = maxAns(matrix, 1, matrix.length-1, dp);
        System.out.println(res);
    }
}
