package April.String;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioningSol {

    static List<List<String>> answerlst = new ArrayList<List<String>>();

        public static List<List<String>> partition(String s) {
            List<String> palindromlst= new ArrayList<String>();
            Backtracking( s, 0,  1 ,  s.length() ,  palindromlst );
            return answerlst;
        }
        public static void Backtracking(String s,int startPos, int len , int max , List<String> palindromlst )
        {
            if ( len > max)
                return;

            while(startPos+len<=max)
            {
                String strTmp= s.substring(startPos,startPos+len);
                if(isPalindrom(strTmp))
                    palindromlst.add(strTmp);
                startPos++;
            }
            if (palindromlst.size()>0)
                answerlst.add(palindromlst);
            Backtracking( s, 0,  len+1 ,  max ,   new ArrayList<String>());

        }
        public static boolean isPalindrom(String s)
        {
            String t="";
            for(int i=s.length()-1 ; i>=0 ; i--)
                t+=s.charAt(i);

            if(s.equals(t))
                return true;
            else
                return false;
        }

    public static void main(String[] args) {
        List<List<String>> combination= partition("aab");

        System.out.println("Result:" + combination);

    }
}
