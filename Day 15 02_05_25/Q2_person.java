// Multi Level Inheritance
class Person {
    void displayName() {
        System.out.println("Name: Shivansh");
    }
}

class Student extends Person {
    void displayClass() {
        System.out.println("Class: 4th sem");
    }
}

class Monitor extends Student {
    void checkDiscipline() {
        System.out.println("Discipline check Done");
    }
}

public class Q2_person {
    
    public static void main(String[] args) {
        Monitor mt = new Monitor();
        
        mt.displayName();
        mt.displayClass();
        mt.checkDiscipline();
    }
    
}