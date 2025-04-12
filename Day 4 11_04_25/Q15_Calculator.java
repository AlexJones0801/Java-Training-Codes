import java.util.*;
public class Q15_Calculator {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Two Numbers: ");
        int A = in.nextInt();
        int B = in.nextInt();
        
        System.out.print("Choose Operator(+,-,/,*): ");
        char op = in.next().charAt(0);
        
        switch(op) {
            case '+':
                System.out.print("Addition: " + (A+B));
                break;
            case '-':
                System.out.print("Subtraction: " + (A-B));
                break;
            case '/':
            if(B==0) {
                System.out.print("INF");
                break;
            } else {
                System.out.print("Division: " + (A/B));
                break;
            }
            case '*':
                System.out.print("Multiplication: " + (A*B));
                break;
            default:
                System.out.print("Invalid Operator.");
                break;
        }   
    }
    
}