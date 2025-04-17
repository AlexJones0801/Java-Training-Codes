import java.util.*;
public class Practice_ArrMinMax {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter Elements: ");
        for(int i=0;i<n;i++) {
            arr[i] = in.nextInt();
        }
        
        int min = arr[0],max=arr[0];
        
        for(int i=0;i<n;i++) {
            if(max<arr[i])
                max=arr[i];
            if(min>arr[i])
                min=arr[i];
        }
        
        System.out.println("Max element: " + max + "\nMin Element: " + min);
    }
    
}