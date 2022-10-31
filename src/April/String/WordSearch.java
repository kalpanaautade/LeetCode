package April.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WordSearch {

    static class TrieNode
    {
        public HashMap<Character, TrieNode> children= new  HashMap<Character, TrieNode>();
        public String word;
        public TrieNode() {}
    }

        static List<String> result= new ArrayList<String>();
        static int ROWS=0;
        static int COLS=0;
        public static List<String> findWords(char[][] board, String[] words) {
            ROWS=board.length;
            COLS=board[0].length;
            TrieNode root= new TrieNode();
            TrieNode node=root;

            for(int i=0; i<words.length; i++)
            {
                for(Character ch : words[i].toCharArray())
                {
                    if(node.children.containsKey(ch))
                        node= node.children.get(ch);
                    else
                    {
                        TrieNode child = new TrieNode();
                        node.children.put(ch,child);
                        node=child;
                    }
                }
                node.word= words[i];
            }


            for(int i=0; i<ROWS; i++)
                for(int j=0; j<COLS; j++)
                {
                    if (root.children.containsKey(board[i][j]))
                        dfs(board, root, i,j);
                }

            return result;

        }

        public static boolean dfs(char[][] board, TrieNode root, int row, int col)
        {
            if (root==null) return false;

            if (row<0 || col<0 || row>=ROWS || col>=COLS)
                return false;

            Character currCh=board[row][col];

            if (!root.children.containsKey(currCh))
                return false;

            TrieNode currNode=root.children.get(currCh);

            if (currNode.word!=null)
            {
                result.add(currNode.word);
            }


            board[row][col]='#';
            boolean flag=true;
            int[] rowoffset={-1,0,1,0};
            int[] coloffset={0,-1, 0,1};
            for(int i=0; i<rowoffset.length; i++)
            {
                int newrow=row +rowoffset[i];
                int newcol=col +coloffset[i];

                flag = dfs(board, currNode, newrow, newcol);
                if(!flag) continue;
            }

            board[row][col]=currCh;

            return flag;
        }

    public static void main(String[] args) {

            char[][] board={{'o','a','a','n'},{'e','t','a','e'},{'i','h','k','r'},{'i','f','l','v'}};
            String[] words = {"oath","pea","eat","rain"};
         List<String> result= findWords( board,  words) ;

         for (int i =0; i<result.size(); i++)
             System.out.println("Result: "+ result);


    }
}
