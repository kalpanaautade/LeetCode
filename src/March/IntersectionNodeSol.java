package March;

import java.util.ArrayList;
import java.util.List;

public class IntersectionNodeSol {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode Atmp= headA;
        ListNode Btmp=headB;

        List<ListNode>  ALst= new ArrayList<ListNode>();
        while(headA!=null)
        {
            ALst.add(headA);
            headA=headA.next;
        }

        while(headB!=null)
        {
            if(ALst.contains(headB))
                return  headB;
            headB=headB.next;
        }
    return null;

    }

    public static void main(String[] args) {

        ListNode node0= new ListNode(7);
        ListNode node1= new ListNode(6, node0);
        ListNode node2= new ListNode(5, node1);
        ListNode node3= new ListNode(4, node2);
        ListNode node4= new ListNode(3, node3);
        ListNode node5= new ListNode(2, node4);
        ListNode node6= new ListNode(1, node5);
        ListNode node7= new ListNode(0, node6);

        ListNode nodes0= new ListNode(00,node2 );
        ListNode nodes1= new ListNode(11, nodes0);
        ListNode nodes2= new ListNode(22, nodes1);
        ListNode nodes3= new ListNode(33, nodes2);
        ListNode nodes4= new ListNode(44, nodes3);

        ListNode result=  getIntersectionNode(nodes4,node7);

        System.out.println("Result:"+result.val);

    }
}
