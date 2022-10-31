package April;

public class Graph {
    class Solution {
        public int networkDelayTime(int[][] times, int n, int k) {
            int sum=0;
            for(int i=0; i<times.length; i++)
            {
                if (times[i][0]==k)
                    sum += times[i][2];
            }
            if (sum==0)
                return -1;
            else
                return sum;
        }
    }

    public static void main(String[] args) {

    }
}
