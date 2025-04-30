class Student {
    void showDetails(int marks,String name,String rollNumber) {
        System.out.println("Name: " + name + "\nRoll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}

public class Q1_Studentclass {
    
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        
        s1.showDetails(75,"Alex","21020C04011");
        s2.showDetails(70,"Alice","22020C04041");
        s3.showDetails(80,"Ann","23020C04061");
    }
    
}