class Method {
    void sum(int a) {
        System.out.println("main ho don no. " + a);
    }
    
    void sum(int a,int b) {
        System.out.println(a+b);
    }
    
    void sum(int a,int b,int c) {
        System.out.println(a+b+c);
    }
}

public class Practice_MethodOverloading {
    
    public static void main(String[] args) {
        Method obj = new Method();
        
        obj.sum(420);
        obj.sum(400,30);
        obj.sum(320,30,50);
    }
    
}