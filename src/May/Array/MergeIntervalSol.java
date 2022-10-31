package May.Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class MergeIntervalSol {
    class mycomparator implements Comparator<int[]>
    {
        public int compare(int[] a , int[] b)
        {
            return a[0]- b[0];
        }
    }
    public int[][] merge(int[][] intervals)
    {
        Arrays.sort(intervals, new mycomparator());
        int i=0;
        LinkedList<int[]> mergelst = new LinkedList<>();
        while(i<intervals.length)
        {
            if(mergelst==null)
                mergelst.add(intervals[i]);
            else if (intervals[i][0]<= mergelst.getLast()[1])
                mergelst.getLast()[1]=intervals[i][1];
            else
                mergelst.add(intervals[i]);

            i++;
        }
        return mergelst.toArray(new int[0][0]);
    }
    public static void main(String[] args) {

    }
}
