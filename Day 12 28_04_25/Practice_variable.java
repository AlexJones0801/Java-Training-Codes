
public class Practice_variable {
    int a = 27; // Non static variable
    static int b = 61; // Non static variable
    
    public static void main(String[] args) {
        Practice_variable op = new Practice_variable();
        
        // Non static variable
        System.out.println(op.a);
        
        // static variable
        System.out.println(b);
        
        // Local variable
        int local = 4;
        System.out.println(local);
    }
    
}