package June;

import java.util.ArrayList;
import java.util.List;

public class NQueen {

    static List<List<String>> result= new ArrayList<>();
    public static void backtrack(int n, int row, String str, List<String> ans, boolean[] cols, boolean[] nDig, boolean[] rDig)
    {
        if (row == n)
        {
            result.add(new ArrayList<>(ans));
            return;
        }

        for (int col=0; col<n; col++)
        {
            if(cols[col]==false && nDig[row+col]==false && rDig[row-col+n-1]==false)
            {
               str= placeQue(col, n);
               ans.add(str);
                cols[col]=true ;
                 nDig[row+col]=true ;
                 rDig[row-col+n-1]=true;
                backtrack( n, row+1, str,  ans, cols, nDig , rDig );
                if (ans.size()>0)
                ans.remove(ans.get(ans.size()-1));

                cols[col]=false ;
                nDig[row+col]=false ;
                rDig[row-col+n-1]=false;
            }
        }
    }

    public static String placeQue(int row, int n)
    {
        String str="";
        for(int i=0; i<n; i++)
        {
            if(row==i)
                str+="Q";
            else
                str+=".";
        }
         return str;
    }

    public static void solveNQueens(int n) {

        boolean[] cols= new boolean[n];
        boolean[] nDig= new boolean[n+n-1];
        boolean[] rDig= new boolean[n+n-1];

        backtrack( n,0,  "", new ArrayList<String>(), cols,  nDig ,  rDig );

        System.out.println(result);

    }

    public static void main(String[] args) {
        solveNQueens(4);
    }
}
