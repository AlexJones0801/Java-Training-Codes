// Q4. Write a program that takes a string input from the user and prints its uppercase. Use exception handling to catch if the string is null.

package pro;

import java.util.Scanner;

public class Q4_userInputException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String: ");
        String str = sc.nextLine();
        sc.close();

        // str = null;  Throw null pointer exception 

        try {
            System.out.println(str.toUpperCase());
        } catch (Exception e) {
            System.out.println("Caught a null pointer exception!");
        }
    }
}
