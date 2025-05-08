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
        for (int i = 2; i <= Math.sqrt(n); i++) {
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

        for (int num = Math.max(a, 2); num < b; num++) {
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

    // Q21 Check a number is Armstrong or not
    static boolean armstrong(int n) {
        int original = n, sum = 0;
        int digits = String.valueOf(n).length();

        while (n > 0) {
            int digit = n % 10;
            sum += (int) Math.pow(digit, digits);
            n /= 10;
        }
        return sum == original;
    }

    // Q22 Armstrong number between 1 to 100
    static void armstrongPrint() {
        for (int i = 1; i < 100; i++) {
            int n = i, sum = 0;
            int digits = String.valueOf(i).length();

            while (n > 0) {
                int digit = n % 10;
                sum += (int) Math.pow(digit, digits);
                n /= 10;
            }

            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }

    // Q23 Print all Armstrong number between two given range
    static void armstrongPrintR(int start, int end) {
        if (start >= end) {
            System.out.println("Invalid range. Starting range must be less than ending range.");
            return;
        }
        for (int i = start; i < end; i++) {
            int n = i, sum = 0;
            int digits = String.valueOf(i).length();

            while (n > 0) {
                int digit = n % 10;
                sum += (int) Math.pow(digit, digits);
                n /= 10;
            }

            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }

    // Q24 Check if a number is a Harshad number
    static void HarshadNumber(int num) {
        int original = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        if (original % sum == 0) {
            System.out.println("Harshad Number.");
        } else {
            System.out.println("Not an Harshad Number.");
        }
    }

    // Q25 Find LCM of two numbers
    static int findLCM(int a, int b) {
        int gcd = findGCD(a, b);
        int lcm = (a * b) / gcd;
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
        return lcm;
    }

    static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Q26 Find GCD (HCF) of two numbers
    static int findGCD2(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("GCD (HCF) of the given numbers is: " + a);
        return a;
    }

    // Q27 Find factorial of a number
    static void factorial(int fact) {
        long n = 1;
        for (int i = 1; i <= fact; i++) {
            n *= i;
        }
        System.out.println("Factorial of " + fact + " is: " + n);
    }

    // Q28 Print Fibonacci series up to n terms
    static void Fibonacci(int fibo) {
        int first = 0, second = 1;
        for (int i = 1; i <= fibo; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }

    // Q29 Print Fibonacci numbers in a given range
    static void FibonacciPrint(int fibo1, int fibo2) {
        if (fibo1 > fibo2) {
            System.out.println("Invalid range. Starting range must be less than or equal to ending range.");
            return;
        }

        int first = 0, second = 1;
        System.out.print("Fibonacci numbers in the range [" + fibo1 + ", " + fibo2 + "]: ");
        while (first <= fibo2) {
            if (first >= fibo1) {
                System.out.print(first + " ");
            }
            int next = first + second;
            first = second;
            second = next;
        }
    }

    // Q30 Swap two numbers
    static void SwapNo(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("First Num: " + a + "\nSecond Num:" + b);
    }

    // Q31 Swap first and last digit of a number
    static void SwapFLD(int swap) {
        String numStr = String.valueOf(swap);
        if (numStr.length() == 1) {
            System.out.println("Swapped Number: " + swap);
            return;
        }

        char[] numArr = numStr.toCharArray();
        char temp = numArr[0];
        numArr[0] = numArr[numArr.length - 1];
        numArr[numArr.length - 1] = temp;

        String swappedNum = new String(numArr);
        System.out.println("Swapped Number:" + swappedNum);
    }

    // Q32 Calculate the sum of alternate digits in a number
    static void SumofAD(int num) {
        String numStr = String.valueOf(num);
        int sum = 0;

        for (int i = 0; i < numStr.length(); i += 2) {
            sum += Character.getNumericValue(numStr.charAt(i));
        }
        System.out.println("Sum of alternate digits: " + sum);
    }

    // Q33 Check whether the number is duck number
    static void DuckNo(int n) {
        int org = n;

        if (n <= 0) {
            System.out.println(org + " is not a Duck Number.");
            return;
        }

        boolean hasZero = false;
        while (n > 0) {
            int digit = n % 10;
            if (digit == 0)
                hasZero = true;
            n /= 10;
        }
        if (hasZero) {
            System.out.println(org + " is a Duck orgber.");
        } else {
            System.out.println(org + " is not a Duck Number.");
        }
    }

    // Q34 Check if a number is a Buzz number
    static void BuzzNo(int num) {
        if (num % 10 == 7 || num % 7 == 0 || num == 7) {
            System.out.println(num + " is a Buzz Number");
            return;
        } else {
            System.out.println(num + " is not a Buzz Number");
        }
    }

    // Q35 Check if a number is a Magic Number
    static void MagicNo(int num) {
        int original = num;

        while (num >= 10) { // Repeat until the number becomes a single digit
            int sum = 0;
            while (num > 0) {
                sum += num % 10; // Add last digit
                num /= 10; // Remove the last digit
            }
            num = sum;
        }

        if (num == 1) {
            System.out.println(original + " is a Magic Number.");
        } else
            System.out.println(original + " is not a Magic Number.");
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

        // Q21 Check a number is Armstrong or not
        System.out.println("\n\nQ21. Enter number to check Armstrong or not: ");
        int armnum = in.nextInt();
        if (armstrong(armnum)) {
            System.out.println(armnum + " is an Armstrong number");
        } else {
            System.out.println(armnum + " is not an Armstrong number");
        }

        // Q22 Armstrong number between 1 to 100
        System.out.println("\n\nQ22. All Armstrong Numbers b/w 1 to 100: ");
        armstrongPrint();

        // Q23 Print all Armstrong number between two given range
        System.out.println("\n\nQ23. Enter two ranges to Print Armstrong Number: ");
        int one = in.nextInt();
        int last = in.nextInt();
        armstrongPrintR(one, last);

        // Q24 Check if a number is a Harshad number
        System.out.println("\n\nQ24. Enter a number to Check Harshad No.: ");
        int harshe = in.nextInt();
        HarshadNumber(harshe);

        // Q25 Find LCM of two numbers
        System.out.println("\n\nQ25. Enter two numbers to Find LCM: ");
        int num11 = in.nextInt();
        int num22 = in.nextInt();
        findLCM(num11, num22);

        // Q26 Find GCD (HCF) of two numbers
        System.out.println("\n\nQ26. Enter two numbers to Find GCD(HCF): ");
        int num12 = in.nextInt();
        int num21 = in.nextInt();
        findGCD2(num12, num21);

        // Q27 Find factorial of a number
        System.out.println("\n\nQ27. Enter a number to Check Factorial No.: ");
        int fact = in.nextInt();
        factorial(fact);

        // Q28 Print Fibonacci series up to n terms
        System.out.println("\n\nQ28. Enter a number to Print Fibonacci Series: ");
        int fibo = in.nextInt();
        Fibonacci(fibo);

        // Q29 Print Fibonacci numbers in a given range
        System.out.println("\n\nQ29. Enter two ranges to Print Fibonacci Series: ");
        int fibo1 = in.nextInt();
        int fibo2 = in.nextInt();
        FibonacciPrint(fibo1, fibo2);

        // Q30 Swap two numbers
        System.out.println("\n\nQ30. Enter two ranges to Print Fibonacci Series: ");
        int k = in.nextInt();
        int z = in.nextInt();
        SwapNo(k, z);

        // Q31 Swap first and last digit of a number
        System.out.println("\n\nQ31. Enter two ranges to Print Fibonacci Series: ");
        int swap = in.nextInt();
        SwapFLD(swap);

        // Q32 Calculate the sum of alternate digits in a number
        System.out.println("\n\nQ32. Enter a number to calculate the sum of alternate digits: ");
        int alterd = in.nextInt();
        SumofAD(alterd);

        // Q33 Check whether the number is duck number
        System.out.println("\n\nQ33. Enter a number to check whether it is Duck number or not: ");
        int duck = in.nextInt();
        DuckNo(duck);

        // Q34 Check if a number is a Buzz number
        System.out.println("\n\nQ34. Enter a number to check whether it is Buzz number or not: ");
        int buzz = in.nextInt();
        BuzzNo(buzz);

        // Q35 Check if a number is a Magic Number
        System.out.println("\n\nQ35. Enter a number to check whether it is Magic number or not: ");
        int magic = in.nextInt();
        MagicNo(magic);
    }

}