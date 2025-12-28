package in.map;

import java.util.HashMap;
import java.util.Map;

public class TestingMaps {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Partha", 84);
        map.put("Patrick", 55);
        map.put("David", 33);
        map.put("Bob", 0);
        System.out.println(map.size());
        System.out.println(map.get("Partha"));
        System.out.println(map.get("Patrick"));
        System.out.println(map.containsValue(84));
        System.out.println(map.containsKey("Ram"));
        System.out.println(map.containsKey("Bob"));
        System.out.println(map.remove("David"));
        System.out.println(map.size());

        for (String key : map.keySet()) {
            System.out.printf("%s : %s\n", key, map.get(key));
        }
    }
}
