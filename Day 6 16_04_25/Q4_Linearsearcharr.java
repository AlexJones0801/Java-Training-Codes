import java.util.*;
public class Q4_Linearsearcharr {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter Elements: ");
        for(int i=0;i<n;i++) {
            arr[i] = in.nextInt();
        }
        
        System.out.println("Enter number to search: ");
        int x = in.nextInt();
        
        boolean found = false;
        for(int val : arr) {
            if(val == x) {
                found = true;
                break;
            }
        }
 
            if (found)
                System.out.println(x + " is present in the array.");
            else
                System.out.println(x + " is not present in the array.");
        }
        
    }