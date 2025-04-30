class Employee {
    String name;
    int id;
    double salary;
    
    Employee(String n,int id,double sal) {
        this.name = n;
        this.id = id;
        this.salary = sal;
    }
    
    void employeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: $" + salary);
    }
    
    void SalaryIncrement(){
        double increment = salary * 0.05;
        salary += increment;
        
        System.out.println("Salary Increment: 5%");
        System.out.println("Increment Amount: $" + increment);
    }
}

public class Q7_Employee {
    
    public static void main(String[] args) {
        Employee em = new Employee("Nikhil",26,60000);
        
        System.out.println("Before Salary Increment: ");
        em.employeeDetails();
        em.SalaryIncrement();
        
        System.out.println("\nAfter Salary Increment: ");
        em.employeeDetails();
    }
}