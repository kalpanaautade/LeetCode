package July.Recursion;

public class GoldMineSol {

    static int maxGold=0;
    public static void findMaxGold(int[][] mine, int r, int c , Integer sum, boolean[][] visited)
    {
        if (r<0|| c<0 || r>=mine.length|| c>=mine[0].length || mine[r][c]==0 || visited[r][c])
            return ;

        visited[r][c]=true;

        int[] rowoffset={1, 0,-1,0};
        int[] coloffset={0, 1,0,-1};
        for(int i=0; i<4; i++) {
            findMaxGold(mine, r + rowoffset[i], c+coloffset[i], sum + mine[r][c], visited) ;
        }
    }


    public static void main(String[] args) {

        int[][] mine ={{0,6,0},{5,8,7},{0,9,0}};
        Integer sum=0;
        boolean[][] visited= new boolean[3][3];
        for(int i=0; i<mine.length; i++)
            for(int j=0; j<mine[0].length; j++)
                if(mine[i][j]!=0 && visited[i][j]==false) {
                    findMaxGold(mine, i, j, sum, visited);
                     if (sum>maxGold)
                         maxGold=sum;
                    sum=0;

                }
        System.out.println("maxGold :"+ maxGold);
    }
}
