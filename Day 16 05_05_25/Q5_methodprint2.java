// The method should print the string and then print the square of the integer.

class Print2 {
    void print() {
        System.out.println("default print");
    }

    void print(String str) {
        System.out.println("String name: " + str);
    }

    void print(int num) {
        System.out.println("Integer: " + num * num);
    }

}

public class Q5_methodprint2 {
    public static void main(String[] args) {
        Print2 obj1 = new Print2();

        obj1.print();
        obj1.print("shivansh");
        obj1.print(22);
    }
}