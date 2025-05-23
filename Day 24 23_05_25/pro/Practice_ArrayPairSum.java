package pro;

import java.util.ArrayList;
import java.util.Collections;

public class Practice_ArrayPairSum {
    public static void main(String[] args) {
        // int[] arr = {-4,6,0,-7,3,4,-8};
        // Find the sum of pairs of elements present in the array
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(-4);
        arr.add(6);
        arr.add(0);
        arr.add(-7);
        arr.add(3);
        arr.add(4);
        arr.add(-8);

        Collections.sort(arr);
        System.out.println(arr);

        // Efficient: Maximum pair sum is the sum of the two largest elements
        int n = arr.size();
        int maxPairSum = arr.get(n - 1) + arr.get(n - 2);

        System.out.println("[" + arr.get(n - 2) + ", " + arr.get(n - 1) + "]");
        System.out.println("Maximum pair sum: " + maxPairSum);
    }
}
