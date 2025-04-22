// Array Merged 
public class Practice_arrm {
    
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] arr1={2,3,4,5};
        int[] arrM = new int[arr.length+arr1.length];
        
        for(int i=0;i<arr.length;i++){
            arrM[i] = arr[i];
            arrM[arr.length+i] = arr1[i];
        }
        
        for(int i=0;i<arrM.length;i++){
            System.out.print(arrM[i] + " ");
        }
    }
    
}