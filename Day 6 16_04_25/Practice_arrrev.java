
public class Practice_arrrev {
    
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int rev = arr.length-1;
        for(int i=rev;i>=0;i-- ) {
            System.out.print(arr[i]);
        }
    }
    
}