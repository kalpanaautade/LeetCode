package July;

import java.util.ArrayList;
import java.util.List;

public class MazePathSol {


    public static List<String>  getMazePath(int sr, int sc, int dr, int dc)
    {
        if(sr==dr && sc==dc )
        {
            List<String> lst = new ArrayList<String>();
            lst.add("");
            return lst;
        }


        List<String> paths = new ArrayList<String>();
        for(int m=1;m<=dr-sr; m++) {
            List<String> hlst = getMazePath(sr + m, sc, dr, dc);
            for(String str : hlst)
            {
                paths.add("h"+m+ str);
            }
        }

        for(int m=1;m<=dc-sc; m++) {
            List<String> vlst = getMazePath(sr, sc + m, dr, dc);
            for(String str : vlst)
            {
                paths.add("v"+m+str);
            }
        }

        for(int m=1;m<=dc-sc && m<=dr-sr; m++) {
            List<String> dlst = getMazePath(sr + m, sc + m, dr, dc);
            for (String str : dlst) {
                paths.add("d" +m+ str);
            }
        }
        return paths;
    }

    public static void main(String[] args) {

        List<String> path= getMazePath(0,0,2,2);

        for (String str: path)
            System.out.println(str + ", ");
    }
}
