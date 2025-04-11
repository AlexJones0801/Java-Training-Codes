import java.util.*;
public class Q6_SumOfNno {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = in.nextInt();
        int i=1,sum=0;
        while (i<=num){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
    
}