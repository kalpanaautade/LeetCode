import java.util.HashSet;
import java.util.Set;

public class IntersectionTwolists {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB)
    {
        Set<ListNode> lst = new HashSet<ListNode>() ;
        while(headA!=null)
        {     lst.add(headA);
            headA=headA.next;

        }

        while(headB!=null)
        {
            if (lst.contains(headB))
                return headB;
            else
            {
                headB=headB.next;
            }
        }

        return null;
    }
    public static void main(String[] args) {

        ListNode node5= new ListNode(5);
        ListNode node4= new ListNode(4, node5);
        ListNode node3= new ListNode(3, node4);
        ListNode node2= new ListNode(2, node3);
        ListNode node1= new ListNode(1, node2);

        ListNode List23= new ListNode(33, node4);
        ListNode List22= new ListNode(22, List23);
        ListNode List21= new ListNode(11, List22);

        ListNode List=   getIntersectionNode(List21,node1);
        if (List!=null)
        {
            System.out.println("Intersection Node Value : "+List.val);
        }

    }
}
