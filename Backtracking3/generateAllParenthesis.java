import java.util.*;
public class generateAllParenthesis {
    public static void Generate(int open, int close, int n, String current, List<String> ans){
        if(open == n && close == n){
            ans.add(current);
            return;
        }
        if(open < n){
            Generate(open + 1, close, n, current + "(", ans);
        }
        if(close < open){
            Generate(open, close + 1, n, current + ")", ans);
        }
    }
    public static void main(String args[]){
         int n = 3;
         List<String> ans = new ArrayList<>();
         Generate(0, 0, n, "", ans);
         System.out.println(ans);
    }
}
