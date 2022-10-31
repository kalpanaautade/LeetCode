package July.Recursion;

import java.util.List;

public class StringPermutationSol {
    public static void permutation(String s, String res)
    {
        if(s.length()==0)
        {
            System.out.println(res +", ");
            return;
        }
            for(int i=0; i<s.length();i++)
            {
                String pre_str="";
                String post_str="";
                if(i!=0)
                 pre_str= s.substring(0,i);
                if(i!=s.length()-1)
                    post_str=s.substring(i+1);
                permutation(pre_str+post_str, res+String.valueOf(s.charAt(i)));
            }
    }
    public static void main(String[] args) {
        permutation("abc", "");
    }
}
