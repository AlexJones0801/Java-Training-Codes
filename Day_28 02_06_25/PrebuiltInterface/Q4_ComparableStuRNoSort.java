/* Question 4: Implement Comparable in Student to Sort by Roll Number
Modify  the  Student  class  to  implement  the  Comparable  interface  and  sort  students  by  roll  number  in
ascending order. Then use Collections.sort(list) without a Comparator. */

package PrebuiltInterface;

import java.util.ArrayList;
import java.util.Collections;

class StudentCR implements Comparable<StudentCR> {
    int rollNo;
    String name;

    StudentCR(int rn,String s) {
        this.rollNo = rn;
        this.name = s;
    }
    
    public String toString() {
        return rollNo + " " + name; // Readable format
    }

    public int compareTo(StudentCR s1) {
        return this.rollNo - s1.rollNo; // if the result is + then it will swap both value and if - then remain unchange
    }
}

public class Q4_ComparableStuRNoSort {
    public static void main(String[] args) {
        ArrayList<StudentCR> list = new ArrayList<>();
        list.add(new StudentCR(17, "Rahul"));
        list.add(new StudentCR(16, "Rohit"));
        list.add(new StudentCR(11, "mohit"));

        Collections.sort(list);

        for(StudentCR s : list){
            System.out.println(s.toString());
        }
    }
}
