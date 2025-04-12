import java.util.*;
public class Q10_Add2Int2Float {
    
    public static void main(String[] args) {
        int intA,intB;
        float floatA,floatB;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Two Int Number: ");
        intA = in.nextInt();
        intB = in.nextInt();
        
        System.out.print("Enter Two Float Number: ");
        floatA = in.nextFloat();
        floatB = in.nextFloat();
        
        System.out.print("Adding All 4 Numbers: " + (intA + intB + floatA + floatB));
    }
    
}