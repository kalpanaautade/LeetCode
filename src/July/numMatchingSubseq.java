package July;

public class numMatchingSubseq {

    public static void main(String[] args) {

        String s = "abcde";
        String[] words= new String[]{"a", "bb", "acd", "ace"};

        int count =numMatchingSubseq(s, words);

        System.out.println("Count: "+count);
    }
        public static int numMatchingSubseq(String s, String[] words) {

            int count=0;
            for(int i=0; i<words.length; i++)
            {
                int srcCurr=0;
                int j=0;
                for(j=0; j<words[i].length(); j++)
                {
                    if (srcCurr <s.length())
                    {
                        int findIndex=  s.indexOf(String.valueOf(words[i].charAt(j)), srcCurr);
                        if (findIndex>=0)
                            srcCurr=findIndex+1;
                        else
                            break;
                    }
                    else
                        break;
                }
                if(j>=words[i].length())
                    count++;
            }
            return count;
        }

}
