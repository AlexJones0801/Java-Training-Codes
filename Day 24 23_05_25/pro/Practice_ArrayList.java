package pro;

import java.util.ArrayList;

public class Practice_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(); // Dynamic array using Array List
        arr.add("rohit");
        arr.add("Jaya");
        arr.add("Rahul");
        arr.add(1, "Shiv"); // Adding "Shiv" in place of "Jaya"

        System.out.println("Array list: " + arr); // This will print whole array
        System.out.println("Getting 4th element: " + arr.get(3)); // And this will fetch element at given index

        arr.set(2, "Mark Grayson"); // Setting or replacing an element with another one
        System.out.println("After set: " + arr);

        arr.reversed(); // Reversed Method
        System.out.println("Reversed Array List: " + arr);

        arr.remove(2); // Remove elements at given index
        System.out.println("After Removing 3rd Element: " + arr);

        arr.clear(); // Clear all elements present in array list
        System.out.println("After clearing Array list: " + arr);
    }
}
