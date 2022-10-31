package July.Recursion;

public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {
        if (head.next ==null)
            return head ;




        ListNode newhead= reverseList(head.next) ;
        head.next.next=head;
        head.next=null;


        return newhead;
    }


    public static void main(String[] args) {


        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(4, node2);
        ListNode node4 = new ListNode(3, node3);
        ListNode node5 = new ListNode(2, node4);
        ListNode node6 = new ListNode(1, node5);
        ListNode node7 = new ListNode(0, node6);

        ListNode result = reverseList(node7);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }

    }

}
