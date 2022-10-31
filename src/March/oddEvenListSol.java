package March;

public class oddEvenListSol {
    
    public static void main(String[] args) {

        ListNode node0= new ListNode(8);
        ListNode node1= new ListNode(7, node0);
        ListNode node2= new ListNode(6, node1);
        ListNode node3= new ListNode(5, node2);
        ListNode node4= new ListNode(4, node3);
        ListNode node5= new ListNode(3, node4);
        ListNode node6= new ListNode(2, node5);
        ListNode node7= new ListNode(1, node6);

        ListNode result=oddEvenList(node7);

        while (result!=null)
        {
            System.out.print(result.val + " -> ");
            result=result.next;
        }

    }
    public static ListNode oddEvenList(ListNode head) {

        ListNode oddptr=head;
        ListNode evenptr=head.next;
        ListNode currentptr=evenptr;
        ListNode dummy=head;
        while (currentptr.next!=null)
        {
            ListNode tmp=currentptr.next.next;
            oddptr.next=currentptr.next;
            oddptr.next.next=evenptr;
            oddptr=oddptr.next;
            currentptr.next=tmp;
            currentptr=tmp;
        }
        
        return dummy;
    }
}
