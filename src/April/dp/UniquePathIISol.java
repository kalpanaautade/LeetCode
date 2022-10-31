package April.dp;

import java.util.Arrays;

public class UniquePathIISol {
    public static void main(String[] args) {
        int[][] obstacleGrid={{0,0,0},{0,1,0},{0,0,0}};

        int Result=uniquePathsWithObstacles(obstacleGrid);

        System.out.println("Result "+ Result);
    }
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[][] dp = new int[m][n];

        for(int row=0; row<m; row++)
            for(int col=0; col<n; col++)
            {
                dp[row][col]= obstacleGrid[row][col]==0? 1: 0;

            }

        for(int row=1; row<m; row++)
            for(int col=1; col<n; col++)
            {
                if(obstacleGrid[row][col]!=1)
                    dp[row][col] = dp[row-1][col]+dp[row][col-1];
                else
                    break;
            }

        return dp[m-1][n-1];

    }
}
