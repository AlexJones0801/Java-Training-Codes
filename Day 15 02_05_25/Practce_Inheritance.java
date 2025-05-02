// Single Level Inheritance
class Animal {
    void eat() {
        System.out.println("Eatingg");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barkk");
    }
}

// Extends Single Level to Multi Level Inheritance
class ShihTzu extends Dog {
    void lazy() {
        System.out.println("Sleeping");
    }
}

// Heirarchical Inheritance
class Cat extends Animal {
    void meow() {
        System.out.println("meow meow meow meow");
    }
}

public class Practce_Inheritance {
    
    public static void main(String[] args) {
        ShihTzu stz = new ShihTzu();
        Cat ct = new Cat();
        
        stz.lazy();
        stz.bark();
        stz.eat();
        
        System.out.println("\nHeirarchical Inheritance: ");
        ct.eat();
        ct.meow();
    }
}