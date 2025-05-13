class Shape {
    void draw(){
        System.out.println("Drawing a shape..");
    }
}

class Circle extends Shape {
    void draw(){
        super.draw(); // super keyword is use to call the immediate parent class
        System.out.println("Drawing a circle..");
    }
}

class Rectangle extends Shape {
    void draw(){
        // super.draw(); // super keyword is use to call the immediate parent class
        System.out.println("Drawing a rectangle..");
    }
}

public class Practice_Overriding2 {
    public static void main(String[] args) {
        Shape obj1 = new Circle();
        Shape obj2 = new Rectangle();
        
        obj1.draw();
        obj2.draw();
    }
}
