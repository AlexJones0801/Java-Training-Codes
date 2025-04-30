class Circle {
    double radius;
    Circle(double r) {
        this.radius = r;
    }
    
    double calcArea() {
        return 3.14*radius*radius;
    }
    
    double calcCircum() {
        return 2*3.14*radius;
    }
    
    void showcalc() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calcArea());
        System.out.println("Circumference: " + calcCircum());
    }
}

public class Q5_Circle {
    
    public static void main(String[] args) {
        Circle c = new Circle(7.0);
        
        c.showcalc();
    }
    
}