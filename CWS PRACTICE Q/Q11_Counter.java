class Counter {
    static int count=0;
    Counter() {
        count++;
    }
}

public class Q11_Counter {
    
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        
        System.out.println("Count after creating 3rd Object: " + Counter.count);
    }
    
}