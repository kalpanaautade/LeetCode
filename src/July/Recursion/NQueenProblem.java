package July.Recursion;

public class NQueenProblem {

    public static boolean isSafe(int[][] board, int row, int col)
    {
        for (int r =row-1 ; r>=0 ; r--)
            if (board[r][col]==1)
                return false;

        for ( int r=row-1, c=col+1; r>=0 && c<board[row].length; r--,c++)
               if (board[r][c]==1)
                   return false;

        for ( int r=row-1, c=col-1; r>=0 && c>=0; r--, c--)
                if (board[r][c]==1)
                    return false;

        return true;

    }
    public static void printQueen(int[][] board, String qPos, int row)
    {
        if (row>=board.length) {
            System.out.println(qPos);
            return;
        }
        for (int col =0; col<board[0].length ; col++)
        if(isSafe(board, row, col))
        {
            board[row][col]=1;
            printQueen( board,  qPos + row +"-"+ col +", ",  row+1);
            board[row][col]=0;
        }
    }
    public static void main(String[] args) {

        int[][] board = new int[4][4];
        printQueen( board, "", 0 );

    }
}
