import java.util.*;
public class Practice_ArrSum {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        
        System.out.println("Enter Elements: ");
        for(int i=0;i<n;i++) {
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        
        System.out.println("Sum of Array: " + sum);
    }
    
}