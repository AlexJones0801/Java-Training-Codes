package pro;

interface A {
    void show();
}

interface B {
    void show();
    void PrintNew();
}

public class Practice_Interface implements A, B {

    public void show() {
        System.out.println("This is common feature of A and B");
    }

    public void PrintNew() {
        System.out.println("Print The Data ");
    }

    public static void main(String[] args) {
        Practice_Interface obj = new Practice_Interface();
        obj.show();
        obj.PrintNew();

    }
}