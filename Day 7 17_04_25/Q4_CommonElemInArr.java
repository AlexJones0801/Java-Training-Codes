
public class Q4_CommonElemInArr {
    
    public static void main(String[] args) {
        int[] arr1 = {1,2,4,3}, arr2 = {4,5,1,2};
        
        for(int i=0;i<arr1.length;i++) {
            for(int j=0;j<arr2.length;j++) {
                if(arr1[i]==arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
    }
    
}