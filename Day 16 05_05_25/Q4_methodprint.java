//Q4 Overload the method print in a class to accept a string and an integer argument.
class Print {
    void print() {
        System.out.println("default print");
    }

    void print(String str) {
        System.out.println("String name: " + str);
    }

    void print(int num) {
        System.out.println("Integer number: " + num);
    }

    void print(String str, int num) {
        System.out.println("String name: " + str + "\nInteger: " + num);
    }

}

public class Q4_methodprint {
    public static void main(String[] args) {
        Print obj = new Print();

        obj.print();
        obj.print("shivansh");
        obj.print(61);
        obj.print("Shivansh", 21);
    }
}
