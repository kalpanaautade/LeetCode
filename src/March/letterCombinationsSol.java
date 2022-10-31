package March;

import java.util.*;

public class letterCombinationsSol {

    List<String> result= new ArrayList<String>();


    public static void main(String[] args) {

        String number = "23";
        Map<Integer, List<Character>> map = new HashMap();
        map.put(1, Arrays.asList(new Character[]{}));
        map.put(2, Arrays.asList(new Character[]{'a', 'b', 'c'}));
        map.put(3, Arrays.asList(new Character[]{'d', 'e', 'f'}));
        map.put(4, Arrays.asList(new Character[]{'g', 'h', 'i'}));
        map.put(5, Arrays.asList(new Character[]{'j', 'k', 'l'}));
        map.put(6, Arrays.asList(new Character[]{'m', 'n', 'o'}));
        map.put(7, Arrays.asList(new Character[]{'p', 'q', 'r', 's'}));
        map.put(8, Arrays.asList(new Character[]{'t', 'u', 'v'}));
        map.put(9, Arrays.asList(new Character[]{'w', 'x', 'y', 'z'}));

        List<List<Character>> digits = new ArrayList<>();

        for (int i = 0; i < number.length(); i++) {
            int d = Integer.parseInt(String.valueOf(number.charAt(i)));
            digits.add(i, map.get(d));
        }
        List<String> combination= new ArrayList<>();
        LetterCombination(0,0,"",digits, combination);

        for (int i=0; i<combination.size(); i++)
            System.out.println(combination.get(i)+ ", ");
    }

    public static void LetterCombination(int row, int col , String strInter,List<List<Character>> digits, List<String> combination) {

        if (strInter.length() == digits.size()) {
            combination.add(strInter);
            return; // Backtrack
        }

        while(row<digits.size() && col< digits.get(row).size()) {
            strInter+=digits.get(row).get(col) ;
            LetterCombination(row+1, col,strInter,digits, combination);

            //strInter=strInter.substring (0, strInter.length() - 1);

            LetterCombination(row, col+1,"",digits, combination);

        }
    }



     /*   List<String> result=  letterCombinations("23");

        for (int i=0; i<result.size();i++)
        {
            System.out.println(result.get(i));
        } */
    }
/*


    private static String getString(char ch)
    {
        switch (ch){
            case '2': return "abc";
            case '3': return "def";
        }
        return "";
    }
    public static List<String> letterCombinations(String digits) {

        List<String> tmplist= new ArrayList<String>();
        int maxLength=0;
        for(int i=0; i<digits.length();i++)
        {
            String str =getString(digits.charAt(i));
            tmplist.add(str);
            maxLength=Math.max(maxLength, str.length());
       }
        Collections.sort(tmplist);
        int len=0;
        while(len<maxLength)
        {
            int k=0;
            String partialStr="";

            len++;
        }

        return result;
    }

    public void backtrack(String partialStr, int charPos)
    {
        int k=1;
        while(k<tmplist.size())
        {
            partialStr += tmplist.get(k).charAt(charPos);
            k++;
        }
        result.add(partialStr);
    } */


