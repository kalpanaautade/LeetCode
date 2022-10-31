public class removeLinkListElements {

    public static ListNode removeElements(ListNode head, int val) {
        ListNode newhead=head;
        ListNode prev=null;
        while(head!=null)
        {
            if(head.val==val)
            {
                if (prev==null)
                    newhead = head;
                else
                    prev.next=head.next;
            }
            else
                prev=head;
            head=head.next;
        }
        return newhead;
    }

    public static void main(String[] args) {

        ListNode node5= new ListNode(4);
        ListNode node4= new ListNode(2, node5);
        ListNode node3= new ListNode(3, node4);
        ListNode node2= new ListNode(2, node3);
        ListNode node1= new ListNode(1, node2);

        ListNode result= removeElements(node1,2);

        while (result!=null)
        {
            System.out.print(result.val + " -> ");
            result=result.next;
        }
    }
}
