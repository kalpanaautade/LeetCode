package December.LinkList;

import java.util.ArrayList;
import java.util.List;

public class nodesCriticalPoints {
    public static int[] nodesBetweenCriticalPoints(ListNode head) {

        int[] result= new int[2];
        int nodePos=1;
        ListNode prev=null;
        List<Integer> arr =new ArrayList<Integer>();
        while (head.next != null)
        {
            if(prev!=null) {
                if (head.val >prev.val && head.val > head.next.val )
                    arr.add(nodePos);
                if (head.val < prev.val && head.val < head.next.val )
                    arr.add(nodePos);
            }
            prev=head;
            nodePos++;
            head=head.next;

        }

        int mindist=Integer.MAX_VALUE;
        int maxdist=0;

        if(arr.size() >0) {
            for (int i = 0; i < arr.size(); i++) {
                for (int j = i + 1; j < arr.size(); j++) {
                    mindist = Math.min(mindist, arr.get(j) - arr.get(i));
                    maxdist = Math.max(maxdist, arr.get(j) - arr.get(i));
                }
            }
            result[0] = mindist;
            result[1] = maxdist;
        }

        if (mindist == Integer.MAX_VALUE || maxdist==0)
        {
            result[0] = -1;
            result[1] = -1;
        }

        System.out.println(" Min Distance :" +mindist);
        System.out.println(" Max Distance :" +maxdist);

        return result;
    }

    public static void main(String[] args) {

        ListNode node5= new ListNode(2);
        ListNode node4= new ListNode(1, node5);
        ListNode node3= new ListNode(5, node4);
        ListNode node2= new ListNode(2, node3);
        ListNode node1= new ListNode(1, node2);
        ListNode node0= new ListNode(3, node1);
        ListNode node= new ListNode(5, node0);

        nodesBetweenCriticalPoints(node);
    }
}
