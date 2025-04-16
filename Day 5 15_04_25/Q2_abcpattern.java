
public class Q2_abcpattern {
    
    public static void main(String[] args) {
        //ABCD Pattern
        System.out.println("ABCD Pattern: ");
        for(int i=65;i<=78;i++) {
            for(int j=65;j<=i;j++){
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
    
}