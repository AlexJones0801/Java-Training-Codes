class Calculator {
    double add (double a, double b) {
        return a + b;
    }
        
    double subtract (double a, double b) {
        return a - b;
    }
        
    double multiply (double a, double b) {
        return a * b;
    }
        
    double divide (double a, double b) {
        if(b!=0)
            return a/b;
        else {
            System.out.println("Error: Divison by Zero");
            return 0;
        }
    }    
        
}

public class Q9_Calculator {
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Addition: " + calc.add(55, 10));
        System.out.println("Subtraction: " + calc.subtract(30, 25));
        System.out.println("Multiplication: " + calc.multiply(15, 8));
        System.out.println("Division: " + calc.divide(15, 3));
    }
}