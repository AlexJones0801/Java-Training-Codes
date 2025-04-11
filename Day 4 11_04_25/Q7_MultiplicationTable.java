import java.util.*;
public class Q7_MultiplicationTable {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = in.nextInt();
        
        for(int i=1; i<=10;i++) {
            System.out.print(num*i + " ");
        }
    }
    
}