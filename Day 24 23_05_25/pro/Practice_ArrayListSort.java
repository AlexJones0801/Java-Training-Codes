package pro;

import java.util.ArrayList;
import java.util.Collections;

public class Practice_ArrayListSort {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();

        arr.add("a");
        arr.add("b");
        arr.add("A");
        arr.add("E");
        arr.add("D");
        arr.add("B");

        Collections.sort(arr);
        System.out.println(arr);

        // for(int i = 0; i <arr.size()-1;i++) {
        //     System.out.println(arr.get(i));
        // }
    }
}
