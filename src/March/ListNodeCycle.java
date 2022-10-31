package March;

import java.util.ArrayList;
import java.util.List;

public class ListNodeCycle {
    public static void main(String[] args) {
        ListNode node2=null;
        ListNode node0= new ListNode(7,node2);
        ListNode node1= new ListNode(6, node0);
         node2= new ListNode(5, node1);
        ListNode node3= new ListNode(4, node2);
        ListNode node4= new ListNode(3, node3);
        ListNode node5= new ListNode(2, node4);
        ListNode node6= new ListNode(1, node5);
        ListNode node7= new ListNode(0, node6);

      boolean isCycle=  hasCycle(node7);
    }
    public static boolean hasCycle(ListNode head) {

        ListNode slow =head;
        ListNode fast = head.next;
        while(slow!=fast)
        {
            if(slow==null || fast==null) return  false;
            slow=slow.next;
            fast=fast.next.next;
        }
        return  true;

    }
}
