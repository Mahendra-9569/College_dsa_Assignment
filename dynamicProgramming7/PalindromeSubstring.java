package dynamicProgramming7;

public class PalindromeSubstring {
    public static void main(String[] args) {
        String str = "babad";
        int n = str.length();
        int dp[][] = new int[n][n]; 
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1; 
        }   
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                if (str.charAt(i) == str.charAt(j) &&
                    (j - i == 1 || dp[i + 1][j - 1] == 1)
                ) {
                    dp[i][j] = 1; 
                }
            }
        }   
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {               
                if (dp[i][j] == 1) {
                    count++;
                }
            }
        }
        System.out.println("Total number of palindromic substrings: " + count);
    }
}
