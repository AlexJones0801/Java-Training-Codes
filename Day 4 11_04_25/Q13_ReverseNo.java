import java.util.*;
public class Q13_ReverseNo {
    
    public static void main(String[] args) {
        int num,temp,rev=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        num = in.nextInt();
        
        while(num!=0) {
            temp = num%10;
            rev = rev*10+temp;
            num/=10;
        }
        System.out.println("Reverse Number: "+ rev);
    }
    
}