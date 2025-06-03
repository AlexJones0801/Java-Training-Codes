package CFW2;

import java.util.HashMap;

public class Practice_FNonRepeatingCh {
    public static void main(String[] args) {
        String str = "programming"; // Print first non repeating Character
        HashMap<Character, Integer> map = new HashMap<>();


        // Count frequency of each character
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);
        for(char c : str.toCharArray()) {
            if(map.get(c) == 1) {
                System.out.println("First non-repeating Character: "+ c);
                break;
            }
        }

    }
}
