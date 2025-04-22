// Array merged without any duplicate elements
public class Practice_arrmergenoD {
    
    public static void main(String[] args) {
        int[] arr={1,2,3,4}, arr1={2,3,4,5};
        int[] arrM = new int[arr.length+arr1.length];
        int k=0;
        
        for(int i=0;i<arr.length;i++){
            arrM[k++] = arr[i];
        }
        
        for(int i=0;i<arr1.length;i++){
            boolean Duplicate = false;
            for(int j=0;j<k;j++) {
                if(arr1[i] == arrM[j]) {
                    Duplicate=true;
                    break;
                }
            }
            if(!Duplicate)
                arrM[k++] = arr1[i];
        }
        
        for(int i=0;i<k;i++){
            System.out.print(arrM[i] + " ");
        }
    }
    
}