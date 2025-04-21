
public class Q2_SumofAllElem2dArr {
    
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,6},{2,3,4},{3,4,8,2}};
        int sum=0;
        
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                sum += arr[i][j];
            }
        }
        
        System.out.println("Sum of All Elements: " + sum);
    }
    
}