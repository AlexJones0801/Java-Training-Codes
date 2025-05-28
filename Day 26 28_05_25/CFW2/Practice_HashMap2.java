package CFW2;

import java.util.HashMap;

// Q input str="programming" and we to find output like p=1,r=2,o=1 and so on

public class Practice_HashMap2 {

    public static void main(String[] args) {
        String str = "programming";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);
    }
}