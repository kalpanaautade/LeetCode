package March;

import java.util.HashMap;

public class RandomPointerLinkedList {
    public static RandomNode copyRandomList(RandomNode head) {
        RandomNode original = head;
        while (original != null) {
            RandomNode clone = new RandomNode(original.val);
            clone.next = original.next;
            original.next = clone;
            original = clone.next;
        }
        original = head;
        while (original != null)
        {
            if(original.random!=null)
             original.next.random=original.random.next;
            else
                original.next.random=null;
            original=original.next.next;
        }
        original = head;
        RandomNode clone=new RandomNode(-1);
        RandomNode dummy=clone;
        while (original != null)
        {
            clone.next=original.next;
            clone=clone.next;
            original.next=original.next.next;
            original=original.next;
        }

        return dummy.next;
    }
    public static void main(String[] args) {



        RandomNode node3= new RandomNode(3, null);
        RandomNode node2= new RandomNode(2, node3);
        RandomNode node1= new RandomNode(1, node2);
        RandomNode node0= new RandomNode(0, node1);

        node0.random=node2;
        node1.random=null;
        node2.random=node1;
        node3.random=node0;
        RandomNode result=  copyRandomList(node0);

      while(result!=null)
      {
          System.out.println(result.val + ", ");
          result=result.next;
      }
    }
}
