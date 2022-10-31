package July.Recursion;

import java.util.ArrayList;
import java.util.List;

public class StairPathSol {

    public static List<String> getStairPath(int n)
    {
        if(n==0)
        {
            List<String> lst = new ArrayList<>();
            lst.add("");
            return lst;
        }else if (n<0)
        {
            List<String> lst = new ArrayList<>();
            return lst;
        }
        List<String> path1=getStairPath(n-1) ;
        List<String> path2=getStairPath(n-2);
         List<String> lst = new ArrayList<>();
        for (String str: path1)
        {
            lst.add(1+str);
        }
        for (String str: path2)
        {
            lst.add(2+str);
        }
        return lst;

    }
    public static void main(String[] args) {

        List<String> paths= getStairPath(3);

        for(String str : paths)
            System.out.println(str);

    }
}
