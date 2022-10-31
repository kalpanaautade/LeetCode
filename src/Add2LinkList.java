public class Add2LinkList {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        String s1= new String();
        while (l1!=null)
        {
            s1= Integer.toString(l1.val)+s1;
            l1=l1.next;        }

        String s2= new String();
        while (l2!=null)
        {
            s2= Integer.toString(l2.val) +s2;
            l2=l2.next;        }

        Integer N1= Integer.parseInt(s1);
        Integer N2= Integer.parseInt(s2);
        Integer N3=N1+N2;

        ListNode curr=null;
        ListNode start=null;
        while(N3!=0)
        {
            int mod= N3 % 10;
            N3=N3 /10;

            if (curr==null)
            {
                curr=new ListNode(mod);
                start=curr;
            }
            else
            {
                curr.next=new ListNode(mod);
                curr=curr.next;
            }
        }
        return start;
    }
    public static void main(String[] args) {

        ListNode node= new ListNode(3);
        ListNode node1= new ListNode(4, node);
        ListNode node2= new ListNode(2, node1);

        ListNode nodes= new ListNode(4);
        ListNode nodes1= new ListNode(6, nodes);
        ListNode nodes2= new ListNode(5, nodes1);

        ListNode L3= addTwoNumbers(node2,nodes2);

        System.out.print(" L3  : ");
        while (L3!=null)
        {
            System.out.print(L3.val + " -> ");
            L3=L3.next;
        }

    }
}
