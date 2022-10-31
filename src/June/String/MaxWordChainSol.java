package June.String;

import java.util.*;

public class MaxWordChainSol {

    static int maxchainLength=0;
    public static class wordlengthCompare implements Comparator<String>
    {
        public int compare(String s1, String s2)
        {
            return s1.length()-s2.length();
        }
    }
    public static int longestStrChain(String[] words) {

        Collections.sort(Arrays.asList(words), new wordlengthCompare() );
        for (int i=0; i<words.length; i++)
        {
            List<String> lst = new ArrayList();
            for (int j=i; j<words.length; j++)
            {
                if( trackChain( words,i, j))
                    lst.add(words[j]);

            }
            maxchainLength= Math.max(maxchainLength, lst.size());
        }
        return maxchainLength;
    }

    public static boolean trackChain(String[] words, int cur, int next)
    {
        int i=0;
        int s=0;
        while(i< words[next].length() && s< words[cur].length())
        {
            if (words[cur].charAt(s)==words[next].charAt(i))
                s++;
            i++;

        }
        if (s==words[cur].length() )
            return true;
        return false;
    }

    public static void main(String[] args) {
        String[] words={"xbc","pcxbcf","xb","cxbc","pcxbc"};
        int result= longestStrChain( words);
        System.out.println(result);

    }
}
