package December.LinkList;

public class deleteMiddleNode {

    public static ListNode deleteMiddle(ListNode head) {

        if (head==null)
            return null;

        ListNode slow_ptr= head;
        ListNode Fast_ptr= head;

        ListNode prev=null;
        while(Fast_ptr!=null && Fast_ptr.next!=null)
        {
            Fast_ptr= Fast_ptr.next.next;
            prev=slow_ptr;
            slow_ptr=slow_ptr.next;

        }

        prev.next=slow_ptr.next;

        return head;
    }
    public static void main(String[] args) {

        ListNode node5= new ListNode(1);
        ListNode node4= new ListNode(2, node5);
        ListNode node3= new ListNode(3, node4);
        ListNode node2= new ListNode(2, node3);
        ListNode node1= new ListNode(1, node2);

        ListNode result=deleteMiddle(node1);

        while (result!=null)
        {
            System.out.print(result.val + " -> ");
            result=result.next;
        }


    }
}
