// Create a class that has overloaded methods for displaying the area of different shapes.
class Shapes {
    void calculateArea(int r) {
        System.out.println("Area of circle: " + 3.14*r*r);
    }
    
    void calculateArea(int l,int b){
        System.out.println("Area of Rectangle: " + l*b);
    }
    
    void calculateArea(double b,double h){
        System.out.println("Area of Triangle: " + (1/2)*b+h);
    }
}

public class Q2_methodshape {
    
    public static void main(String[] args) {
        Shapes ob = new Shapes();
        
        ob.calculateArea(5);
        ob.calculateArea(15,10);
        ob.calculateArea(52.7,23.5);
    }
    
}