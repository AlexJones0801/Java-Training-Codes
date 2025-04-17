
public class Q2_ArrCompare {
    
    public static void main(String[] args) {
        int[] arr1 = {1,2,3}, arr2 = {1,2,3};
        
        if(arr1.length!=arr2.length) {
            System.out.print("Array length is not equal");
            return;
        }
            
        
        boolean equal = true;
        for(int i=0;i<arr1.length;i++) {
            if(arr1[i] != arr2[i]) {
                equal = false;
            }
        }
        
        if(equal)
            System.out.print("Arrays are equal");
        else 
            System.out.print("Arrays are not equal");
    }
    
}