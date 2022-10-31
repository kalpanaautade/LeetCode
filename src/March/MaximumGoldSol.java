package March;

import java.util.List;

public class MaximumGoldSol {

    int row, col;
    public int getMaximumGold(int[][] grid) {
        row=grid.length;
        col=grid[0].length;
      for (int i=0; i<row;i++)
          for(int j=0; j<col; j++)
          {
          }
      return 0;
    }
    public void findGold(int i , int j , int[][] grid, int sum , List<int[]> visited)
    {
        if(i>=row || j>=col) return;
        if(grid[i][j]!=0 && i<row && j<col && i>=0 && j>=0 && !visited.contains(new int[]{i, j}))
        {
            sum+=grid[i][j];
            visited.add(new int[]{i, j});
        }
        else
        {
            findGold(i, j+1, grid, sum, visited);
            findGold(i, j-1, grid, sum, visited);
            findGold(i+1, j, grid, sum, visited);
            findGold(i-1, j, grid, sum, visited);

        }

    }
    public static void main(String[] args) {



    }
}
