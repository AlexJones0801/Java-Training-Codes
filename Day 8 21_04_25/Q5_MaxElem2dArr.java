
public class Q5_MaxElem2dArr {
    
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,32,4},{3,6,7}};
        int max=arr[0][0],min=arr[0][0];
        
        for(int i = 0; i < arr.length ; i++) {
            for(int j = 0; j < arr[i].length ; j++) {
                if(max < arr[i][j])
                    max = arr[i][j];
            }
        }
        System.out.println("Maximum element of 2D Array: " + max);
    }
    
}