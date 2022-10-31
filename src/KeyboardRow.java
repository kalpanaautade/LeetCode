import java.util.Locale;

public class KeyboardRow {

    public static String[] findWords(String[] words) {

        String[] result= new String[words.length];
        int count=0;
        String row1= "qwertyuiop";
        String row2= "asdfghjkl";
        String row3 ="zxcvbnm";

        for (int i=0; i<words.length; i++)
        {
            String word = words[i];
            int j=0;
            String row="";
            for ( j=0; j<words[i].length(); j++)
            {
                Character ch= words[i].charAt(j);
                if (j==0)
                {
                    if (row1.contains(ch.toString().toLowerCase()))
                        row=row1;
                    else if (row2.contains(ch.toString().toLowerCase()))
                        row=row2;
                    else if (row3.contains(ch.toString().toLowerCase()))
                        row=row3;
                }
                if (!row.isEmpty())
                {
                    if (!row.contains(ch.toString().toLowerCase()))
                        break;
                }
            }
            if (j==words[i].length())
            {
                result[count]=words[i];
                count++;
            }

        }
        return result;

    }

    public static void main(String[] args) {

       // String[] words = {"Hello","Alaska","Dad","Peace"};

        String[] words = { "adsdf","sfd"};

        String[]  result= findWords(words) ;

        System.out.print("Result = ");
        for (int i=0; i<result.length; i++)
            if (result[i]!=null )
            System.out.print(result[i] + " ");

    }
}
