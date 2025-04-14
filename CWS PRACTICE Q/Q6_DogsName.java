class Dog {
    String name;
}

public class Q6_DogsName {
    public static void main(String[] args) {
        Dog dg1 = new Dog();
        Dog dg2 = new Dog();
        Dog dg3 = new Dog();
        dg1.name = "Goodyear";
        dg2.name = "Jeffy";
        dg3.name = "Max";
        System.out.println("Dog 1: " + dg1.name + "\nDog 2: " + dg2.name + "\nDog 3: " + dg3.name);
    }
    
}