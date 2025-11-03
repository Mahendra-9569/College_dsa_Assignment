package Advance_Graph;

public class no_closed_island {
        public static void dfs(int grid[][], int row, int col, int x[], int y[]){
        grid[row][col] = 1;
        for(int i = 0; i<4; i++){
            int nrow = row + x[i];
            int ncol = col + y[i];
            if(nrow >= 0 && nrow < grid.length && ncol >= 0 && ncol < grid[0].length && grid[nrow][ncol] == 0){
                     dfs(grid, nrow, ncol, x, y);
            }
        }
        }
    public static void main(String args[]){
        int[][] grid = {
            {1,1,1,1,1,1,1,0},
            {1,0,0,0,0,1,1,0},
            {1,0,1,0,1,1,1,0},
            {1,0,0,0,0,1,0,1},
            {1,1,1,1,1,1,1,0}
        };

        int n = grid.length;
        int m = grid[0].length;
        int x[] = {1, 0, -1, 0};
        int y[] = {0, 1, 0, -1};
        
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(i == 0 || i == n-1 || j == 0 || j == m-1){
                    if(grid[i][j] == 0){
                        dfs(grid, i, j, x, y);
                    }
                }
            }
        }

        int ans = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                    if(grid[i][j] == 0){
                        ans++;
                        dfs(grid, i, j, x, y);
                    }
                
            }
        }

        System.out.println(ans);
        
    }
}
