import java.util.*;
public class Q5_Arrrev {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter Elements: ");
        for(int i=0;i<n;i++) {
            arr[i] = in.nextInt();
        }
        
        System.out.println("Reversed array: ");
        for(int i=n-1;i>=0;i-- ) {
            System.out.print(arr[i]+" ");
        }
    }
    
}