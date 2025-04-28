
public class Practice_BubbleSort {
    static int BubbleSort(int[] arr) {
        for(int i=0;i < arr.length-1; i++) {
            for(int j=0;j < arr.length-i-1; j++)
                if(arr[i]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        }
        return 0;
    }
    
    public static void main(String[] args) {
        int[] arr={2,5,1,28,0,55};
        BubbleSort(arr);
        
        for(int i : arr)
            System.out.print(i + " ");
    }
    
}