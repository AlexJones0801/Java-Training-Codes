class Employee {
    String name;
    int id;
    double salary;
}

public class Q8_Employee {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "Alex Jones";
        emp1.id = 321;
        emp1.salary = 100000.0;

        Employee emp2 = new Employee();
        emp2.name = "Bobby";
        emp2.id = 322;
        emp2.salary = 60000.0;

        Employee emp3 = new Employee();
        emp3.name = "Vincent";
        emp3.id = 323;
        emp3.salary = 55000.0;

        System.out.println("Employee 1: " + emp1.name + ", ID: " + emp1.id + ", Salary: $" + emp1.salary);
        System.out.println("Employee 2: " + emp2.name + ", ID: " + emp2.id + ", Salary: $" + emp2.salary);
        System.out.println("Employee 3: " + emp3.name + ", ID: " + emp3.id + ", Salary: $" + emp3.salary);
    }
}