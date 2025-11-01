package Backtracking1;
import java.util.*;
public class Nqueens {
    public static boolean isSafe(int row, int col, int n, List<String> grid){
         int nrow = row-1;
         int ncol = col-1;
         while(nrow >= 0 && ncol >= 0){
            if(grid.get(nrow).charAt(ncol) == 'Q'){
                return false;
            }
            nrow--;
            ncol--;
         }
         
         nrow = row+1;
         ncol = col-1;
         while(nrow < n && ncol >= 0){
            if(grid.get(nrow).charAt(ncol) == 'Q'){
                return false;
            }
            nrow++;
            ncol--;
         }
         ncol = col-1;
         while(ncol >= 0){
            if(grid.get(row).charAt(ncol) == 'Q'){
                return false;
            }
            ncol--;
         }

         return true;
    }
    public static void  solveNqueens(int col, int n, List<String> grid, List<List<String>> ans){
        if(col == n){
            ans.add(new ArrayList<>(grid));
            return;
        }

        for(int row = 0; row < n; row++){
            if(isSafe(row, col, n, grid)){
                char ch[] = grid.get(row).toCharArray();
                ch[col] = 'Q';
                grid.set(row, new String(ch));
                solveNqueens(col + 1, n, grid, ans);
                ch[col] = '.';
                grid.set(row, new String(ch));
            }
        }
    }

    public static void main(String args[]){
         List<List<String>> ans = new ArrayList<>();
         int n = 4;
         List<String> grid = new ArrayList<>();
         StringBuilder sb = new StringBuilder();
         for(int i = 0; i < n; i++){
            sb.append('.');
         }

         for(int i = 0; i < n; i++){
            grid.add(sb.toString());
         }
         
         solveNqueens(0, n, grid, ans);
         System.out.println(ans);


    }

}
