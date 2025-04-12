import java.util.*;
public class Q7_SwapWithout3rdvar {
    
    public static void main(String[] args) {
        int a,b;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Two Number: ");
        a = in.nextInt();
        b = in.nextInt();
        
        a *= b;
        b = a/b;
        a = a/b;
        
        System.out.print("Swapped Number: \na = " + a + "|| b = " + b);
    }
}