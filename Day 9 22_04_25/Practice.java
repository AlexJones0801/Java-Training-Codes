// Digits even odd
public class Practice {
    
    public static void main(String[] args) {
        int sum=123,digit=0;
        while(sum>0) {
            digit = sum%10;
            if(digit%2==0) 
                System.out.println(digit + " Even");
            else
                System.out.println(digit + " Odd");
            sum = sum/10;
        }
    }
    
}