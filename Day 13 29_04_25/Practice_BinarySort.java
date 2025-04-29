
public class Practice_BinarySort {
    static void BubbleSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++) {
            for(int j=0;j<arr.length-i-1;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0;i <arr.length;i++)
            System.out.print(arr[i] + " ");
    }
    
    static int BinarySearch(int[] arr, int target) {
        int end = arr.length-1, start=0;
        System.out.print("\n"+target);
        while(start<=end) {
            int mid = (start+end)/2;
            if(arr[mid]==target) {
                return mid;
            } else if(arr[mid]>target) {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return -1;
    } 
    
    
    public static void main(String[] args) {
        int[] arr = {4,3,5,7,3,6,13,0};
        BubbleSort(arr);
        //BinarySearch(arr,3);
        System.out.println(" Found at index: " + BinarySearch(arr,5));
        
    }
    
}