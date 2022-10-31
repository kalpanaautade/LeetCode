package July.Recursion;

import java.util.ArrayList;
import java.util.List;

public class PartitionInKSets {


    public static void partition(int n , int k, int level , List<List<Integer>> existingset)
    {
        if (level >n)
        {
            System.out.println(existingset);
            System.out.println("-----------");
            return;
        }

        for(int j=0 ; j< existingset.size() ; j++)
            if (existingset.get(j).size()>0)
            { existingset.get(j).add(level);
                partition( n , k, level+1 , existingset); }
            else
            {
                existingset.get(j).add(level);
                partition( n , k, level+1 , existingset);
                break;
            }

    }
    public static void main(String[] args) {
        List<List<Integer>> ans= new ArrayList<>();
        int n=4;
        int k=3;
        for( int i=0; i<k; i++) {
            List<Integer> lst = new ArrayList<>();
            ans.add(lst);
        }

        partition( n , k, 1 ,ans);

    }
}
