
public class Q3_RowWise2dArrSum {
    
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,6},{2,3,4},{3,4,8,2}};
        
        for(int i=0;i<arr.length;i++) {
            int rsum =0;
            for(int j=0;j<arr[i].length;j++) {
                rsum += arr[i][j];
            }
            System.out.println("Sum of Row " + i + ": " + rsum);
        }
    }
    
}