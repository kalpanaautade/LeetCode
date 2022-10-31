import java.util.List;

public class deleteDuplicateFromList {

    public static ListNode deleteDuplicate(ListNode head)
    {
        ListNode start=head;
        while(head.next!=null)
        {
            if (head.val< head.next.val)
                head=head.next;
            else if(head.val == head.next.val)
            {
                ListNode tmp = head.next.next;
                head.next=null;
                head.next=tmp;
                head=head.next;
            }

        }
        return start;
    }
    public static void main(String[] args) {

        ListNode node5= new ListNode(4);
        ListNode node4= new ListNode(2, node5);
        ListNode node3= new ListNode(2, node4);
        ListNode node2= new ListNode(1, node3);
        ListNode node1= new ListNode(1, node2);

     ListNode result=  deleteDuplicate(node1);

        while (result!=null)
        {
            System.out.print(result.val + " -> ");
            result=result.next;
        }
    }
}
