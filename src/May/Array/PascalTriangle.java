package May.Array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    static List<List<Integer>> triangle = new ArrayList<List<Integer>>();

    public static List<Integer> getRow(int rowIndex) {
        // Base case; first row is always [1].
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        List<Integer> currlst=null;
        for (int i=1; i<=rowIndex; i++) {
            List<Integer> prevlst = triangle.get(i-1);
           currlst= new ArrayList<>();
            currlst.add(1);
            for (int j = 1; j<i; j++)
            {
                currlst.add(prevlst.get(j-1) + prevlst.get(j));
            }
            currlst.add(1);
            triangle.add(currlst);
        }
        return currlst;
    }
    public static void main(String[] args) {
        List<Integer> lst=  getRow(3);

        for(int i=0; i<lst.size();i++)
            System.out.println(lst.get(i));
    }
}
