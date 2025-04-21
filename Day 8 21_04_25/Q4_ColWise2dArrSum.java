
public class Q4_ColWise2dArrSum {
    
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{2,3,4},{3,4,8}};
        
        for(int j=0;j<arr[0].length;j++) {
            int colsum =0;
            for(int i=0;i<arr.length;i++) {
                colsum += arr[i][j];
            }
            System.out.println("Sum of Column " + j + ": " + colsum);
        }
    }
    
}