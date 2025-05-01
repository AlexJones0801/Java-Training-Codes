class Student {
    String name;
    int age=11;
    Student() {
        System.out.println("Default Constructor.");
    }
    
    Student(String n,int age) {
        name = n;
        age = age;
        System.out.println(name + "  " + age);
    }
}

public class Practice_Constructor {
    
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("shiv",20);
        
        System.out.println("age: " + s2.age);
    }
    
}