package CFW2;

import java.util.TreeSet;

public class Practice_TreeSet2 {
    public static void main(String[] args) {
        int[] arr={14,2,44,2,5,66,66,7};


        // Stores unique values + in sorted manner
        TreeSet<Integer> ts = new TreeSet<>();

        for (Integer i : arr) {
         ts.add(i);   
        }
        System.out.println(ts);
    }
}
