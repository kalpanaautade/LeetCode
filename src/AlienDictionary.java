public class AlienDictionary {

    public static void main(String[] args) {
        String[] words = {"hello","leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        boolean result= isAlienSorted(words,order);
        System.out.println("Result :"+ result);
    }
    public  static boolean isAlienSorted(String[] words, String order) {
        for(int i=0; i<words.length-1 ; i++)
            for(int j=0; j<words[i].length() ; j++)
            {
                int firstIndex = order.indexOf(words[i].charAt(j));
                int endIndex = order.indexOf(words[i + 1].charAt(j));
                if (words[i + 1].length() < j)
                        break;
                if (firstIndex > endIndex)
                        return false;
                if(words[i].charAt(j)!=words[i+1].charAt(j))
                    break;
            }
        return true;
    }
}
