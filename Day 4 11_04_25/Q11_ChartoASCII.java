import java.util.*;
public class Q11_ChartoASCII {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Character: ");
        char ch = in.next().charAt(0);
        System.out.println("ASCII value of " + ch + " is " + (int)ch );
        
    }
    
}