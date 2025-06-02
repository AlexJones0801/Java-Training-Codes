/* Question 2: Sort by Name Length using Comparator
Create  a  Comparator  that  sorts  Student  objects  based  on  the  length  of  their  names.  Shorter  names  should
come first */

package PrebuiltInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StudentNL {
    String name;

    public StudentNL(String s) {
        this.name = s;
    }

    public String toString(){
        return name;
    }
}

class sortbyNL implements Comparator<StudentNL>{
    public int compare(StudentNL s1,StudentNL s2) {
        return s1.name.length()-s2.name.length();
    }
}

public class Q2_SortByNameLength {
    public static void main(String[] args) {
        ArrayList<StudentNL> list = new ArrayList<>();
        list.add(new StudentNL("Sonu Nigum"));
        list.add(new StudentNL("Arijit Singh"));
        list.add(new StudentNL("A.R Rahman"));
        list.add(new StudentNL("Papon"));
        list.add(new StudentNL("Ann"));

        // Sort by Name Length (Shorter Name first)
        Collections.sort(list, new sortbyNL());
        System.out.println("Sort by Name Length (Shorter Name first): ");
        for (StudentNL s : list) {
            System.out.println(s);
        }
    }
}
