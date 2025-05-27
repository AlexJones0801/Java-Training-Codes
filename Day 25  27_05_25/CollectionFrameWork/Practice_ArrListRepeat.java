package CollectionFrameWork;

import java.util.HashSet;

public class Practice_ArrListRepeat {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 4, 5, 6, 6, 7 };

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(i)) {
                System.out.println(arr[i]);
            } else {
                set.add(arr[i]);
            }
        }
    }
}
