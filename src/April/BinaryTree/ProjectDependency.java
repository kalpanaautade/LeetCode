package April.BinaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProjectDependency {

    public static void main(String[] args) {
        HashMap<Integer, List<Integer>> courselst= new HashMap<Integer, List<Integer>>();
        List<Integer> nlst= new ArrayList<>();
        courselst.put(1, nlst);

        nlst= new ArrayList<>();
        nlst.add(1);
        nlst.add(4);
        courselst.put(2, nlst);

        nlst= new ArrayList<>();
        nlst.add(1);
        nlst.add(2);
        courselst.put(3, nlst);

        nlst= new ArrayList<>();
        nlst.add(1);
        courselst.put(4, nlst);

        List<Integer> visited= canFinish(courselst, 4);


        for (int course = 0; course < 4; course++)
            System.out.println(visited.get(course) + ", ");
    }

    public static List<Integer>  canFinish( HashMap<Integer, List<Integer>> courselst, int numCourses) {

        boolean[] path = new boolean[numCourses];
        List<Integer> visited= new ArrayList<>();

        for (int course = 1; course <= numCourses; course++) {
           isCycle(courselst, course, path, visited);
        }

        for (int course = 0; course < visited.size(); course++)
            System.out.println(visited.get(course) +", ");

        return visited;
    }
    public static boolean isCycle(HashMap<Integer, List<Integer>> courselst, int course, boolean[] path, List<Integer> visited)
    {
        if (visited.contains(course))
            return true;

        if (!courselst.containsKey(course))
            return false;

        boolean flag = false;

        if (courselst.get(course).size()>0) {
            for (Integer num : courselst.get(course)) {
                isCycle(courselst, num, path, visited);
                if (!visited.contains(course))
                    visited.add(course);
            }
        }
        else
            visited.add(course);

        return flag;
    }
}

