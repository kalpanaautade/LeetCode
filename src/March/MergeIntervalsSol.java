package March;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MergeIntervalsSol {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> merged = new LinkedList<>();
        for ( int[] pair  : intervals)
        {
            if( merged.isEmpty() || merged.getLast()[1]< pair[0])
            {
                merged.add(pair);
            }
            else
            {
                merged.getLast()[1]=Math.max(merged.getLast()[1] ,pair[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);

    }
    public static void main(String[] args) {
        int[][]  intervals= {{1,3},{2,6},{8,10},{15,18}};
        int[][] result= merge(intervals);

        for(int i=0; i<result.length; i++)
        { for(int j=0; j<result[i].length;j++)
            System.out.print(result[i][j] + ", ");
            System.out.println("");
        }
    }
}
