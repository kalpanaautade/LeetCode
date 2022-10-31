package December.Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class KthLargestElement {

    public static int  KthLargestEle(int k, int[] num)
    {
        List<Integer> lst = new ArrayList<Integer>();

        lst=Arrays.stream(num).boxed().collect(Collectors.toList());
        lst.add(5);
        int Max=0;
        for(int i =0; i<k; i++) {
             Max=0;
            int Index=0;
            for (int j = 0; j < lst.size(); j++) {
                if (Max< lst.get(j)) {
                    Max = lst.get(j);
                    Index=j;
                }
            }
            lst.add(Index,-1);
        }
        return Max;
    }
    public static void main(String[] args) {

       int result= KthLargestEle(3, new int[]{4, 5, 8, 2, 3});

       System.out.println("Result :" + result);
    }
}
