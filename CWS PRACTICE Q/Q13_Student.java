class Student {
    static String school_name = "Model high school";
    String name;
}

public class Q13_Student {
    
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        
        s1.name = "Rohan";
        s2.name = "Ansh";
        System.out.println("School name: " + Student.school_name);
        System.out.println("Student 1 name: " + s1.name + "\nStudent 2 name: " + s2.name);
    }
    
}