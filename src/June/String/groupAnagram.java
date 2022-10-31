package June.String;

import java.util.*;

public class groupAnagram {

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (int i=0; i<strs.length; i++)
        {
            String key=getAnagramKey(strs[i]);
            if (!map.containsKey(key))
                map.put(key, new ArrayList<String>());
            map.get(key).add(strs[i]);
        }
        return new ArrayList(map.values());

    }


    public static String getAnagramKey(String s)
    {
        char[] chr= new char[s.length()];
        chr=s.toCharArray();
        Arrays.sort(chr);
        return String.valueOf(chr);

    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result=groupAnagrams(strs);

        System.out.println(result);

    }
}
