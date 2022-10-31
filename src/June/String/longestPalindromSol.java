package June.String;

public class longestPalindromSol {

    static String longPalindrom="";
    public static void backtracking(int start, int end, String s)
    {
        if(start>end )
            return;
        String substr=s.substring(start,end);
        if(isPalindrom(substr))
        {
            if (longPalindrom.length() < substr.length())
                longPalindrom=substr;
            return;
        }
        else
            backtracking( start, end-1,  s);
    }

    public static boolean isPalindrom( String s)
    {
        int left=0;
        int right=s.length()-1;
        while(left<right)
        {
            if (s.charAt(left)!=s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
    public static String longestPalindrome(String s) {
        for (int i=0;i<s.length(); i++)
            backtracking(i, s.length(),  s);
        return longPalindrom;
    }

    public static void main(String[] args) {
       String result= longestPalindrome("qagtxztpovdbqrhtftxrfjkrrjnhbkoawjctdiaygmbutzzosisyxwqbufsgbmfbpcxvdibnayximkkdmviorabhjasxyyagqrxzfewimqewftfihlgsqmkoapwckbhdarhlbonypdzhnxcnzanlrjzfixrpepsjmdepgxvyuijonhqnejymwlofzskcfqdyyfowkzhswutsuhwiqkoogeqkcpjrqndeaxqvdadheostwdonphfaemebuqmwdtrioyjtzoprasizwmwfikaihudneusfgdtcpwgzkwnceziayflxrsmydjiwbeqdzcfewedulydcoahgptzzlzldzaazblvzxuvdxhmzbwasfibtkxuylpklpbfmhujcwvmhbylkrxmhgmmrzdanhsvkrlwqctoexcmhughsvcqgdxxnvcawrroebqylnelyodxfkrplprldsjeejsdlrplprkfxdoylenlyqbeorrwacvnxxdgqcvshguhmcxeotcqwlrkvshnadzrmmghmxrklybhmvwcjuhmfbplkplyuxktbifsawbzmhxdvuxzvlbzaazdlzlzztpghaocdyludewefczdqebwijdymsrxlfyaizecnwkzgwpctdgfsuenduhiakifwmwzisarpoztjyoirtdwmqubemeafhpnodwtsoehdadvqxaednqrjpckqegookqiwhustuwshzkwofyydqfckszfolwmyjenqhnojiuyvxgpedmjspeprxifzjrlnazncxnhzdpynoblhradhbkcwpaokmqsglhiftfweqmiwefzxrqgayyxsajhbaroivmdkkmixyanbidvxcpbfmbgsfubqwxysisozztubmgyaidtcjwaokbhnjrrkjfrxtfthrqbdvoptzxtgaq");
       System.out.println("Result:"+ result);
    }
}
