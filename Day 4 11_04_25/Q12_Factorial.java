import java.util.*;
public class Q12_Factorial {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = in.nextInt();
        long fact = 1;
        
        for(int i=1; i<=num; i++) {
            fact *= i;
        }
        System.out.println("Factorial of "+ num + " is "+ fact);
    }
    
}