
public class Practice_findingmissingNoArr {
    
    public static void main(String[] args) {
        int[] arr = {3,0,1,2,5};
        int sum=0,max=arr[0],n;
        
        for(int i=0;i < arr.length;i++) {
            sum += arr[i];
            if(arr[i]>max)
                max=arr[i];
        }
        
        n = max*(max+1)/2;
        
        System.out.println(n-sum);
    }
    
}