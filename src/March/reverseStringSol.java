package March;

public class reverseStringSol {

    public static void reverseString(char[] s) {

        for(int i=0, j=s.length-1; i<j; i++, j--)
        {
            char strtmp= s[j];
            s[j]=s[i];
            s[i]=strtmp;
        }

    }

    public static void main(String[] args) {
        char[]  s = {'h','e','l','l','o'};
        reverseString( s);
        for(int i=0; i<s.length;i++)
        {
            System.out.print(s[i] +", ");
        }
    }
}
