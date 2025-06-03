/* Question 5: Sort by Age Descending, then Name Descending
Write a Comparator that first sorts students by age in descending order. If ages are equal, then sort by name
in reverse alphabetical order.
*/

package PrebuiltInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StudentDesc{
    int age;
    String name;

    StudentDesc(int age,String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return age + " " + name;
    }
}

class sortAge implements Comparator<StudentDesc> {
    public int compare(StudentDesc s1,StudentDesc s2) {
        if (s1.age == s2.age) {
            return s2.name.compareTo(s1.name);
            
        }
        return s2.age - s1.age;
    }
}


public class Q5_SortAgeNameDesc {
    public static void main(String[] args) {
        ArrayList<StudentDesc> list = new ArrayList<>();
        list.add(new StudentDesc(20, "Rahul"));
        list.add(new StudentDesc(16, "Sandy"));
        list.add(new StudentDesc(16, "Ankit"));
        list.add(new StudentDesc(14, "chintu"));

        Collections.sort(list,new sortAge());
        System.out.println("Sort by Age: ");
        for (StudentDesc s : list) {
            System.out.println(s);
        }
    }
}
