// Q2 Create an abstract class 'Animal' with method 'sound()'. Create classes 'Dog' and 'Cat' that extend it and implement the sound method.

abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog Barkinggg...");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meow..meow..meow...");
    }
}

public class Q2_AbstractClassAnimal {

    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.sound();

        Animal obj1 = new Cat();
        obj1.sound();
    }
}