package April.Interval;

import java.util.PriorityQueue;

public class MeetingRoomsIISol {


    public static int minMeetingRooms(int[][] intervals) {
        PriorityQueue<Integer> priorityQ= new PriorityQueue<Integer>();
        priorityQ.add(intervals[0][1]);
        int i=1;
        int room=1;
        while(!priorityQ.isEmpty() && i<intervals.length) {
            int top = priorityQ.peek();
            if (top > intervals[i][0]) {
                room++;
            } else
                priorityQ.poll();
            priorityQ.add(intervals[i][1]);
            i++;
        }
        return room;
    }
    public static void main(String[] args) {
       int[][] intervals = {{0,30},{5,10},{15,20}};
        int Result= minMeetingRooms(intervals);

        System.out.println("Result:"+ Result);
    }
}
