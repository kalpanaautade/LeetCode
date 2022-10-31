public class ReverseLLSol {

    static class LinkedList
    {
        int val;
        LinkedList next;

        public  LinkedList(int val)
        {
            this.val = val;
        }
        public LinkedList(int val, LinkedList next) {
            this.val = val;
            this.next = next;
        }
    }

    public static LinkedList ReverseLL(LinkedList head)
    {

        if ( head.next==null)
            return head;

        LinkedList prev= head;

        LinkedList newnode= ReverseLL( head.next);
        head.next.next=
        newnode.next=prev;
        prev.next=null;


        return newnode;
    }

    public static void main(String[] args) {

        LinkedList l3= new LinkedList(30);
        LinkedList l2= new LinkedList(20,l3);
        LinkedList l1= new LinkedList(10, l2);

        LinkedList newhead= ReverseLL(l1);

        while(newhead!=null)
        {
            System.out.println(newhead.val);
            newhead=newhead.next;

        }


    }
}
