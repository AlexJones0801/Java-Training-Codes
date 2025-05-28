package CFW2;

import java.util.HashMap;

public class Practice_HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("id0", 23);
        map.put("id1", 61);
        map.put("id2", 33);
        map.forEach((key, value) -> { // For printing every key + value
            System.out.println("Key " + key + " + " + "value " + value);
        });

        System.out.println(map);
        System.out.println(map.get("id2"));
        System.out.println(map.getOrDefault("id8", 5)); // Check if the id is present or not and if not it will print default
        System.out.println(map.keySet());
    }
}
