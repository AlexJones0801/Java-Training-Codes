import java.util.*;
public class Q6_Swap2No {
    
    public static void main(String[] args) {
        int a,b,temp;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Two Number: ");
        a = in.nextInt();
        b = in.nextInt();
        
        temp = b;
        b = a;
        a = temp;
        
        System.out.print("Swapped Number: \na = " + a + "|| b = " + b);
    }
    
}