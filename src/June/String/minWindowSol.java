package June.String;

import java.util.HashMap;
import java.util.Map;

public class minWindowSol {

    public static String minWindow(String s, String t)
    {
        int left=0;
        int right=0;

        int minCount=Integer.MAX_VALUE;
        String finalString="";


        Map<String, Boolean> tmap= new HashMap<String, Boolean>();
        for (int i=0; i< t.length(); i++)
        {
            Character ch =t.charAt(i);
            tmap.put(i+ch.toString(), false);
        }

        int allset=0;
        while (left<s.length() && right  <s.length())
        {
            Character ch=s.charAt(right);
            if(tmap.containsKey(right+ch.toString()) )
            {
                if (updateTmap(right , ch,tmap))
                {
                    allset++;
                    if(allset==t.length()) {
                        if ((right - left) < minCount) {
                            if ((right + 1) >= s.length())
                                finalString = s.substring(left);
                            else
                                finalString = s.substring(left, right + 1);
                            minCount = right - left + 1;
                        }
                        right = left;
                        left++;
                        updateTmapToFalse(tmap);
                        allset=0;
                    }
                }
            }
            right++;
        }
        return finalString;
    }

    public static void  updateTmapToFalse(Map<String, Boolean> tmap )
    {
        for(Map.Entry<String, Boolean> entry : tmap.entrySet())
        {
                entry.setValue(false);
        }

    }

    public static boolean updateTmap(int index, Character ch,Map<String, Boolean> tmap )
    {
        for(Map.Entry<String, Boolean> entry : tmap.entrySet())
        {
            if (entry.getKey().equals(index+ch.toString()) && entry.getValue()==false) {
                entry.setValue(true);
                return true;
            }
        }
        return false;
    }



    public static void main(String[] args) {
        String result= minWindow("ADOBECODEBANC", "ABC");
       // String result= minWindow("aa", "aa");
        System.out.println("Result = "+ result);

    }
}
