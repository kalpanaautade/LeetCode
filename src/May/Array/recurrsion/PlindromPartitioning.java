package May.Array.recurrsion;

import java.util.ArrayList;
import java.util.List;

public class PlindromPartitioning {

        static List<List<String>> result= new ArrayList<List<String>>();
        public static List<List<String>> partition(String s) {
            backtrack ( s,  new ArrayList<>() );
            return result;
        }

    public static boolean IsPalindrom(String substr)
    {
        String reverstr="";
        for (int i=substr.length()-1; i>=0; i--)
            reverstr +=substr.charAt(i);

        if(substr.equals(reverstr))
            return true;
        return false;
    }
    public static void  backtrack ( String s, List<String> lst ) {
        if (s.length() == 0) {
            result.add(new ArrayList(lst));
            return;
        }
        for (int i = 1; i <= s.length(); i++) {
            String substr = s.substring(0, i);
            if (IsPalindrom(substr)) {
                lst.add(substr);
                String ros = s.substring(i);
                backtrack(ros, lst);
                if(lst.size()>0)
                lst.remove(lst.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        String s = "aab";
        List<List<String>> result= partition( s);
        System.out.println(result);

    }

}
