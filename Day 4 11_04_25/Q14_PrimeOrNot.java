import java.util.*;
public class Q14_PrimeOrNot {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = in.nextInt();
        int count=0;
        
        for(int i=1;i<=num;i++){
            if(num%i==0)
                count++;
        }
        
        //Printing output 
        if(count == 2)
            System.out.println(num + " is a Prime Number.");
        else 
            System.out.println("Not a Prime Number.");
    }
    
}