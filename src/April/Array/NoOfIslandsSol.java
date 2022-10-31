package April.Array;

public class NoOfIslandsSol {

    public static void main(String[] args) {
        char[][]     grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };

       int noofIsLand= numIslands(grid);

       System.out.println("Result:"+noofIsLand );
    }

    public static int numIslands(char[][] grid) {

        int ROWS=grid.length;
        int COLS=grid[0].length;
        int numIsland=0;
        for (int i=0; i< ROWS; i++) {
            for (int j = 0; j < COLS; j++)
                if (grid[i][j] == '1') {
                    dfs(grid, i, j, ROWS, COLS);
                    numIsland++;
                }
        }
        return numIsland;
    }

    public static void  dfs(char[][] grid,int row,int  col, int ROWS, int COLS)
    {
        if(row<0 || col<0|| row >ROWS || col> COLS   || grid[row][col]=='0')
            return ;

        grid[row][col]='0';

        dfs(grid, row+1, col, ROWS, COLS);
        dfs(grid, row-1, col, ROWS, COLS);
        dfs(grid, row, col+1, ROWS, COLS);
        dfs(grid, row, col-1, ROWS, COLS);

    }



}
