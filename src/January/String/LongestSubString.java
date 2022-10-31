package January.String;

public class LongestSubString {

    public static void main(String[] args) {

        //Longest Substring Without Repeating Characters
        int len = lengthOfLongestSubstring("pwwkew");
        System.out.print("Length of Longest Substring Without Repeating Characters :"+ len);

    }

    public static int lengthOfLongestSubstring(String s) {
        int max=0;
        for ( int i=s.length(); i>=1; i--)
        {
            String substr= s.substring(0, i);
            int j=0;
            for(j=0; j< substr.length(); j++)
            {
                String ch=String.valueOf( substr.charAt(j));
                if (substr.indexOf(ch,j+1) >0) {
                    max=0;
                    break;
                }
                else
                    if( max < substr.length())
                        max=substr.length();
            }

        }
        return max;
    }

}

