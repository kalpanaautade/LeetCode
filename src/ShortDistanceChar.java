import java.util.ArrayList;

public class ShortDistanceChar {

    public static   int[] shortestToChar(String s, char c)
    {
        int k=s.length();
        ArrayList<Integer> arr= new ArrayList<Integer>();
        int pos=0, min=0;
        for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == c) {
            arr.add(i);
        }
    }
        int[] chpos = arr.stream().mapToInt(Integer::intValue).toArray();

        int[] result=new int[k];
        for(int i=0; i<s.length(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                pos = Math.abs(i - chpos[j]);
                if ( j==0)
                    min = pos;
                if (pos < min)
                    min = pos;

            }
            result[i] = min;
        }
        return result;
    }

    public static void main(String[] args) {

       String s = "loveleetcode";
        char c = 'e';
        int[] result=  shortestToChar(s,c);
        for(int i=0; i<=s.length(); i++)
            System.out.print(result[i]+ " ");
    }
}
