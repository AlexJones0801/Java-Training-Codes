/* Question 3: Sort by Roll Number in Descending Order
Create a Comparator to sort the list of Student objects based on roll number in descending order */

package PrebuiltInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StudentRNo {
    int rollNo;
    String name;

    public StudentRNo(int rn, String s) {
        this.rollNo = rn;
        this.name = s;
    }

    public String toString(){
        return rollNo + " " + name;
    }
}

class SortRNoDesc implements Comparator<StudentRNo> {
    public int compare(StudentRNo s1, StudentRNo s2) {
        return s2.rollNo - s1.rollNo;
    }
}

public class Q3_SortByRNoDesc {
    public static void main(String[] args) {
        ArrayList<StudentRNo> list = new ArrayList<>();
        list.add(new StudentRNo(17, "Rohit"));
        list.add(new StudentRNo(18, "Rahul"));
        list.add(new StudentRNo(11, "Sunny"));
        list.add(new StudentRNo(30, "Mohit"));

        // Sort by roll number (descending)
        Collections.sort(list, new SortRNoDesc());
        System.out.println("Sort by Roll Number (Descending): ");
        for (StudentRNo s : list) {
            System.out.println(s);
        }
    }
}
