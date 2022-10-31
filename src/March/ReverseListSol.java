package March;

public class ReverseListSol {

    public static void main(String[] args) {

        ListNode node0= new ListNode(7);
        ListNode node1= new ListNode(6, node0);
        ListNode node2= new ListNode(5, node1);
        ListNode node3= new ListNode(4, node2);
        ListNode node4= new ListNode(3, node3);
        ListNode node5= new ListNode(2, node4);
        ListNode node6= new ListNode(1, node5);
        ListNode node7= new ListNode(0, node6);

        ListNode result= reverseList(node7);

        while (result!=null)
        {
            System.out.print(result.val + " -> ");
            result=result.next;
        }

    }
    public static  ListNode reverseList(ListNode current) {

        ListNode newstart=current;

        while(current.next!=null)
        {
            ListNode tmp2=current.next.next;

            ListNode tmpnode=current.next;
            tmpnode.next=newstart;
            newstart=tmpnode;

            current.next=tmp2;
        }
        return newstart;
    }
}
