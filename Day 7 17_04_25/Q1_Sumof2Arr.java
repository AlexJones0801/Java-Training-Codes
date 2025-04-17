public class Q1_Sumof2Arr {
    
    public static void main(String[] args) {
        int[] arr1 = {1,2,3}, arr2 = {4,5,6};
        int[] sum = new int[arr1.length];
        
        for(int i=0;i<arr1.length;i++) {
            sum[i] = arr1[i] + arr2[i];
        }
        
        System.out.print("Sum array: ");
        for(int i=0;i<sum.length;i++){
            System.out.print(sum[i] + " ");
        }
    }
    
}