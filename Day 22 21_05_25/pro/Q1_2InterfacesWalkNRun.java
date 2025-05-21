/* Q1. Create two interfaces Walkable and Runnable. Each should have a method: walk() and run() respectively.
Then, create a class Human that implements both interfaces and defines both methods.
Create a main method where an object of Human is created and both methods are called. */

package pro;

interface Walkable {
    void walk();
}

interface Runnable {
    void run();
}

class Human implements Walkable, Runnable {
    public void walk() {
        System.out.println("Human is walking");
    }

    public void run() {
        System.out.println("Human is running");
    }
}

public class Q1_2InterfacesWalkNRun {
    public static void main(String[] args) { 
        Human h = new Human();
        h.walk();
        h.run();    
    }
}