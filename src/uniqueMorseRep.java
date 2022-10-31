import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class uniqueMorseRep {

    public static void main(String[] args) {

    }
    public int uniqueMorseRepresentations(String[] words) {

        String[]  morse ={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set<String> set= new HashSet<String>();
        for (int i=0; i< words.length; i++)
        {
            String wo="";
            for(int j=0; j< words[i].length(); j++) {
                int pos =words[i].charAt(j)-'a';
                wo= wo+ morse[pos];
            }
            set.add(wo);
        }
        return set.size();
    }
}
