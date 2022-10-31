package April.Array;

import javax.sql.RowSet;

public class WordSearchSol {
    public static void main(String[] args) {
        char[][] board= {{'C','A','A'},{'A','A','A'},{'B','C','D'}};
        String word="AAB";

        boolean result= exist(board,word);

    }

        public static boolean exist(char[][] board, String word) {



            for (int row = 0; row < board.length; ++row)
                for (int col = 0; col < board[0].length; ++col)
                    if (backtrack(row, col, word, 0 , board,board.length, board[0].length))
                        return true;
            return false;
        }

        protected static boolean backtrack(int row, int col, String word, int pos,  char[][] board, int ROWS, int COLS)
        {
            if(pos>=word.length())
                return true;

            if(row<0 || col<0 || row>=ROWS || col>=COLS  )
                return false;

            if(board[row][col]==word.charAt(pos))
            {
                pos++;
                board[row][col]='#';
            }
            else
                return false;
            boolean ret = false;

            ret= backtrack(row+1, col, word, pos ,board, ROWS, COLS);
            if (ret==false)
                ret=backtrack(row-1, col, word, pos,board, ROWS, COLS);
            if (ret==false)
                ret=backtrack(row, col+1, word, pos,board, ROWS, COLS);
            if (ret==false)
                ret=backtrack(row, col-1, word, pos,board, ROWS, COLS);

            board[row][col]=word.charAt(pos);
            return ret;


        }

    }
