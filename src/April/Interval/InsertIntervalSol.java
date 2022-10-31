package April.Interval;

import java.util.ArrayList;

public class InsertIntervalSol {

    public static int[][] insert(int[][] intervals, int[] newInterval) {

        ArrayList<int[]> output = new ArrayList<int[]>();
        int n=intervals.length;
        int newstart=newInterval[0];
        int newend= newInterval[1];
        int idx=0;
        while(idx< n && intervals[idx][1]<newstart)
        {
            output.add(intervals[idx]);
            idx++;
        }
        while(idx< n && intervals[idx][0]<=newend )
        {
            newstart= Math.min(newstart, intervals[idx][0]);
            newend = Math.max(newend, intervals[idx][1]);
            idx++;
        }
        output.add(new int[]{newstart, newend});

        while(idx< n)
            output.add(intervals[idx++]);

        return output.toArray(new int[0][0]);
    }

    public static void main(String[] args) {

        int[][] intervals = {{1,3},{6,9}};
        int[] newInterval = {2,5};
        int[][] output=  insert(intervals,newInterval );

        for (int i =0; i <output.length; i++)
            System.out.println(" ["+ output[i][0] + ","+output[i][1] +"] ");

    }
}
