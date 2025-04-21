
public class Practice_Sumof2dArrR {
    
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{2,3,4},{3,4,5}};
        int total=0;
        
        for(int i = 0; i < arr.length ; i++) {
            int sum=0;
            for(int j = 0; j < arr[i].length ; j++) {
                sum += arr[i][j];
            }
            System.out.println(sum);
            
            total += sum;
        }
        System.out.println("Sum of All elem: " + total);
    }
}
