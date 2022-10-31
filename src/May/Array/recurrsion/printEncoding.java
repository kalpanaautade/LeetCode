package May.Array.recurrsion;

public class printEncoding {

    public static void printEncode(String number , String ans   )
    {
        if(number.length()==0)
        {
            System.out.println(ans);
            return;
        }
        else if (number.length()==1)
        {
            char ch = number.charAt(0);
            if(ch=='0') return;
            else {
                int chv = ch -'0';
                char code =( char)('a'+ chv -1);
                System.out.println(ans + code);
            }
        }
        else {
            String str1 = number.substring(0, 1);
            int onedigit = Integer.parseInt(str1);

            String str2 = number.substring(0, 2);
            int twodigit = Integer.parseInt(str2);

            if (onedigit > 0)
                printEncode(number.substring(1), ans  + (char) ('a'+ onedigit -1));
            if (twodigit >= 10 && twodigit <= 26)
                printEncode(number.substring(2), ans  + (char) ('a'+ twodigit -1));
        }
    }
    public static void main(String[] args) {
        printEncode("123", "");
    }
}
