
public class Practice_LinearSearch {
    static int targetSum(int[] arr) {
        int target=8;
        for(int i=0;i < arr.length; i++) {
            if(arr[i]==target)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={2,5,1,8,0};
        System.out.println(targetSum(arr));
    }
    
}