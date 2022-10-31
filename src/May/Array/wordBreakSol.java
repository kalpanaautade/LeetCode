package May.Array;

import java.util.*;

public class wordBreakSol {
    public static class TrieNode
    {
        HashMap<Character, TrieNode> Children = new HashMap<>();
        boolean isword=false;

        public TrieNode()
        {

        }
    }

        public static boolean wordBreak(String s, List<String> wordDict) {
            return wordBreakproblem( 0, s, new HashSet<String>(wordDict));
        }

        public static boolean  wordBreakproblem( int start, String s,  Set<String> wordDict)
        {
            if (start==s.length())
                return true;
            for (int end=start+1; end<=s.length(); end++)
            {
                String tmp=s.substring(start, end);
                System.out.println( " Tmp: " + tmp  + " Start: " + start +  " End: " + end );

                if (wordDict.contains(tmp) &&  wordBreakproblem( end, s,  wordDict))
                    return true;
            }
            return false;
        }

    private static boolean wordBreakMemo2(String s, Set<String> wordDict, int start, Boolean[] memo) {
        if (start == s.length()) {
            return true;
        }

     //   System.out.println( " Start: " + start + " memo[start]: " + memo[start]);

        if (memo[start] != null) {

            return memo[start];
        }
        for (int end = start + 1; end <= s.length(); end++) {

            String tmp=s.substring(start, end);
            System.out.println( " Tmp: " + tmp  + " Start: " + start +  " End: " + end + " memo[start]: " + memo[start]);

            if (wordDict.contains(s.substring(start, end)) && wordBreakMemo2(s, wordDict, end, memo)) {
                return memo[start] = true;
            }
        }
        return memo[start] = false;
    }



    public static boolean wordBreak3(String s, List<String> wordDict) {
        List<String> result= new ArrayList<>();
        // insert dictinary in TrieNode
        TrieNode root = new TrieNode();
        TrieNode parent =root;
        TrieNode prevNode=null;
        for(String word :wordDict) {
            for (int i = 0; i < word.length(); i++)
                if (!parent.Children.containsKey(word.charAt(i))) {
                    TrieNode newchild = new TrieNode();
                    parent.Children.put(word.charAt(i), newchild);
                    prevNode=parent;
                    parent = newchild;
                } else {
                    prevNode=parent;
                    parent = parent.Children.get(word.charAt(i));
               }
            prevNode.isword=true;
            parent=root;
        }
       return SearchInDict( s, 0, root , new StringBuilder(), result);


    }

   public static boolean SearchInDict(String s, int start, TrieNode root, StringBuilder builder, List<String> result)
   {
       if (start==s.length())
           return true;
       int pos=start;
       TrieNode parent =root;
       while(start<s.length())
        {
            char tmp=s.charAt(start);
           if(parent.Children.containsKey(tmp)) {
               if(parent.isword==true)
                   parent=root;
               else
                    parent = parent.Children.get(s.charAt(start));
               start++;
           }
           else
               return false;
        }
       return true;

   }


    public static boolean segment2(int start, String s, List<String> wordDict)
    {
        if (start==s.length())
        {
            return true;
        }
        boolean flag=false;

        for (int end=start+1; end<=s.length(); end++)
        {
            String currentStr=s.substring(start, end);
            if (wordDict.contains(currentStr))
            {  flag=segment2(end,  s, wordDict);

            }

        }
        return flag;
    }

    public static boolean wordBreak5(String s, List<String> wordDict) {
        return segment2(0,   s, wordDict);
    }


    public static boolean segment(int start,int current, String s, List<String> wordDict)
    {
        if (current>=s.length())
        {
            String str= s.substring(start, current);
            if (!str.isEmpty() && !wordDict.contains(str))
                return false;
            return true;
        }
        boolean flag;
        String currentStr=s.substring(start, current);
        if (!wordDict.contains(currentStr))
            flag= segment(start, current+1,  s, wordDict);
        else
            flag=segment(current, current,  s, wordDict);

        return flag;
    }

    public static boolean wordBreak4(String s, List<String> wordDict) {
        return segment(0, 0,  s, wordDict);
    }


    public static void main(String[] args) {
        //String s = "catsandog";
        //List<String> wordDict = Arrays.asList("cats","dog","sand","and","cat") ;

        String s = "abcd";
        List<String> wordDict = Arrays.asList("a","abc","b","cd") ;
        boolean result= wordBreak5( s, wordDict);
       // boolean result= wordBreakMemo2(s, new HashSet<>(wordDict), 0, new Boolean[s.length()]);
        System.out.println("Result= " + result);

    }
}
