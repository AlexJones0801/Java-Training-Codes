import java.util.*;
public class Practice_SecondMinMaxArr {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter Elements: ");
        for(int i=0;i<n;i++) {
            arr[i] = in.nextInt();
        }
        
        int min=arr[0],smin=arr[1],max=arr[0],smax=arr[1];
        
        for(int i=2;i<n;i++) {
            if(arr[i]>max) {
                smax=max;
                max=arr[i];
            } else {
                if(arr[i]>smax)
                    smax=arr[i];
            }
            
            if(arr[i]<min) {
                smin=min;
                min=arr[i];
            } else {
                if(arr[i]<smin) 
                    smin=arr[i];
            }
        }
        
        System.out.println("Second Max element: " + smax + "\nSecond Min Element: " + smin);
    }
    
}