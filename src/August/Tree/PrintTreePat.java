package August.Tree;

public class PrintTreePat {

    public static void main(String[] args) {

        TreeNode TL1 = new TreeNode(1);
        TreeNode TR1 = new TreeNode(5);
        TreeNode T1 = new TreeNode(2, TL1, TR1);
        TreeNode TL2 = new TreeNode(4);
        TreeNode TR2 = new TreeNode(8);
        TreeNode T2 = new TreeNode(6, TL2, TR2);
        TreeNode T3 = new TreeNode(4, T1, T2);

        DFS(T3, 1, 4 ,"" );

    }
      /*  public String getDirections(TreeNode root, int startValue, int destValue) {

        } */
    public static String res=null;
        public static void  DFS(TreeNode curr, int startValue, int destValue , String  direction)
        {
            if (curr==null)
                return ;
            if(curr.val==startValue ) {
                res="";
                return ;
            }
                   // ||curr.val==destValue  )

         if (res!=null)
         {
             res=res + direction;
         }

            direction="L";

         DFS( curr.left, startValue, destValue ,"L");
         DFS( curr.right,  startValue, destValue , "R");
         direction="U";

       System.out.println(res);



        }

}
