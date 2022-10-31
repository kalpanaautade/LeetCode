package April.String;

import java.util.ArrayList;
import java.util.List;

public class BackspaceStringSol {

    public static  boolean backspaceCompare(String s, String t) {

        List<Integer> lstS = new ArrayList<Integer>();
        List<Integer> lstT = new ArrayList<Integer>();
        for (int i=1;  i<s.length(); i++){
            if (s.charAt(i)=='#')
            {
                lstS.add(i);
            }
        }

        for (int i=1;  i<t.length(); i++){
            if (t.charAt(i)=='#')
            {
                lstT.add(i);
            }
        }

        for(int index: lstS)
        {


        }

        if (s.equals(t))
            return true;
        else
            return false;

    }


    public static void main(String[] args) {

       String s = "ab#c";
       String  t = "ad#c";


        boolean result= backspaceCompare( s,  t);
    }
}
