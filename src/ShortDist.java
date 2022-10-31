public class ShortDist {

    public static int shortestDistance(String[] wordsDict, String word1, String word2) {
        int[] match1 = new int[wordsDict.length];
        int[] match2 = new int[wordsDict.length];

        int c1=0, c2=0;
        for (int i=0; i< wordsDict.length; i++)
        {
            if(wordsDict[i].equals(word1)) {
                match1[c1]= i+1;
                c1++;
            }
            if(wordsDict[i].equals(word2)) {
                match2[c2] = i+1;
                c2++;
            }
        }

        int diff=0, resultdiff=0;
        for (int i=0; i< match1.length; i++)
            for (int j=0; j< match2.length; j++)
            {
                if(match1[i]!=0 && match2[j]!=0) {
                    if (match1[i] > match2[j])
                        diff = match1[i] - match2[j];
                    else
                        diff = match2[j] - match1[i];

                    if (diff <= resultdiff || resultdiff == 0)
                        resultdiff = diff;
                }
            }
      return resultdiff;
    }
    public static void main(String[] args) {

        System.out.println("Hello Leet");

        //String[] wordsDict = {"practice", "makes", "perfect", "coding", "makes"};
        String[] wordsDict = {"a","a","b","b"};
        String word1 = "a";
        String word2 = "b";

        int Result =shortestDistance(wordsDict,word1,word2);

        System.out.println("Result= "+Result);
    }

}
