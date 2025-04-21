
public class Q6_MinElem2dArr {
    
    public static void main(String[] args) {
        int[][] arr = {{11,2,3},{4,3,14},{3,6,2}};
        int max=arr[0][0],min=arr[0][0];
        
        for(int i = 0; i < arr.length ; i++) {
            for(int j = 0; j < arr[i].length ; j++) {
                if(min > arr[i][j])
                    min = arr[i][j];
            }
        }
        System.out.println("Minimum element of 2D Array: " + min);
    }
    
}