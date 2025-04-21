
public class Practice_2dTo1dArr {
    
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{2,3,4},{3,4,5}};
        int total=0,k=0;
        
        for(int i = 0; i < arr.length ; i++) {
                total += arr[i].length;
        }
        
        int[] arr1 = new int[total];
        
        for(int i =0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                arr1[k] = arr[i][j];
                k++;
            }
        }
        
        for(int f = 0; f < arr1.length ; f++) {
                System.out.print(arr1[f]);
        }
        System.out.println();
    }
    
}