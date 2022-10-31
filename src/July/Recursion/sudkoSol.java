package July.Recursion;

public class sudkoSol {

    public static void findCorrectSudoku(char[][] board, int r, int c)
    {
        if(r>=board.length)
        {
            for (int i=0; i<board.length;i++) {
                for (int j = 0; j < board[0].length; j++)
                    System.out.print(board[i][j] + ", ");
                System.out.println("");
            }
          return;
        }


        int ni=r;
        int nj=c;
        if (c>=board[0].length-1)
        {   ni++;
            nj=0; }
        else
            nj++;

        if( board[r][c]=='.')
        {
            for(int po=1;po<=9;po++)
                if(isValid(board,r,c, po ))
                {
                    char ch=(char) (po+'0');
                    board[r][c]=ch;
                    findCorrectSudoku(board, ni, nj)  ;
                    board[r][c]=0;
                }
        }
        else
            findCorrectSudoku(board, ni, nj)  ;
    }

    public static boolean isValid(char[][]board,int r,int c,int po )
    {
        for (int i=0; i<board.length;i++)
            if(board[i][c]==po+'0')
                return false;

        for (int j=0; j<board[0].length;j++)
            if(board[r][j]==po+'0')
                return false;

        int mx=r/3*3;
        int my=c/3*3;

        for (int i=0; i<3;i++)
            for(int j=0; j<3; j++)
                if(board[mx+i][my+j]==po+'0')
                    return false;

        return true;

    }





    public static void main(String[] args) {
     char[][] board=   {{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
        findCorrectSudoku( board, 0,0);



    }
}
