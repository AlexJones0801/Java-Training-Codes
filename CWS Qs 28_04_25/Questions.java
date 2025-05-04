import java.util.*;

public class Questions {
    // Q1 Print n numbers
    static int printnnum(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        return 0;
    }

    // Q2 Print all Even numbers between 2 range
    static void printevennum(int a, int b) {
        if (a < b) {
            for (int i = a; i <= b; i++) {
                if (i % 2 == 0)
                    System.out.print(i + " ");
            }
        } else {
            System.out.println("Invalid Range");
        }
    }

    // Q3 Print n numbers in reverse order
    static int printinrev(int n) {
        int rev = 0, digits = 0;
        while (n != 0) {
            digits = n % 10;
            rev = rev * 10 + digits;
            n /= 10;
        }
        System.out.println("Reverse order: " + rev);
        return 0;
    }

    // Q4 Finding sum of all n natural number
    static int sumallnum(int n) {
        int sumn = n * (n + 1) / 2; // mathematical formula
        System.out.println("Sum of " + n + " is: " + sumn);
        return 0;
    }

    // Q5 Finding product of 'n' natural numbers
    static int proallnum(int product) {
        int fact = 1;
        for (int i = 1; i <= product; i++) {
            fact *= i;
        }
        System.out.println("Product of " + product + " is: " + fact);
        return 0;
    }

    // Q6 Extract and display all digits from a given number
    static void numdigit(String n) {
        for (char c : n.toCharArray()) {
            System.out.print(c + " ");
        }
    }

    // Q7 Find sum of all digits in a given number
    static int sumalldigit(int n) {
        int sum = 0, digits = 0;
        while (n != 0) {
            digits = n % 10;
            sum += digits;
            n /= 10;
        }
        System.out.println("Sum of all digits: " + sum);
        return 0;
    }

    // Q8 Find the count of all digits in a given number
    static int digitcount(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        System.out.println("Count of all digits: " + count);
        return 0;
    }

    // Q9 Print reverse of a given number
    static int reverse(int n) {
        int rev = 0, digits = 0;
        while (n != 0) {
            digits = n % 10;
            rev = rev * 10 + digits;
            n /= 10;
        }
        System.out.println("Reverse order: " + rev);
        return 0;
    }

    // Q10 Check a number is palindrome or not
    static int palindrome(int n) {
        int rev = 0, num = n;
        while (n != 0) {
            int digits = n % 10;
            rev = rev * 10 + digits;
            n /= 10;
        }
        if (rev == num)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        return 0;
    }

