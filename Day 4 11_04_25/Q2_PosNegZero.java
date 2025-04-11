import java.util.*;
public class Q2_PosNegZero {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Integer: ");
        int num = in.nextInt();
        
        if (num>0) {
            System.out.println("Positive");
        } else if (num<0) {
            System.out.println("Negative");
        }
        else if(num == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Invaild Input");
        }
    }
}