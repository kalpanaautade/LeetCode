package April.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class longestSubString {
    public static int lengthOfLongestSubstring2(String s) {
        int n = s.length();
        int res = 0;
        int i = 0;
        HashMap<Character, Integer> charlst = new  HashMap<Character, Integer>();
        if(n<=1)
            return n;
        while( i < n ) {
            charlst=  new  HashMap<Character, Integer>();
            int j=0;
            for ( j = i; j < n; j++) {
                if (charlst.containsKey(s.charAt(j))) {
                    res = Math.max(res, j - i );
                    i=charlst.get(s.charAt(j)) ;
                    break;
                }
                else
                    charlst.put(s.charAt(j), j);
            }
           if (j >= n)
               break;
           else
               i++;
        }
        if (charlst.size()>0)
            res = Math.max(res, charlst.size() );

        return res;
    }


        public static int lengthOfLongestSubstring(String s) {
            int maxval=0;
            for (int i=0; i<s.length(); i++)
            {
                for (int j=i; j<s.length(); j++)
                {
                    if(checkrepetation(s, i, j))
                        maxval=Math.max(maxval,j-i );
                }
            }
            return maxval;
        }
        public static boolean checkrepetation(String s, int start , int end )
        {
            int[] chars = new int[128];

            for (int i =start; i<=end; i++)
            {
                char ch= s.charAt(i);
                chars[ch]++;
                if (chars[ch]>1)
                    return false;
            }
            return true;
        }

    public static void main(String[] args) {
     int result= lengthOfLongestSubstring2("dvdf");
     System.out.println("Result: "+result);

    }
}
