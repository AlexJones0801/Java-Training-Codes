class Method {
    void sum(int a,int b) {
        System.out.println(a+b);
    }
    
    void sum(int a,int b,int c) {
        System.out.println(a+b+c);
    }
    void sum(double a,double b) {
        System.out.println(a+b);
    }
}

public class Q1_method {
    
    public static void main(String[] args) {
        Method obj = new Method();
        
        obj.sum(400,30);
        obj.sum(320,30,50);
        obj.sum(200.5,25.5);
    }
}