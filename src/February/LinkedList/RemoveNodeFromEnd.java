package February.LinkedList;

public class RemoveNodeFromEnd {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int length  = 0;
        ListNode first = head;
        while (first != null) {
            length++;
            first = first.next;
        }
        length -= n;
        first = dummy;
        while (length > 0) {
            length--;
            first = first.next;
        }
        first.next = first.next.next;
        return dummy.next;

    }

    public static void main(String[] args) {

        // 1 --> 2 --> 3 --> 4 --> 5
        ListNode node2= new ListNode(5);
        ListNode node1= new ListNode(4, node2);
        ListNode node0= new ListNode(3, node1);
        ListNode node= new ListNode(2, node0);
        ListNode nod= new ListNode(1, node);

        ListNode result= removeNthFromEnd(nod, 3);

        while(result!=null)
        {
            System.out.print(" " + result.val + " --> " );
            result=result.next;
        }

    }
}
