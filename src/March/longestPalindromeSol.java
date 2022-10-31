package March;

public class longestPalindromeSol {

     //S= babad
     // O= bab
     public static void main(String[] args) {
         longestPalindrome("aacabdkacaa");
     }

    public static void longestPalindrome(String s) {
        String MaxString="", maxPalindrum="";
        for(int i=0; i<s.length(); i++)
        {
           MaxString=  searchPal(i, s.length(), s);
           if(MaxString.length()>maxPalindrum.length())
               maxPalindrum= MaxString;
        }
        System.out.println("Palindrum :"+ maxPalindrum);
    }

    private static String searchPal ( int startIndex , int lastIndex , String s)
    {
        int start=startIndex;
        int end = lastIndex;
        String strend=s.substring(0,lastIndex);
        int endIndex= strend.lastIndexOf(s.charAt(startIndex));
        String strStart="";
        String strEnd="";
        while (startIndex<endIndex )
        {
            if (s.toString().charAt(startIndex)==s.toString().charAt(endIndex))
            {
                strStart += s.toString().charAt(startIndex);
                strEnd=s.toString().charAt(endIndex) + strEnd;
                startIndex++;
                endIndex--;
            }
            else
            {
                strStart="";
                strEnd="";
                startIndex=start;
                endIndex=end-1;
                searchPal(startIndex,endIndex, s);
            }
        }
        if (startIndex==endIndex) {
            strStart += s.toString().charAt(startIndex);
            return strStart+strEnd;
        }
        else if(startIndex>endIndex ) {
               return strStart+strEnd;
        }
        return "";
    }

}
