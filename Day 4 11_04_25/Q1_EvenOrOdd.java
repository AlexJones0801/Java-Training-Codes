import java.util.*;
public class EvenOrOdd {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Integer: ");
        int number = in.nextInt();
        
        if (number %  2 == 0) {
            System.out.println(number + " is Even Number");
        } else {
            System.out.println(number + " is Odd Number");
        }
    }
    
}