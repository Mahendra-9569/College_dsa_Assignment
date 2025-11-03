package Graph4;

public class no_of_Island {
    public static void dfs(int grid[][], int row, int col, int x[], int y[]){
        grid[row][col] = 0;
        for(int i = 0; i<4; i++){
            int nrow = row + x[i];
            int ncol = col + y[i];
            if(nrow >= 0 && nrow < grid.length && ncol>0 && ncol <grid[0].length && grid[nrow][ncol] == 1){
                dfs(grid, nrow, ncol, x, y);
            }
        }
    }
    public static void main(String args[]){
        int grid[][] = {
            {1, 1, 0, 0},
            {0, 0, 1, 1},
            {1, 1, 0, 0},
            {0, 0, 0, 0}
        };

        int x[] = {1, 0, -1, 0};
        int y[] = {0, 1, 0, -1};
        int ans = 0;
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[0].length; j++){
                if(grid[i][j] == 1){
                    ans++;
                    dfs(grid, i, j, x, y);
                }
            }
        }

        System.out.println(ans);
    }
}
