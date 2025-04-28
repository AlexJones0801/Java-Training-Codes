
public class Practice_method {
    static void print() {
        System.out.println("Hello, Static method");
    }
    
    // Non Static Method
    void hello() {
        System.out.println("Hello, Non Static method");
    }
    
    static int sum(int a) {
        a=17;
        return a;
    }
    
    
    public static void main(String[] args) {
        print(); // Static Method
        
        // Non Static Method
        Practice_method op = new Practice_method();
        op.hello();
        
        // Method arguments
        sum(10);
        int result = sum(5);
        System.out.println(result);
        
    }
    
}