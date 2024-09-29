package Hashing;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 130);
        map.put("US", 30);
        map.put("China", 120);

        System.out.println(map);
        map.put("China", 125);
        System.out.println(map);

        if (map.containsKey("China")) {
            System.out.println("Key is present in the map");
        }
        else{
            System.out.println("Key is not present in the map");
        }

        System.out.println(map.get("China"));
        System.out.println(map.get("Indo"));
        
        int arr[] = {12, 15, 11};
        for(int val : arr){
            System.out.print(val+" ");
        }
        System.out.println();

        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key+" "+map.get(key));
        }

        map.remove("US");
        System.out.println(map);
    }
}