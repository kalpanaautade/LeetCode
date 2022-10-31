package December.LinkList;

import java.util.Stack;

//Very Close to Output
public class reverseEvenGroups {

    public static ListNode reverseList(ListNode head, int grpCount ) {
        Stack<ListNode> stack = new Stack<ListNode>();
        while (grpCount>=1  &&  head!=null)
        {
            stack.push(head);
            head=head.next;
            grpCount--;
        }
        ListNode tmp= head;
        ListNode node=null;
        ListNode start=null;
        while(stack.isEmpty()==false)
        {
            if (node==null) {
                node=stack.pop();
                start =node;
            }
            else
              node.next=stack.pop();
        }
        node.next=tmp;
        return start;
    }

    public static ListNode reverseEvenLengthGroups(ListNode head) {
        int grpCount=1;
        int nodeCount=1;
        ListNode snode=head;
        ListNode Prev=null;
        while (snode!=null)
        {
            if (grpCount % 2 == 0) {
                Prev.next = reverseList(snode, grpCount);
                snode = Prev.next;
            }
                int c = 1;
                while (c <= grpCount && snode != null)
                {
                    c++;

                    Prev = snode;
                    snode = snode.next;
                }
                grpCount++;

            }

        return head;
    }

    public static void main(String[] args) {
        ListNode node6= new ListNode(1);
        ListNode node5= new ListNode(1, node6);
        ListNode node4= new ListNode(2, node5);
        ListNode node3= new ListNode(3, node4);
        ListNode node2= new ListNode(2, node3);
        ListNode node1= new ListNode(1, node2);

        ListNode result= reverseEvenLengthGroups(node1);
        while (result!=null)
        {
            System.out.print(result.val + " -> ");
            result=result.next;
        }
    }
}
