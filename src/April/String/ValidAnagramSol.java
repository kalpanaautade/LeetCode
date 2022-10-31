package April.String;

public class ValidAnagramSol {
    public static boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())
            return false;
        int[] counts= new int[26];
        for(int i=0; i< s.length(); i++)
        {
            counts[s.charAt(i)-'a']++;
            counts[t.charAt(i)-'a']--;
        }
        for(int i=0; i < counts.length; i++)
        {
            if(counts[i]>=1)
                return false;
        }
        return true;
    }
        public static void main(String[] args) {
            boolean result=isAnagram("a","ab");
            System.out.println("Result:"+ result);
        }
}
