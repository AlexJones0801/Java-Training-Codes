class Car {
    static int wheels = 4;
    String color;
}

public class Q14_Car2 {
    
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        
        c1.color = "Blue";
        c2.color = "Black";
        
        System.out.println("Car 1 color: " + c1.color + " , Wheels = " + Car.wheels);
        System.out.println("Car 2 color: " + c2.color + " , Wheels = " + Car.wheels);
    }
    
}