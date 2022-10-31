package June.String;

public class LongestSubStr {

    public static void main(String[] args) {
        int result=lengthOfLongestSubstring("dvdf");
        System.out.println(result);
    }
    static int maxCount=0;
    public static void backtracking(int start , String s , String ros)
    {
        if(start==s.length())
            return;

        for(int i=start; i<s.length(); i++)
        {
           if (ros.contains(String.valueOf(s.charAt(i)))) {
               ros="";
                backtracking(i, s , ros);
            }
            else {
               ros += s.substring(i, i+1);
               maxCount= Math.max(maxCount,ros.length() );
           }

        }
    }


    public static int lengthOfLongestSubstring(String s) {
        for (int i=0; i< s.length(); i++) {
            backtracking(i, s, "");
        }
        return maxCount;

    }


}
