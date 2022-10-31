package July.Recursion;

public class EncodingSol {

    /*
    123
    1 -> 23
    12 ->3 */

    public static void Encoding(String s, String res)
    {
        if (s.length()==0)
        {
            System.out.println(res + ", ");
            return;
        }

        String oneChar=s.substring(0, 1) ;
        if(oneChar!="0") {
            char code=(char)('a'+ Integer.parseInt(oneChar) -1);
            Encoding(s.substring(1), res + code);
        }
        if (s.length()>=2) {
            String twoChar = s.substring(0, 2);
            if (Integer.parseInt(twoChar) <= 26) {
                char code = (char) ('a' + Integer.parseInt(twoChar) - 1);
                Encoding(s.substring(2), res + code);
            }
        }
    }

    public static void main(String[] args) {
        Encoding("123", "");
    }
}
