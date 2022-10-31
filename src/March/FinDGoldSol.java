package March;

public class FinDGoldSol {
    static int  max=0;
    //initialize max to zero globally
    public static int getMaximumGold(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=0)  //if  grid[i][j]=0 discard
                {
                    boolean[][] vis=new boolean[grid.length][grid[0].length]; //intialize vis array for each iteration
                    dfs(i,j,0,grid,vis);
                }
            }
        }
        return max;
    }

    public static void dfs(int x, int y, int sum, int[][] grid, boolean[][] vis){ //boundary conditions
        if(x<0 || x>=grid.length || y<0 || y>=grid[0].length || vis[x][y] || grid[x][y]==0){
            max=Math.max(max,sum);//if boundary conditions are met update max
            return;
        }
        vis[x][y]=true;
        sum+=grid[x][y];
        dfs(x-1,y,sum,grid,vis);
        dfs(x,y-1,sum,grid,vis);
        dfs(x+1,y,sum,grid,vis);
        dfs(x,y+1,sum,grid,vis);
        vis[x][y]=false;//backtrack by unvisiting grid[x][y]
    }

    public static void main(String[] args) {
        int[][] grid = new int[][] {{0,6,0},{5,8,7},{0,9,0}};


       int result= getMaximumGold(grid);

       System.out.println("Result: "+result );
    }
}
