package July.Recursion;

import java.util.ArrayList;
import java.util.List;

public class KeyPadCombination {
    static String[] codes={"", "abc", "def", "ghi", "jkl","mno","pqrs","tuv","wxyz"};
    static List<String> mres= new ArrayList<>();

    public static void combination(String digitChar, List<String> ans)
    {
        if (digitChar.length()==0) {
            mres= new ArrayList<>();
            return;
        }

        String ch= String.valueOf(digitChar.charAt(0));
        String ros= digitChar.substring(1);
        combination(ros, ans);
        if ( ans.size()==0)
        {
            mres.add(ch);
        }
        else
        {
            for(String str: ans)
            {
                mres.add(str+ch);
            }
        }

    }

    public static void letterCombinations(String digits) {

        ArrayList<String> ans= new ArrayList<>();
        for (int i=0; i<digits.length(); i++)
        {
            int index=Integer.valueOf(String.valueOf(digits.charAt(i)));
            combination(codes[index-1], ans );
            ans= new ArrayList<>();
            ans.addAll(mres);

        }

        for(String str: ans)
            System.out.print(str + ", ");

    }
    public static void main(String[] args) {
        letterCombinations("2");
    }
}
