package April.String;

import java.util.ArrayList;
import java.util.List;

public class TextJustificationSol {

    public static void main(String[] args) {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth=16;
        List<String>  result= fullJustify(words,maxWidth);
        for (int i=0; i< result.size(); i++)
            System.out.println(result.get(i));
    }
        public static List<String> fullJustify(String[] words, int maxWidth) {

            List<String> result= new ArrayList<String>();
            String strtmp ="";
            for (int i=0; i< words.length ; i++ )
            {
                if (strtmp.length() +words[i].length() +1 <= maxWidth  )
                {
                    if(strtmp.length()==0)
                        strtmp=words[i];
                    else
                        strtmp += " "+  words[i] ;
                }
                else
                {

                    String finalstr="";
                    String[] word = strtmp.split(" ");
                    int noofspaces=word.length-1;
                    int padding= maxWidth - strtmp.length() ;
                    int wordpadding=0;
                    int remainingdding = 0;
                    if(padding >0)
                    {
                        wordpadding=padding/noofspaces;
                        remainingdding = padding%noofspaces;
                    }

                    for (int j=0; j< word.length; j++)
                    {
                        finalstr += word[j];

                        if (word.length>1 && j< word.length-1 )
                        {
                            String baseStr="";

                            if(remainingdding>0)
                                baseStr = " ".repeat(wordpadding+remainingdding +1);
                            else
                                baseStr = " ".repeat(wordpadding+remainingdding +1);

                            finalstr+=baseStr;
                            remainingdding=0;
                        }
                        else if (word.length==1)
                        {
                            String baseStr="";
                            baseStr = " ".repeat(padding);
                            finalstr+=baseStr;
                        }
                    }
                    result.add(finalstr);
                    strtmp= words[i];
                }
            }
            return result;

        }


    }
