package March;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class TreeLevelOrderSol {
    public static void main(String[] args) {

        TreeNode TL1= new TreeNode(1);
        TreeNode TR1= new TreeNode(5);
        TreeNode T1 = new TreeNode(2, TL1,TR1);
        TreeNode TL2= new TreeNode(4);
        TreeNode TR2= new TreeNode(8);
        TreeNode T2= new TreeNode(6, TL2, TR2);
        TreeNode T3= new TreeNode(4, T1, T2);

        List<List<Integer>> levels= levelOrder(T3);

        for (int i=0; i<levels.size(); i++) {
            for (int j = 0; j < levels.get(i).size(); j++)
                System.out.print(levels.get(i).get(j) + ",");
            System.out.println( " ");
        }

    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level=1;
        List<Integer> nodelst= new ArrayList<>();
        nodelst.add(root.val);
        while(!q.isEmpty())
        {
            List<Integer> tmplst = new ArrayList<>();
            if (nodelst!=null) {
                levels.add(nodelst);
                for (Integer val : nodelst) {
                    TreeNode node = q.poll();
                    if (node.left != null) {
                        q.add(node.left);
                        tmplst.add(node.left.val);
                    }

                    if (node.right != null) {
                        q.add(node.right);
                        tmplst.add(node.right.val);
                    }
                }
            }
            if(tmplst!=null && tmplst.size()>0)
                nodelst=tmplst;
        }
        return levels;
    }
}
