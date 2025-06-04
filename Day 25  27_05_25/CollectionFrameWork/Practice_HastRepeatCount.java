package CollectionFrameWork;

import java.util.HashMap;

public class Practice_HastRepeatCount {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 4, 5, 6, 6, 7 };

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num,map.getOrDefault(num,0) + 1);
        }
        
        for (int key : map.keySet()) {
         System.out.println(key + ": " + map.get(key));   
        }
    }
}