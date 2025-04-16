import java.util.*;
public class Q2_FindMaxElem {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter Elements: ");
        for(int i=0;i<n;i++) {
            arr[i] = in.nextInt();
        }
        
        int max = arr[0];
        for(int i=1;i<n;i++) {
            if(arr[i]>max)
                max = arr[i];
        }
        System.out.println("Maximum element: " + max);
    }
    
}