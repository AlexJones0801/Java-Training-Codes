package CFW2;

import java.util.HashMap;

public class Practice_WordFreCount {
    public static void main(String[] args) {
        String str = "programming is fun and programming is good";
        HashMap<String, Integer> map = new HashMap<>();

        String[] str2 = str.split(" "); // Converting String to String Array
        // System.out.println(str2[2]);
        for (String su : str2) {
            map.put(su, map.getOrDefault(su, 0) + 1);
        }
        System.out.println(map);

    }
}
