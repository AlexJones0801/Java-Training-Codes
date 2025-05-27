package CollectionFrameWork;

import java.util.HashSet;

public class Practice_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(5);
        hs.add(5);
        hs.add(6);

        System.out.println(hs);

        int[] arr={1,2,3,4,4,5,6,6,7};

        for(int i=0;i<arr.length;i++) {
            hs.add(arr[i]);
        }

        System.out.println(hs);
    }
}
