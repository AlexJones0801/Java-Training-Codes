package Problems;

import java.util.HashMap;

public class anagramEx {

    // Check if a given Strings or numbers is aanagram or no
    public static void main(String[] args) {
        String str = "hello", str2 = "ollhe";

        HashMap<Character, Integer> map = new HashMap<>();

        if (str.length() == str2.length()) {
            for (char c : str.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            for (char c : str2.toCharArray()) {
                if (!map.containsKey(c) || map.get(c)==0) {
                    System.out.println("Not an anagram");
                    return;
                }
                map.put(c,map.get(c)-1);
            }

            // After the loop, check if all counts are zero 
            for(int count : map.values()){
                if (count != 0) {
                    System.out.println("Not an anagram");
                    return;
                }
            }
            System.out.println("Anagram");
        } else {
            System.out.println("Not an anagram");
        }
    }
}
