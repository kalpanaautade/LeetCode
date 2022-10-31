public class LinkedListPalindrom{

    public static boolean isPalindrome(ListNode start, ListNode head) {

        while(head!=null)
            isPalindrome(start,head.next);
        if (start.val!=head.val)
            return false;
        else
            start=start.next;
        return true;


    }

    public static void main(String[] args) {

        ListNode node5= new ListNode(1);
        ListNode node4= new ListNode(2, node5);
        ListNode node3= new ListNode(3, node4);
        ListNode node2= new ListNode(2, node3);
        ListNode node1= new ListNode(1, node2);


        boolean  result = isPalindrome(node1,node1);

        System.out.println(" Result:"+result);
    }



}
