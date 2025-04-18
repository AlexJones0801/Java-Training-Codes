
public class Q3_Merge2Arr {
    
    public static void main(String[] args) {
        int[] arr1 = {1,2,3}, arr2 = {4,5,6};
        int[] merged = new int[arr1.length + arr1.length];
        
        for(int i=0;i<arr1.length;i++){
            merged[i] = arr1[i];
            merged[arr1.length+i] = arr2[i];
        }
        
        System.out.println("Merged array: ");
        for(int i=0;i<merged.length;i++){
            System.out.print(merged[i] + " ");
        }
    }
    
}