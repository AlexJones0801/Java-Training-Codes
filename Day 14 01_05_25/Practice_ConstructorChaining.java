class Student {
    String name;
    int age=11;
    Student() {
        System.out.println("Default Constructor.");
    }
    
    Student(String n) {
        this();
        System.out.println(n);
    }
    
    Student(String n,int age) {
        this(n);
        name = n;
        age = age;
        System.out.println(name + " " + age);
    }
}

public class Practice_ConstructorChaining {
    
    public static void main(String[] args) {
        Student s1 = new Student("shivansh",20);
    }
    
}