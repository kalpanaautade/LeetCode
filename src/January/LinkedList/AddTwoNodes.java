package January.LinkedList;



public class AddTwoNodes {

    public static void main(String[] args) {

        ListNode node5= new ListNode(3);
        ListNode node4= new ListNode(4, node5);
        ListNode node3= new ListNode(2, node4);

        ListNode node2= new ListNode(4);
        ListNode node1= new ListNode(6, node2);
        ListNode node0= new ListNode(5, node1);

        ListNode result=   addTwoNumbers(node3, node0);

        while (result!=null)
        {
            System.out.print(result.val + " -> ");
            result=result.next;
        }
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode iterator =null, start=new ListNode();
        int remainder=0;
        while(l1!=null || l2!=null)
        {
            int val=remainder;
            if (l1!=null)
                 val =val+l1.val;
            if (l2!=null)
                val=val + l2.val;

            if (String.valueOf(val).length() >1)
            {    remainder=val/10;
                val=val%10;
            }
            else
                remainder=0;

            if (iterator==null) {
                    iterator = new ListNode(val);
                    start=iterator;
                }
            else {
                    ListNode tmp = new ListNode(val);
                    iterator.next = tmp;
                    iterator=iterator.next;
            }
            if (l1!=null)
                l1=l1.next;
            if (l2!=null)
                l2=l2.next;
        }
        if (remainder>0)
        {
            ListNode tmp = new ListNode(remainder);
            iterator.next = tmp;
        }
        return start;
    }
}
