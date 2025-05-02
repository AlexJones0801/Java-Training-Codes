// Single Level Inheritance

class Shape {
    void draw() {
        System.out.println("Drawing");
    }
}

class Circle extends Shape {
    void calculateArea(double r) { 
        System.out.println("Area: " + 3.14*r*r);
    }
}

public class Q3_ShapeInherit {
    
    public static void main(String[] args) {
        Circle s = new Circle();
        
        s.draw();
        s.calculateArea(5);
    }
    
}