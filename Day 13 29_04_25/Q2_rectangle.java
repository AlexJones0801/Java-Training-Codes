class Rectangle {
    void area(int l,int b) {
        System.out.println("Area: " + l*b);
    }
    void perimeter(int l,int b) {
        System.out.println("Perimeter: " + 2*(l+b));
    }
}
public class Q2_rectangle {
    
    public static void main(String[] args) {
        Rectangle re1 = new Rectangle();
        Rectangle re2 = new Rectangle();
        
        System.out.println("Rectangle 1: ");
        re1.area(5,3);
        re1.perimeter(5,3);
        
        System.out.println("\nRectangle 2: ");
        re2.area(7,4);
        re2.perimeter(7,4);
    }
    
}