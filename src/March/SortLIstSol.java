package March;

public class SortLIstSol {

    public static void main(String[] args) {
        ListNode node0= new ListNode(18);
        ListNode node1= new ListNode(0, node0);
        ListNode node2= new ListNode(9, node1);
        ListNode node3= new ListNode(10, node2);
        ListNode node4= new ListNode(4, node3);
        ListNode node5= new ListNode(7, node4);
        ListNode node6= new ListNode(2, node5);
        ListNode node7= new ListNode(11, node6);

        ListNode result=  sortList(node7);

        while (result!=null)
        {
            System.out.print(result.val + " -> ");
            result=result.next;
        }

    }
    public static ListNode sortList(ListNode head) {

        if (head==null || head.next==null)
            return head;
        ListNode mid=getmid(head);
        ListNode left=sortList(head);
        ListNode right=sortList(mid);
        return merge(left,right);
    }

    public static ListNode getmid(ListNode head)
    {
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;

    }

public static ListNode merge(ListNode left, ListNode right)
{
    ListNode dummyhead= new ListNode();
    ListNode tmpList=dummyhead;
    while(left!=null && right!=null) {
        if (right.val < left.val) {
            tmpList.next = right;
            right = right.next;
            tmpList = tmpList.next;
        } else {
            tmpList.next = left;
            left = left.next;
            tmpList = tmpList.next;
        }
    }
    tmpList.next= (left==null) ? right :left;
    return dummyhead.next;
}


}
