class Student{
    void sum(int n,int x) {
        System.out.println("sum = " + n+x);
    }
}

class cons {
    cons() {
        System.out.println("Constructor.");
    }
}

class FullName {
    String FirstName = "Rahul", LastName = "Patel";
    void name() {
        System.out.println(FirstName + " " + LastName);
    }
}

class rect {
    void rectangle(int l,int b) {
        System.out.println(l*b);
    }
}

class primeno {
    void prime(int a){
        int count = 0;
        for(int i=1; i<a;i++){
            if(a%i==0){
                count++;
            }
        }
        if(count==2)
            System.out.println("Prime");
        else 
            System.out.println("Not Prime");
    }
}

public class Practice_classes {
    
    public static void main(String[] args) {
        Student op = new Student();
        op.sum(3,8);
        
        cons obj = new cons();
        
        FullName fn = new FullName();
        fn.name();
        
        rect re = new rect();
        re.rectangle(5,8);
        
        primeno p = new primeno();
        p.prime(7);
    }
    
}