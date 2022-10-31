package July;

   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class Partition {
    public ListNode partition(ListNode head, int x) {
        ListNode prevNode=head;
        ListNode lastLesserNode=null;
        ListNode start=null;
        while( head!=null)
        {
           if(head.val <x )
            {
                if(lastLesserNode==null)
                {   lastLesserNode=head;
                    lastLesserNode.next=head.next;
                    if (start==null)
                    start=lastLesserNode;
                }
                else
                {
                ListNode tmp=head.next;
                head.next=lastLesserNode.next;
                lastLesserNode.next=head;
                lastLesserNode=head;
                prevNode.next=tmp;}
            }
            else {

               prevNode = head;
                head=head.next;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        ListNode node5= new ListNode(1);
        ListNode node4= new ListNode(2, node5);
        ListNode node3= new ListNode(3, node4);
        ListNode node2= new ListNode(2, node3);
        ListNode node1= new ListNode(1, node2);


    }
}
