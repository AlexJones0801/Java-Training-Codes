// Single Level Inheritance

class Employee {
    void work(){
        System.out.println("Workinggg");
    }
}

class Manager extends Employee {
    void attendMeeting() {
        System.out.println("Attending Meeting");
    }
}

public class Q1_EmployeeInherit {
    
    public static void main(String[] args) {
        Manager mg = new Manager();
        
        mg.work();
        mg.attendMeeting();
    }
    
}