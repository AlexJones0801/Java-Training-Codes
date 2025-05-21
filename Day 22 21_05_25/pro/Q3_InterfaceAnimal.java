/* Q3. Create an interface Animal with a method makeSound().
Then, create a class Dog that implements Animal and overrides makeSound() to print "Bark".
In the main method, use the interface reference to call the method from Dog. */

package pro;

interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Bark");
    }
}

public class Q3_InterfaceAnimal {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.makeSound();
    }
}
