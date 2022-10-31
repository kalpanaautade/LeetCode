package April.dp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WorkBreakSol {

    public static void main(String[] args) {

       String s ="leetcode";
        List<String> wordDict = Arrays.asList(new String[]{"leet", "code"});

        boolean Result= wordBreak( s,  wordDict);

        System.out.println("Result:"+Result);
    }
        public static boolean wordBreak(String s, List<String> wordDict) {
            Set<String> wordDictSet = new HashSet<>(wordDict);
            boolean[] dp = new boolean[s.length() + 1];
            dp[0] = true;
            for (int i = 1; i <= s.length(); i++) {
                for (int j = 0; j < i; j++) {
                    System.out.println(" i= "+ i + " j="+ j +" NewString="+ s.substring(j, i) + " dp[j]= "+ dp[j]);
                    if (dp[j] && wordDictSet.contains(s.substring(j, i))) {
                        dp[i] = true;
                        break;
                    }
                }
            }
            return dp[s.length()];
        }

}
