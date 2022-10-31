package June.String;

public class longestRepeatingCharReplace {

    public static int characterReplacement(String s, int k) {

        int left=0;
        int right=1;
        int maxlength=0;
        int tmpk=k;
        String tmps=s;
        while(left < s.length() && right<s.length())
        {
            if(tmps.charAt(left)!=tmps.charAt(right))
            {
                if (tmpk!=0)
                    tmpk--;
                else
                {
                    if (k>0)
                        maxlength=Math.max(maxlength, right-left+1);
                    left++;
                    right=left;
                    tmpk=k;
                }
            }
            else
                maxlength=Math.max(maxlength, right-left+1);
            right++;
        }
        return maxlength;
    }

    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        int result=characterReplacement( s,  k);
        System.out.println("Result:"+result );

    }
}
