abstract class Payment {
    abstract void pay(int a);

    void success() {
        System.out.println("Payment done");
    }
}

class UpiPayment extends Payment {
    void pay(int a) {
        System.out.println("pay vai Upi" + a);
    }
}

class NetBanking extends Payment {
    void pay(int b){
        System.out.println("pay vai NetBanking" + b);
    }
}

public class Practice_AbstractClass {
    public static void main(String[] args) {
        Payment upiobj = new UpiPayment();  // Run time polymorphism
        upiobj.pay(25000);
        upiobj.success();

        Payment netobj = new NetBanking();
        netobj.pay(55000);
        netobj.success();
    }
}