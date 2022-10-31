

public class MergeSortedLinkedList {

    public static void main(String[] args) {

        ListNode node= new ListNode(4);
        ListNode node1= new ListNode(2, node);
        ListNode node2= new ListNode(1, node1);

        ListNode nodes= new ListNode(4);
        ListNode nodes1= new ListNode(3, nodes);
        ListNode nodes2= new ListNode(0, nodes1);
       /* System.out.print(" List1  : ");
        while (node2!=null)
        {
            System.out.print(node2.val + " -> ");
            node2=node2.next;
        }
        System.out.println(" List2 : ");
        while (nodes2!=null)
        {
            System.out.print(nodes2.val + " -> ");
            nodes2=nodes2.next;
        }*/

       ListNode result=mergeTwoListsMethod2(node2, nodes2);
        while (result!=null)
        {
            System.out.print(result.val + " -> ");
            result=result.next;
        }
    }
    public static ListNode mergeTwoListsMethod2(ListNode l1, ListNode l2)
    {
        ListNode dummyhead= new ListNode();
        ListNode tmpList=dummyhead;
        while(l1!=null && l2!=null) {
            if (l2.val < l1.val) {
                tmpList.next = l2;
                l2 = l2.next;
                tmpList = tmpList.next;
            } else {
                tmpList.next = l1;
                l1 = l1.next;
                tmpList = tmpList.next;
            }
        }
        tmpList.next= (l1==null) ? l2 :l1;
        return dummyhead.next;
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode l1current=l1;
        ListNode l2current= l2;
        ListNode l1prev=null;

        ListNode l1temp=null;
        ListNode l2temp= null;

        while ( l2current !=null )
        {
            if( l2current.val<=  l1current.val)
            {
                if(l1prev==null)
                {
                    l1=l2.next;
                    l1.next=l1current;
                    l1temp=l1current.next;
                    l2temp=l2current.next;
                    l1prev=l1current;
                }
                else
                {
                    l1temp=l1current.next;
                    l2temp=l2current.next;
                    l1prev.next=l2current;
                    l2current.next=l1temp;

                }
                l2current=l2temp;
                l1current=l1temp;
            }
            else
            {
                l1current = l1current.next;
            }

        }
        return l1;

    }


}
