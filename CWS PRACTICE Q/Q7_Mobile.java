class Mobile {
    String brand, model;
}

public class Q7_Mobile {
    
    public static void main(String[] args) {
        Mobile mb1 = new Mobile();
        Mobile mb2 = new Mobile();

        mb1.brand = "Samsung";
        mb1.model = "Galaxy S20";

        mb2.brand = "Apple";
        mb2.model = "iPhone 15";

        System.out.println("Mobile 1: " + mb1.brand + " " + mb1.model);
        System.out.println("Mobile 2: " + mb2.brand + " " + mb2.model);
    }
}