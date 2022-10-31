package April.String;

import java.util.ArrayList;
import java.util.List;

public class NoOfPath {

    public static void numOfPathsToDest(int n) {

        int col=1;
        List<String> result=new ArrayList<>();
        brackTracking(n, 2,0,result,"");
        for(int i=0; i<result.size();i++)
        System.out.println(result.get(i) +", ");
    }

    public static void brackTracking(int n, int row, int col, List<String> result, String strtmp)
    {
        if (strtmp.length()==n+1)
        {
            result.add(strtmp);
            strtmp="";

        }
        if (row==col || row >=n || col>=n )
            return;
        brackTracking(n , row+1, col,result,  strtmp+"E");
        brackTracking(n , row, col+1,result , strtmp+"N");

        return;
    }

    public static void main(String[] args) {
        numOfPathsToDest(5);
    }

}