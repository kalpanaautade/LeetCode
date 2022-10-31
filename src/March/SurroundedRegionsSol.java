package March;

public class SurroundedRegionsSol {

    public static void solve(char[][] board) {

        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[i].length; j++) {
                if (!(i == 0 || j == 0 || i == board.length - 1 || j == board[i].length)) {
                    if (board[i][j] == 'O') {
                        if (checkPos(i, j, board)) continue;
                        else if (checkPos(i - 1, j, board)) continue;
                        else if (checkPos(i, j-1, board)) continue;
                        else board[i][j] = 'X';
                    }

                }
            }
    }

    public static boolean checkPos(int i, int j, char[][] board) {
        if (i == 0 || j == 0 || i == board.length - 1 || j == board[i].length-1) {
            if (board[i][j] == 'O')
                return true;
            else
                return false;
        }
        return false;
    }

    public static void main(String[] args) {

       // char[][] board = {{'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'}, {'X', 'O', 'X', 'X'}};

       // char[][] board =  {{'X','O','X'},{'O','X','O'},{'X','O','X'}};


        char[][] board = {{'O','X','X','O','X'},{'X','O','O','X','O'},{'X','O','X','O','X'},
                {'O','X','O','O','O'},{'X','X','O','X','O'}};

        solve(board);

        for (int i = 0; i < board.length; i++) {
            System.out.print('{');
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + ',');

            }
            System.out.print('}');
        }
    }
}
