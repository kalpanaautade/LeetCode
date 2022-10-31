package April;

import java.util.HashMap;
import java.util.Map;

public class HashMapSol {


        static HashMap<String, String> result= new HashMap<String, String>();
        static String key="";

    static void flattenvalue(HashMap<String, Object> dict , String KeyPrefix) {
        for( Map.Entry pair: dict.entrySet())
        {
            if(pair.getValue() instanceof String) {
                    result.put(KeyPrefix + pair.getKey(), (String) pair.getValue());
            }
            else {
                flattenvalue((HashMap<String, Object>) pair.getValue(), (String) pair.getKey() +".");
            }
        }
    }
        static HashMap<String, String> flattenDictionary(HashMap<String, Object> dict) {
            // your code goes here
            flattenvalue(dict, "");
            return result;
        }

        public static void main(String[] args) {

            HashMap<String, Object> main= new HashMap<>();
            HashMap<String, String> child= new HashMap<>();
            child.put("a","1234");
            child.put("b","4567");
            main.put("Key1", "abc");
            main.put("Key2" , child);
            HashMap<String, String> result= flattenDictionary(main);


        }

    }




