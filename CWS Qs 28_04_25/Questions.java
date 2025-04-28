import java.util.*;
public class Questions {
    //Q1 Print n numbers
    static int printnnum(int n) {
        for(int i=1; i<= n; i++) {
            System.out.print(i + " ");
        }
        return 0;
    }
    
    // Q2 Print all Even numbers between 2 range
    static void printevennum(int a, int b) {
        if(a<b) {
            for(int i=a;i<=b;i++) {
                if(i%2==0) 
                    System.out.print(i + " ");
            }
        } else {
            System.out.println("Invalid Range");
        }
    }
    
    //Q3 Print n numbers in reverse order
    static int printinrev(int n) {
        int rev=0,digits=0;
        while(n!=0) {
            digits = n%10;
            rev = rev*10+digits;
            n /= 10;
        }
        System.out.println("Reverse order: " + rev);
        return 0;
    }
    
    // Q4 Finding sum of all n natural number
    static int sumallnum(int n) {
        int sumn = n*(n+1)/2; // mathematical formula
        System.out.println("Sum of " + n + " is: " + sumn);
        return 0;
    }
    
    // Q5 Finding product of 'n' natural numbers
    static int proallnum(int product) {
        int fact=1;
        for(int i=1; i <= product ; i++) {
            fact *= i;
        }
        System.out.println("Product of " + product + " is: " + fact);
        return 0;
    }
    
    // Q6 Extract and display all digits from a given number
    static void numdigit(String n) {
        for(char c : n.toCharArray()) {
            System.out.print(c + " ");
        }
    }
    
    //Q7 Find sum of all digits in a given number
    static int sumalldigit(int n) {
        int sum=0,digits=0;
        while(n!=0) {
            digits = n%10;
            sum += digits;
            n /= 10;
        }
        System.out.println("Sum of all digits: " + sum);
        return 0;
    }
    
    //Q8 Find the count of all digits in a given number
    static int digitcount(int n) {
        int count=0;
        while(n!=0) {
            n /= 10;
            count++;
        }
        System.out.println("Count of all digits: " + count);
        return 0;
    }
    
    //Q9 Print reverse of a given number
    static int reverse(int n) {
        int rev=0,digits=0;
        while(n!=0) {
            digits = n%10;
            rev = rev*10+digits;
            n /= 10;
        }
        System.out.println("Reverse order: " + rev);
        return 0;
    }
    
    //Q10 Check a number is palindrome or not
    static int palindrome(int n) {
        int rev=0,num=n;
        while(n!=0) {
            int digits = n%10;
            rev = rev*10+digits;
            n /= 10;
        }
        if(rev==num)
            System.out.println("Palindrome");
        else 
            System.out.println("Not Palindrome");
        return 0;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Q1 Print n numbers
        System.out.print("Q1. Enter n number: ");
        int n = in.nextInt();
        printnnum(n);
        
        
        // Q2 Print all Even numbers between 2 range
        System.out.print("\n\nQ2. Enter two range: ");
        int a = in.nextInt();
        int b = in.nextInt();
        printevennum(a,b);
        
        
        // Q3 Print Reverse order of given number
        System.out.print("\n\nQ3. Enter natural number: ");
        int num = in.nextInt();
        printinrev(num);
        
        
        // Q4 Finding sum of all n natural number
        System.out.print("\n\nQ4. Enter number for sum: ");
        int sum = in.nextInt();
        sumallnum(sum);
        
        
        // Q5 Finding product of 'n' natural numbers
        System.out.print("\n\nQ5. Enter number for product: ");
        int product = in.nextInt();
        proallnum(product);
        
        
        // Q6 Extract and display all digits from a given number
        System.out.print("\n\nQ6. Enter number for display: ");
        String digits = in.next();
        numdigit(digits);
        
        
        //Q7 Find sum of all digits in a given number
        System.out.print("\n\nQ7. Enter number for sum: ");
        int number = in.nextInt();
        sumalldigit(number);
        
        
        //Q8 Find the count of all digits in a given number
        System.out.print("\n\nQ8. Enter number for count: ");
        int dumb = in.nextInt();
        digitcount(dumb);
        
        
        //Q9 Print reverse of a given number
        System.out.print("\n\nQ9. Enter number for reverse: ");
        int num1 = in.nextInt();
        reverse(num1);
        
        
        //Q10 Check a number is palindrome or not
        System.out.print("\n\nQ10. Enter number to check palindrome: ");
        int palin = in.nextInt();
        palindrome(palin);
    }
    
}