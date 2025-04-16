import java.util.*;
public class Q3_evenoddarrelem {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        int even = 0, odd=0;
        
        System.out.println("Enter Elements: ");
        for(int i=0;i<n;i++) {
            arr[i] = in.nextInt();
            if(arr[i]%2==0) {
                even++;
            } else 
                odd++;
        }
        System.out.println("Even: "+ even + "\nOdd: "+ odd);
    }
    
}