    // Q11 Find all factors of a given number
    static int factors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.print(i + " ");
        }
        return 0;
    }

    // Q12 Find sum of all factors of a given number
    static int sumoffactors(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                sum += i;
        }
        System.out.print("Sum of Factor " + n + " is " + sum);
        return 0;
    }

    // Q13 Count all the factors of a given number and display it
    static int countoffactor(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        System.out.print("Count of Factor " + n + " is " + count);
        return 0;
    }

    // Q14 Check a number is prime or not
    static int primenum(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        if (count == 2)
            System.out.print("Prime number");
        else
            System.out.print("Not Prime number");
        return 0;
    }

    // Q15 print all prime numbers between 1 to 100
    static int fprimeno() {
        for (int num = 2; num < 100; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
        return 0;
    }

    // Q16 Print all prime numbers between two given range
    static int fprimeno2(int a, int b) {
        if (a >= b) {
            System.out.println("Invalid range. Starting range must be less than ending range.");
            return 0;
        }

        if (a < b) {
            a = 2;
        }

        for (int num = a; num < b; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
        return 0;
    }

    // Q17 Print alternate prime numbers between 1 to 100
    static int alterPrimeNo() {
        int count = 0;
        for (int num = 2; num < 100; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                if (count % 2 == 0) {
                    System.out.print(num + " ");
                }
                count++;
            }
        }
        return 0;
    }

    // Q18 Check a number is perfect or not
    static void perfectNo(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n)
            System.out.println(n + " is a Perfect Number");
        else
            System.out.println(n + " is not a Perfect Number");
    }

    // Q19 Print all perfect numbers between 1 to 100
    static void perfectNo100() {
        for (int n = 1; n < 100; n++) {
            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            if (sum == n)
                System.out.println(n + " is a Perfect Number");
        }
    }

    // Q20 Print all the perfect number between two given range
    static int printperfectNo(int start, int end) {
        for (int n = start; n < end; n++) {
            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            if (sum == n)
                System.out.println(n + " is a Perfect Number");
        }
        return 0;
    }
    
    //Q21 Check a number is Armstrong or not
    static boolean armstrong(int n) {
        int original = n,sum=0;
        int digits=String.valueOf(n).length();
        
        while(n>0){
            int digit = n%10;
            sum += (int)Math.pow(digit,digits);
            n /= 10;
        }
        return sum == original;
    }
    
    //Q22 Armstrong number between 1 to 100
    static void armstrongPrint() {
        for(int i=1;i<100;i++){
            int n=i,sum=0;
            int digits=String.valueOf(i).length();
        
            while(n>0){
                int digit = n%10;
                sum += (int)Math.pow(digit,digits);
                n /= 10;
            }
            
            if(sum == i){
                System.out.print(i + " ");
            }
        }
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
        printevennum(a, b);

        // Q3 Print Reverse order of given number
        System.out.print("\n\nQ3. Enter number for reverse: ");
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

        // Q7 Find sum of all digits in a given number
        System.out.print("\n\nQ7. Enter number for Sum of Digits: ");
        int number = in.nextInt();
        sumalldigit(number);

        // Q8 Find the count of all digits in a given number
        System.out.print("\n\nQ8. Enter number for count: ");
        int dumb = in.nextInt();
        digitcount(dumb);

        // Q9 Print reverse of a given number
        System.out.print("\n\nQ9. Enter number for reverse: ");
        int num1 = in.nextInt();
        reverse(num1);

        // Q10 Check a number is palindrome or not
        System.out.print("\n\nQ10. Enter number to check palindrome: ");
        int palin = in.nextInt();
        palindrome(palin);

        // Q11 Find all factors of a given number
        System.out.print("\n\nQ11. Enter number to find factors: ");
        int factor = in.nextInt();
        factors(factor);

        // Q12 Find sum of all factors of a given number
        System.out.print("\n\nQ12. Enter number to find sum of factor: ");
        int fsum = in.nextInt();
        sumoffactors(fsum);

        // Q13 Count all the factors of a given number and display it
        System.out.print("\n\nQ13. Enter number to find count of factor: ");
        int factcount = in.nextInt();
        countoffactor(factcount);

        // Q14 Check a number is prime or not
        System.out.print("\n\nQ14. Enter number to check prime or not: ");
        int prime = in.nextInt();
        primenum(prime);

        // Q15 Print all prime numbers between 1 to 100
        System.out.println("\n\nQ15. All prime numbers b/w 1 to 100: ");
        fprimeno();

        // Q16 Print all prime numbers between two given range
        System.out.print("\n\nQ16. Enter two ranges to find prime numbers: ");
        int start = in.nextInt();
        int end = in.nextInt();
        fprimeno2(start, end);

        // Q17 Print alternate prime numbers between 1 to 100
        System.out.println("\n\nQ17. Alternate prime numbers between 1 to 100: ");
        alterPrimeNo();

        // Q18 Check a number is perfect or not
        System.out.println("\n\nQ18. Enter a number to check perfect or not: ");
        int pernum = in.nextInt();
        perfectNo(pernum);

        // Q19 Print all perfect numbers between 1 to 100
        System.out.println("\n\nQ19. All Perfect Numbers b/w 1 to 100: ");
        perfectNo100();

        // Q20 Print all the perfect number between two given range
        System.out.println("\n\nQ20. Enter two ranges to find Perfect Numbers: ");
        int st = in.nextInt();
        int ed = in.nextInt();
        printperfectNo(st, ed);
        
        //Q21 Check a number is Armstrong or not
        System.out.println("\n\nQ21. Enter number to check Armstrong or not: ");
        int armnum = in.nextInt();
        if(armstrong(armnum)) {
            System.out.println(armnum + " is an Armstrong number");
        } else {
            System.out.println(armnum + " is not an Armstrong number");
        }
        
        //Q22 Armstrong number between 1 to 100
        System.out.println("\n\nQ22. All Armstrong Numbers b/w 1 to 100: ");
        armstrongPrint();
        
    }
}