/* Q5. Create an interface Vehicle with a default method start() that prints "Vehicle is starting...".
Create a class Car that implements Vehicle.
Call the default method from an object of Car in the main method. */

package pro;

interface Vehicle {
    default void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car implements Vehicle{
    // No need to override start() method here
    // as we are using the default implementation from Vehicle interface
}

public class Q5_InterfaceVehicle {
 public static void main(String[] args) {
    Car obj = new Car();
    obj.start();
 }   
}
