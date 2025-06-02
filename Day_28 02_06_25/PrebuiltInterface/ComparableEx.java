package PrebuiltInterface;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return age + " " + name; // Readable format
    }

    public int compareTo(Student s) {
        return this.age - s.age; // if the result is + then it will swap both value and if - then remain unchange
    }
}

public class ComparableEx {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(17, "Rahul"));
        list.add(new Student(16, "Rohit"));
        list.add(new Student(11, "mohit"));
        list.add(new Student(47, "Pankaj"));

        Collections.sort(list);

        for(Student s : list){
            System.out.println(s.toString());
        }
    }
}
