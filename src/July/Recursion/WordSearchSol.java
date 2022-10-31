package July.Recursion;

public class WordSearchSol {
    public static boolean exist(char[][] board, String word) {

        for(int i=0;i<board.length; i++)
            for(int j=0;j<board[0].length; j++)
                if (searchWord(board,  word, i,j,0))
                    return true;
        return false;

    }

    public static boolean searchWord(char[][] board, String word, int row, int col , int index  )
    {
        if (index >= word.length())
            return true;

        if (row<0|| col<0 || row>=board.length || col>=board[0].length   ||  word.charAt(index)!=board[row][col] || board[row][col]=='*' )
            return false;



        board[row][col]='*';

        boolean ret=false;
        int[] rowoffset= {1, 0, -1,0};
        int[] coloffset= {0, 1, 0,-1};
        for(int i=0; i<4; i++)
        {
            ret=  searchWord( board,  word,  row + rowoffset[i],  col+coloffset[i], index+1 );
            if(ret)
                break;
        }

        board[row][col]=word.charAt(index);

        return ret;
    }

    public static void main(String[] args) {

        char[][] board= {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        boolean result= exist( board, "SEE");

        System.out.println("Result: "+result);
    }
}
