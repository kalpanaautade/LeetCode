package May.Array.recurrsion;

public class WordSearch {

    public static void main(String[] args) {
        char[][] board= {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word= "SEE";
        boolean result= exist(board,  word);
        System.out.println(result);
    }

    public static boolean exist(char[][] board, String word) {

        for(int i=0; i< board.length; i++)
            for(int j=0; j< board[0].length; j++)
                if(backtrack(board,  word,  i , j ,  0))
                    return true;

        return false;
    }

    public static boolean backtrack(char[][] board, String word, int row, int col, int pos)
    {
        if(row<0 || row >=board.length || col<0 || col >=board[0].length || board[row][col]!=word.charAt(pos))
            return false;

        if(board[row][col]==word.charAt(pos))
        {
            pos++;
        }
        if (pos >= word.length())
            return true;


        board[row][col] ='#';
        boolean flag=false;

        int[] rowoffset={1,0,-1,0};
        int[] coloffset={0,1,0,-1};

        for(int i=0; i< 4; i++)
        {
            flag=  backtrack(board,  word,  row+ rowoffset[i] ,  col+coloffset[i] ,  pos);
            if(flag)
                break;
        }

        board[row][col]=word.charAt(pos);
        return flag;


    }
}
