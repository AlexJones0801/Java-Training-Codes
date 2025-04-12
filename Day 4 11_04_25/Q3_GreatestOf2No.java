import java.util.*;
public class Q3_GreatestOf2No {
    
    public static void main(String[] args) {
        int a,b;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Two Number: ");
        a = in.nextInt();
        b = in.nextInt();
        
        if (a>b) {
            System.out.println(a + " is greater than " + b);
        } else if (b>a) {
            System.out.println(b + " is greater than " + a);
        }
        else {
            System.out.println("Invalid input");
        }
    }
    
}