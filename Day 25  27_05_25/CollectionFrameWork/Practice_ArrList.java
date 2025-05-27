package CollectionFrameWork;

import java.util.ArrayList;

public class Practice_ArrList {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        arr.add("Hello");
        arr.add("Hiii");
        arr.add(2, "Byee");
        arr.add(0, "Hyeeee");
        arr.add("hiiii");
        arr.remove(1);

        System.out.println(arr);

        arr.set(1, "Shivansh");
        System.out.println(arr);
    }
}
