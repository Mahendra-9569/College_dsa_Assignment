package dynamicProgramming8;

public class EggDroping {
    public static void main(String[] args) {
        int eggs = 2;
        int floors = 10;
        int dp[][] = new int[eggs + 1][floors + 1];

        for (int i = 1; i <= eggs; i++) {
            dp[i][0] = 0; 
            dp[i][1] = 1; 
        }

        for (int j = 1; j <= floors; j++) {
            dp[1][j] = j; 
        }

        for (int i = 2; i <= eggs; i++) {
            for (int j = 2; j <= floors; j++) {
                dp[i][j] = Integer.MAX_VALUE;
                for (int x = 1; x <= j; x++) {
                    int res = 1 + Math.max(dp[i - 1][x - 1], dp[i][j - x]);
                    if (res < dp[i][j]) {
                        dp[i][j] = res;
                    }
                }
            }
        }

        System.out.println("Minimum number of trials in worst case with " + eggs + " eggs and " + floors + " floors is: " + dp[eggs][floors]);
    }
}
