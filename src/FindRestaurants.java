import java.util.*;

public class FindRestaurants {

    public static  String[] findRestaurant(String[] list1, String[] list2) {

        String[] result = new String[list1.length];
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < list1.length; i++)
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    map.putIfAbsent(list1[i], i + j);
                    break;
                }
            }

        int k=0;
        int minValueInMap = (Collections.min(map.values()));  // This will return max value in the Hashmap
        for (Map.Entry<String, Integer> entry : map.entrySet()) {  // Itrate through hashmap
            if (entry.getValue() == minValueInMap) {
                System.out.println(entry.getKey());     // Print the key with max value
                result[k]=entry.getKey();
                k++;
            }

        }
        return result;
    }
    public static void main(String[] args) {

        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"KFC","Shogun","Burger King"};

        findRestaurant(list1 , list2);

    }
}
