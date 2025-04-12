import java.util.*;
public class Q10_Multiof3 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = in.nextInt();
        
        if(num%3==0)
            System.out.print(num + " is a Multiple of 3.");
        else
            System.out.print(num + " is not a Multiple of 3.");
    }
    
}