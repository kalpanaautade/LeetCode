package March;

public class longestCommonPrefixSol {
    public static void main(String[] args) {
        String[] strs={"flower", "flow", "flight"};
        //String[] strs={"ab", "a"};
        String prefix= longestCommonPrefix(strs);

        System.out.println("Common Prefix:"+prefix);
    }

    public static String longestCommonPrefix(String[] strs) {
        int currLength=1;
        int i=1;
        String currMatch="";
        String prefix="";
        while(currLength<=strs[0].length()) {
            prefix =  strs[0].substring(0, currLength);
            for (i=1; i< strs.length; i++)
            {
                if(strs[i].length()<currLength ||  !strs[i].substring(0,currLength).equals(prefix))
                    break;
            }
            if ( i>=strs.length)
            {
                currMatch=prefix;
                currLength++;
            }
            else
                return currMatch;
        }
        return currMatch;
    }
}
