package PrebuiltInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student2 {
    int age, rollNo;
    String name;

    public Student2(int age, int rn, String name) {
        this.age = age;
        this.rollNo = rn;
        this.name = name;
    }

    public String toString() {
        return age + " " + name + " " + rollNo;
    }
}

class sortByName implements Comparator<Student2> {
    public int compare(Student2 s1,Student2 s2) {
        return s1.name.compareTo(s2.name);
    }
}

class sortByAge implements Comparator<Student2> {
    public int compare(Student2 s1,Student2 s2) {
        return s1.age-s2.age;
    }
}

class sortByRNo implements Comparator<Student2> {
    public int compare(Student2 s1,Student2 s2) {
        return s1.rollNo-s2.rollNo;
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        ArrayList<Student2> list = new ArrayList<>();
        list.add(new Student2(17, 55, "Rohit"));
        list.add(new Student2(18, 13, "Rahul"));
        list.add(new Student2(11, 2, "Sunny"));
        list.add(new Student2(30, 10, "Mohit"));

        Collections.sort(list,new sortByName());
        System.out.println("Sorting on the basis of Name");
        for (Student2 s : list) {
            System.out.println(s);
        }
        
        Collections.sort(list,new sortByAge());
        System.out.println("Sorting on the basis of Age");
        for (Student2 s : list) {
            System.out.println(s);
        }

        Collections.sort(list,new sortByRNo());
        System.out.println("Sorting on the basis of Roll No. ");
        for (Student2 s : list) {
            System.out.println(s);
        }

    }
}
