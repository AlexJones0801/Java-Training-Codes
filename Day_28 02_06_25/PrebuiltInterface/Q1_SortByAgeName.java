/* Question 1: Sort by Age Ascending, then by Name Alphabetically
Create a custom Comparator to sort a list of Student objects by age in ascending order. If two students have
the same age, then sort by name alphabetically. */

package PrebuiltInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StudentS {
    int age;
    String name;

    public StudentS(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return age + " " + name;
    }
}

class sortingage implements Comparator<StudentS> {
    public int compare(StudentS s1, StudentS s2) {
        if (s1.age != s2.age) {
            return s1.age - s2.age; // Sort by age
        } else {
            return s1.name.compareTo(s2.name); // if age same, sort by name
        }
    }
}

public class Q1_SortByAgeName {
    public static void main(String[] args) {
        ArrayList<StudentS> list = new ArrayList<>();
        list.add(new StudentS(17, "Rohit"));
        list.add(new StudentS(18, "Rahul"));
        list.add(new StudentS(11, "Sunny"));
        list.add(new StudentS(30, "Mohit"));
        list.add(new StudentS(17, "Ankit"));

        // Sort by age
        Collections.sort(list, new sortingage());
        System.out.println("Sorting by Age: ");
        for (StudentS s : list) {
            System.out.println(s);
        }
        
    }
}
