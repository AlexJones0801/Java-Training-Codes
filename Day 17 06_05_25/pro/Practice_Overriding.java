package pro;
class Vechile {
    void run() {
        System.out.println("Running..");
    }
}

class Bike extends Vechile {
    void run() {
        super.run(); // super keyword is use to call the immediate parent class
        System.out.println("Overrided class Running..");
    }
}

public class Practice_Overriding {
    public static void main(String[] args) {
        Vechile obj = new Bike();

        obj.run();
    }
}
