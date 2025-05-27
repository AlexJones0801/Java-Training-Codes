package CollectionFrameWork;

import java.util.LinkedList;

public class Practice_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> Link = new LinkedList<>();

        Link.add(5);
        Link.add(4);
        Link.add(8);
        Link.add(2, 7);

        System.out.println(Link.contains(4)); // Check if the elements is present in the List or not
        System.out.println(Link.contains(6)); // Check if the elements is present in the List or not

        System.out.println(Link);

        Link.remove(2);

        System.out.println(Link);
    }
}
