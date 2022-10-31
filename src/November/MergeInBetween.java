package November;

public class MergeInBetween {

    public static void main(String[] args) {
        ListNode node0= new ListNode(7);
        ListNode node1= new ListNode(6, node0);
        ListNode node2= new ListNode(5, node1);
        ListNode node3= new ListNode(4, node2);
        ListNode node4= new ListNode(3, node3);
        ListNode node5= new ListNode(2, node4);
        ListNode node6= new ListNode(1, node5);
        ListNode node7= new ListNode(0, node6);

        ListNode nodes0= new ListNode(00);
        ListNode nodes1= new ListNode(11, nodes0);
        ListNode nodes2= new ListNode(22, nodes1);
        ListNode nodes3= new ListNode(33, nodes2);
        ListNode nodes4= new ListNode(44, nodes3);

        ListNode result= mergeInBetween(node7,3, 5, nodes4);

        while (result!=null)
        {
            System.out.print(result.val + " -> ");
            result=result.next;
        }

    }
    public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode start=list1;
        ListNode firstnode=null, secondnode=null,  finalnode=null;;
        int count=0;

        while(list1.next!=null) {
            count++;
            if (count == a) {
                firstnode = list1;

            }
            if (b == count) {
                secondnode = list1;
                break;
            }
            list1 = list1.next;
        }
            if (firstnode!=null)
             firstnode.next=list2;
            while(list2.next!=null) {
                list2=list2.next;
            }


        list2.next=secondnode;
        return start;
        }

 }

