import java.util.ArrayList;
import java.util.List;

public class CommonCharacters {
    public static void main(String[] args) {
        String[] words = {"bella","label","roller"};
        List<String> arr =commonChars(words);
        for(int i=0; i<arr.size(); i++)
            System.out.println(arr.get(i));

    }
    public static List<String> commonChars(String[] words) {
        ArrayList<String> arr = new ArrayList<String>();
        int j = 1;
        for(int i=0; i<words[0].length(); i++) {
            for ( j = 1; j < words.length; j++) {
                if (words[j].contains(String.valueOf(words[0].charAt(i))))
                    words[j].replace(words[0].charAt(i) , '*');
                else
                    break;
            }
            if (j==words.length)
                arr.add(String.valueOf(words[0].charAt(i)));
        }
        return arr;
   }
}
