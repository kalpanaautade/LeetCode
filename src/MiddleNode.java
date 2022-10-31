import java.util.ArrayList;
import java.util.List;

public class MiddleNode {

    public static void main(String[] args) {

        ListNode node6= new ListNode(5);
        //ListNode node5= new ListNode(4, node6);
        ListNode node4= new ListNode(3, node6);
        ListNode node3= new ListNode(2, node4);
        ListNode node2= new ListNode(1, node3);
        ListNode node1= new ListNode(0, node2);

        ListNode result= middleNode(node1);

        if (result!=null)
        {
            System.out.print(result.val + " -> ");

        }

    }
    public static ListNode middleNode(ListNode head) {

        List<ListNode> lst = new ArrayList<ListNode>();

        while(head!=null)
        {
            lst.add(head);
            head=head.next;

        }
        int len= lst.size()/2;
//        if( lst.size()%2==0)
  //          len++;

        return lst.get(len);

    }
}
