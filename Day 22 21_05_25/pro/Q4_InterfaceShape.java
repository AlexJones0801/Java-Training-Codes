/* Q4. Create an interface Shape with a method area().
Then, create a class Circle that implements Shape and calculates the area using radius = 5.
Print the area in the main method. */

package pro;

interface Shape {
    void area();
}

class circle implements Shape {
    public void area() {
        double radius = 5;
        System.out.println("Area of Circle: " + 3.14 * radius*radius);
    }
}

public class Q4_InterfaceShape {
    public static void main(String[] args) {
        circle c = new circle();
        c.area();
    }
}
