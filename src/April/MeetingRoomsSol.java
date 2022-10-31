package April;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MeetingRoomsSol {

    public static int minMeetingRooms(int[][] intervals) {

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
        //(n1, n2)-> Math.max(n1,n2)
        int room=0;
        for(int i=0; i<intervals.length;i++ )
        {
            if (i>0)
            {
                int top = heap.peek();
                if(top>intervals[i][0])
                    room++;
                else
                    heap.poll();
            }
            else
                room++;
            heap.add(intervals[i][1]);
        }
        return room;
    }

    public static void main(String[] args) {
      //  int[][] intervals = {{0,30},{5,10},{15,20}};

        int[][] intervals = {{7,10},{2,4}};

       int Result= minMeetingRooms(intervals);

       System.out.println("Result:" + Result);
    }
}
