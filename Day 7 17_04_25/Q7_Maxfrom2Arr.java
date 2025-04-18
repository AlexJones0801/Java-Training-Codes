// Q7: Find Maximum from Two Arrays
public class Q7_Maxfrom2Arr {
    
    public static void main(String[] args) {
        int[] arr1 = {11,2,8}, arr2 = {14,5,6};
        int max= arr1[0];
        
        // Loop for arr1
        for(int i = 0; i < arr1.length; i++) {
                if(arr1[i] > max)
                    max = arr1[i];
        }
        
        // Loop for arr2
        for(int i = 0; i < arr2.length; i++) {
                if(arr2[i] > max)
                    max = arr2[i];
        }
        System.out.print("Maximum from two Array: " + max);
    }
    
}