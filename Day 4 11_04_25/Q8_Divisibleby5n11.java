import java.util.*;
public class Q8_Divisibleby5n11 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = in.nextInt();
        
        if (num%5==0 && num%11==0) {
            System.out.println("Divisible By 5 & 11");
        } else {
            System.out.println("Not Divisible By 5 & 11");
        }
    }
    
}