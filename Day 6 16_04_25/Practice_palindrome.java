
public class Practice_palindrome {
    
    public static void main(String[] args) {
        int num=124421, rev=0;
        int temp = num;
        while(temp>0) {
            int digits = temp%10;
            rev = rev*10 + digits;
            temp /= 10;
        }
        
        if(num==rev)
            System.out.print(num + " is an Palindrome");
        else 
            System.out.print(num + " is Not an Palindrome");
    }
    
}