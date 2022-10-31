package March;

public class PalindromeSol {

    public static boolean isPalindrome(String s) {

        StringBuilder str= new StringBuilder();
        for(int i=0; i<s.length();i++)
        {
            if (Character.isLetterOrDigit( s.charAt(i)))
                str.append(Character.toLowerCase( s.charAt(i)));
        }

        String strBuild =str.toString();
        String strReverse=str.reverse().toString();

        return strBuild.equals(strReverse);

    }
    public static void main(String[] args) {

        boolean bresult=isPalindrome("A man, a pplan, a canal: Panama");

        System.out.println("Result:"+ bresult);
    }
}
