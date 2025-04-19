class Circle {
    double radius;
}
public class Q9_Circle {
    
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        
        c1.radius = 5.0;
        c2.radius = 7.5;
        System.out.println("Circumference of c1: "+ (2*3.14*c1.radius));
        System.out.println("Circumference of c2: "+ (2*3.14*c2.radius));
    }
    
}