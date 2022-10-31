package March;

public class ReorderLinkedList {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

        public static void reorderList(ListNode head) {

            ListNode slow=head;
            ListNode fast=head;

            while(fast!=null && fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;

            }

            ListNode dummy =head;
            while (head.next!=slow)
                head=head.next;
            head.next=null;
            head=dummy;

            ListNode head2=slow;
            slow=null;

            //reverse second list

            head2= reverseList(head2);

            dummy =head;
            //Copy Node
            while( head2!=null)
            {
                ListNode tmp= head.next;
                ListNode tmp2= head2.next;

                head.next =head2;
                head.next.next=tmp;
                head=tmp;

                head2=tmp2;

            }
            head= dummy;


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

    public static void main(String[] args) {

       // ListNode node2= new ListNode(5);
       // ListNode node3= new ListNode(4, node2);
        ListNode node4= new ListNode(3);
        ListNode node5= new ListNode(2, node4);
        ListNode node6= new ListNode(1, node5);
        ListNode node7= new ListNode(0, node6);

        reorderList(node7);

        while (node7!=null)
        {
            System.out.print(node7.val + " -> ");
            node7=node7.next;
        }

    }
}
