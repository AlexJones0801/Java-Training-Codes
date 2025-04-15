
public class Q1_pattern {
    
    public static void main(String[] args) {
        
        //Rectangle Pattern
        System.out.println("Rectangle Pattern: ");
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=5;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        
        
        //Triangle Pattern
        System.out.println("\n\nTriangle Pattern: ");
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        
        
        //Y-Flip-Triangle Pattern
        System.out.println("\n\nY-Flip-Triangle Pattern: ");
        for(int i=1;i<=5;i++) {
            for(int j=5;j>=i;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
        
        
        //X-Flip-Triangle Pattern
        System.out.println("\n\nX-Flip-Triangle Pattern: ");
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            
            for(int k=5;k>=i;k--){
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        //Pyramid Pattern
        System.out.println("\n\nPyramid Pattern: ");
        for(int i=1;i<=5;i++) {
            for(int j=5;j>=i;j--){
                System.out.print(" ");
            }
            
            for(int k=1;k<i;k++){
                System.out.print("*");
            }
            
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        //Inverse-Pyramid Pattern
        System.out.println("\n\nInverse-Pyramid Pattern: ");
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            
            for(int k=5;k>i;k--){
                System.out.print("*");
            }
            
            for(int k=5;k>=i;k--){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
    
}