// Array common elements count
public class Practice_arrc {
    
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] arr1={2,3,4,5};
        int count=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] == arr1[i])
                count++;
        }
        
        System.out.print("Common Elements Count: " + count);
    }
    
}