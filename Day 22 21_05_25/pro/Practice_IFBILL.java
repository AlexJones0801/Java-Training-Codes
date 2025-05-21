package pro;

interface Client {
    void PrintBill();
    void show();
}

class ElecOffice implements Client {
    public void PrintBill() {
        System.out.println("Printing Bill...");
    }

    public void show() {
        System.out.println("Show the Bills..");
    }
}

public class Practice_IFBILL {
    public static void main(String[] args) {
        ElecOffice obj = new ElecOffice();
        obj.PrintBill();
        obj.show();
    }
}
