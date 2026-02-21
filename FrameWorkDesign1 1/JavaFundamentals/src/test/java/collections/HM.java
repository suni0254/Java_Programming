package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HM {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Imran", 5);
        map.put("Narendra", 4);
        map.put("Sai", 9);
        map.put("Seenu", 15);
        map.put("Sai", 18);

        System.out.println(map.size());

        System.out.println(map.get("Sai"));

        map.replace("Sai", 18, 17);
        System.out.println(map.get("Sai"));

        if(map.containsKey("Datta")) {
            System.out.println("Contains Key");
        }
        else
            System.out.println("Does not Contains Key");

        for(Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.print(e.getKey() + " : ");
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet();

        for(String key : keys) {
            System.out.println(key + " : " + map.get(key));
        }

        map.remove("Sai");

        for(String key : keys) {
            System.out.println(key);
        }

    }
}
