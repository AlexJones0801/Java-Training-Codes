// Q1 Create  an  abstract  class  'Shape'  with  an  abstract  method  'area()'.  Implement  two  subclasses 'Circle' and 'Rectangle'.

abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void area() {
        System.out.println("Area of Circle: " + Math.PI * radius * radius);
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void area() {
        System.out.println("Area of Rectangle: " + length * breadth);
    }
}

public class Q1_AbstractShape {
    public static void main(String[] args) {
        Shape circle = new Circle(8);
        circle.area();

        Shape rect = new Rectangle(4, 6);
        rect.area();
    }
}