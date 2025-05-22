package pro;

public class Practice_ExceptionHandling {
    public static void main(String[] args) {
        int a = 10, b = 0;
        try {
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(a + " / " + b + " (we can not divide by zero)");
        }

        System.out.println("This is the example of Exception Handling.");
    }
}
