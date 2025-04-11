import java.util.*;

public class PrintInFormat {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        
        System.out.println("My name is "+ name + " and I am " + age + " years old.");
    }
}