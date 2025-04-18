
public class Q6_CpElemofArrtoNewArr {
    
    public static void main(String[] args) {
        int[] arr = {1,2,4,3};
        int[] NewArr = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++) {
            NewArr[i] = arr[i];
        }
        
        System.out.print("New Copied Array: ");
        for(int j = 0; j < NewArr.length; j++) {
            System.out.print(NewArr[j] + " ");
        }
        
    }
    
}