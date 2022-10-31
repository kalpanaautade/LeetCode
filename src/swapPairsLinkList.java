public class swapPairsLinkList {

    public static void main(String[] args) {
        ListNode nod= new ListNode(9);
        ListNode node= new ListNode(7, nod);
        ListNode node0= new ListNode(6, node);
        ListNode node1= new ListNode(2, node0);
        ListNode node2= new ListNode(1, node1);
        ListNode node3= new ListNode(0, node2);

        ListNode result= swapPairs(node3);

        System.out.print(" Result  : ");
        while (result!=null)
        {
            System.out.print(result.val + " -> ");
            result=result.next;
        }

    }
    public static ListNode swapPairs(ListNode head) {

        ListNode start=head;
        ListNode prev=null;

        while(head!=null)
        {
            ListNode temp1 = head.next;
            ListNode temp2 = head.next.next;
            ListNode temp3 = head;
            if(prev==null)
                start=temp1;
            else
                prev.next=head.next;
            head = head.next;
            head.next=temp3;
            head.next.next=temp2;
            prev=temp3;
            head=temp2;
        }
        return start;
    }
}
